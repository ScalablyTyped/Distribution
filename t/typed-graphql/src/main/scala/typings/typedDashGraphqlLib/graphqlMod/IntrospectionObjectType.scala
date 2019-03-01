package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionObjectType extends IntrospectionType {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var fields: js.Array[IntrospectionField]
  var interfaces: js.Array[IntrospectionNamedTypeRef]
  var kind: typedDashGraphqlLib.typedDashGraphqlLibStrings.OBJECT
  var name: java.lang.String
}

object IntrospectionObjectType {
  @scala.inline
  def apply(
    fields: js.Array[IntrospectionField],
    interfaces: js.Array[IntrospectionNamedTypeRef],
    kind: typedDashGraphqlLib.typedDashGraphqlLibStrings.OBJECT,
    name: java.lang.String,
    description: java.lang.String = null
  ): IntrospectionObjectType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("interfaces")(interfaces)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[IntrospectionObjectType]
  }
}

