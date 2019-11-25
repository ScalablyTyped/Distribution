package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnionTypeDefinition
  extends TypeDefinition
     with Node {
  var kind: String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
  var types: js.Array[NamedType]
}

object UnionTypeDefinition {
  @scala.inline
  def apply(kind: String, name: Name, types: js.Array[NamedType], loc: Location = null): UnionTypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionTypeDefinition]
  }
}

