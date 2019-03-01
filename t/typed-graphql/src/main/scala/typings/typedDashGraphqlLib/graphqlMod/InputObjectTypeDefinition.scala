package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputObjectTypeDefinition
  extends TypeDefinition
     with Node {
  var fields: js.Array[InputValueDefinition]
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
}

object InputObjectTypeDefinition {
  @scala.inline
  def apply(fields: js.Array[InputValueDefinition], kind: java.lang.String, name: Name, loc: Location = null): InputObjectTypeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[InputObjectTypeDefinition]
  }
}

