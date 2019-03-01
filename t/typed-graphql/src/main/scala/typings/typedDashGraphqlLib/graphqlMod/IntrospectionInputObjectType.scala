package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionInputObjectType extends IntrospectionType {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var inputFields: js.Array[IntrospectionInputValue]
  var kind: typedDashGraphqlLib.typedDashGraphqlLibStrings.INPUT_OBJECT
  var name: java.lang.String
}

object IntrospectionInputObjectType {
  @scala.inline
  def apply(
    inputFields: js.Array[IntrospectionInputValue],
    kind: typedDashGraphqlLib.typedDashGraphqlLibStrings.INPUT_OBJECT,
    name: java.lang.String,
    description: java.lang.String = null
  ): IntrospectionInputObjectType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inputFields")(inputFields)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[IntrospectionInputObjectType]
  }
}

