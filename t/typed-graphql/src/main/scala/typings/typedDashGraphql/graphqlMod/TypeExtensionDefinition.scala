package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeExtensionDefinition
  extends TypeDefinition
     with Node {
  var definition: ObjectTypeDefinition
  var kind: String
  var loc: js.UndefOr[Location] = js.undefined
}

object TypeExtensionDefinition {
  @scala.inline
  def apply(definition: ObjectTypeDefinition, kind: String, loc: Location = null): TypeExtensionDefinition = {
    val __obj = js.Dynamic.literal(definition = definition, kind = kind)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[TypeExtensionDefinition]
  }
}

