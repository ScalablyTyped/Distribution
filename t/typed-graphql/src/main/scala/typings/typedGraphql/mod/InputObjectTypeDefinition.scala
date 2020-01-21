package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputObjectTypeDefinition
  extends TypeDefinition
     with Node {
  var fields: js.Array[InputValueDefinition]
  var kind: String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
}

object InputObjectTypeDefinition {
  @scala.inline
  def apply(fields: js.Array[InputValueDefinition], kind: String, name: Name, loc: Location = null): InputObjectTypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputObjectTypeDefinition]
  }
}

