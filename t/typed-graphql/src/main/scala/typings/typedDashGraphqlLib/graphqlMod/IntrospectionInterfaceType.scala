package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionInterfaceType extends IntrospectionType {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var fields: js.Array[IntrospectionField]
  var kind: typedDashGraphqlLib.typedDashGraphqlLibStrings.INTERFACE
  var name: java.lang.String
  var possibleTypes: js.Array[IntrospectionNamedTypeRef]
}

object IntrospectionInterfaceType {
  @scala.inline
  def apply(
    fields: js.Array[IntrospectionField],
    kind: typedDashGraphqlLib.typedDashGraphqlLibStrings.INTERFACE,
    name: java.lang.String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef],
    description: java.lang.String = null
  ): IntrospectionInterfaceType = {
    val __obj = js.Dynamic.literal(fields = fields, kind = kind, name = name, possibleTypes = possibleTypes)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[IntrospectionInterfaceType]
  }
}

