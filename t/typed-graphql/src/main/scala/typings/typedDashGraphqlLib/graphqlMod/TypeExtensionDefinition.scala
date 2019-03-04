package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeExtensionDefinition
  extends TypeDefinition
     with Node {
  var definition: ObjectTypeDefinition
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
}

object TypeExtensionDefinition {
  @scala.inline
  def apply(definition: ObjectTypeDefinition, kind: java.lang.String, loc: Location = null): TypeExtensionDefinition = {
    val __obj = js.Dynamic.literal(definition = definition, kind = kind)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[TypeExtensionDefinition]
  }
}

