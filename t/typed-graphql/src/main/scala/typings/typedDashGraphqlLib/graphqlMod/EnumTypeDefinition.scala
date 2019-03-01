package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumTypeDefinition
  extends TypeDefinition
     with Node {
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
  var values: js.Array[EnumValueDefinition]
}

object EnumTypeDefinition {
  @scala.inline
  def apply(kind: java.lang.String, name: Name, values: js.Array[EnumValueDefinition], loc: Location = null): EnumTypeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("values")(values)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[EnumTypeDefinition]
  }
}

