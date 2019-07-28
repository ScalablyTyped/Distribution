package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterfaceTypeDefinition
  extends TypeDefinition
     with Node {
  var fields: js.Array[FieldDefinition]
  var kind: String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
}

object InterfaceTypeDefinition {
  @scala.inline
  def apply(fields: js.Array[FieldDefinition], kind: String, name: Name, loc: Location = null): InterfaceTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields, kind = kind, name = name)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[InterfaceTypeDefinition]
  }
}

