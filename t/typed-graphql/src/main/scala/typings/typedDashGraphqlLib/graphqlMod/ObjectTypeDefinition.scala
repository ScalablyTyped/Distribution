package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectTypeDefinition
  extends TypeDefinition
     with Node {
  var fields: js.Array[FieldDefinition]
  var interfaces: js.UndefOr[js.Array[NamedType]] = js.undefined
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
}

object ObjectTypeDefinition {
  @scala.inline
  def apply(
    fields: js.Array[FieldDefinition],
    kind: java.lang.String,
    name: Name,
    interfaces: js.Array[NamedType] = null,
    loc: Location = null
  ): ObjectTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields, kind = kind, name = name)
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ObjectTypeDefinition]
  }
}

