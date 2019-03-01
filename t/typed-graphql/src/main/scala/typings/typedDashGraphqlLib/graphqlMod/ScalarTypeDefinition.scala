package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalarTypeDefinition
  extends TypeDefinition
     with Node {
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
}

object ScalarTypeDefinition {
  @scala.inline
  def apply(kind: java.lang.String, name: Name, loc: Location = null): ScalarTypeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[ScalarTypeDefinition]
  }
}

