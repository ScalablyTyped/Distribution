package typings.typedDashGraphql.graphqlMod

import typings.typedDashGraphql.typedDashGraphqlStrings.INTERFACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionInterfaceType extends IntrospectionType {
  var description: js.UndefOr[String] = js.undefined
  var fields: js.Array[IntrospectionField]
  var kind: INTERFACE
  var name: String
  var possibleTypes: js.Array[IntrospectionNamedTypeRef]
}

object IntrospectionInterfaceType {
  @scala.inline
  def apply(
    fields: js.Array[IntrospectionField],
    kind: INTERFACE,
    name: String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef],
    description: String = null
  ): IntrospectionInterfaceType = {
    val __obj = js.Dynamic.literal(fields = fields, kind = kind, name = name, possibleTypes = possibleTypes)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[IntrospectionInterfaceType]
  }
}

