package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionEnumType extends IntrospectionType {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var enumValues: js.Array[IntrospectionEnumValue]
  var kind: typedDashGraphqlLib.typedDashGraphqlLibStrings.ENUM
  var name: java.lang.String
}

object IntrospectionEnumType {
  @scala.inline
  def apply(
    enumValues: js.Array[IntrospectionEnumValue],
    kind: typedDashGraphqlLib.typedDashGraphqlLibStrings.ENUM,
    name: java.lang.String,
    description: java.lang.String = null
  ): IntrospectionEnumType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enumValues")(enumValues)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[IntrospectionEnumType]
  }
}

