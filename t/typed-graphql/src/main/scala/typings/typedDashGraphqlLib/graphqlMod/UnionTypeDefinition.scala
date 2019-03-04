package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnionTypeDefinition
  extends TypeDefinition
     with Node {
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
  var types: js.Array[NamedType]
}

object UnionTypeDefinition {
  @scala.inline
  def apply(kind: java.lang.String, name: Name, types: js.Array[NamedType], loc: Location = null): UnionTypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind, name = name, types = types)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[UnionTypeDefinition]
  }
}

