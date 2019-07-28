package typings.typedDashGraphql.graphqlMod

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
    val __obj = js.Dynamic.literal(fields = fields, kind = kind, name = name)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[InputObjectTypeDefinition]
  }
}

