package typings.typedGraphql.mod

import typings.typedGraphql.typedGraphqlStrings.INTERFACE
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
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionInterfaceType]
  }
}

