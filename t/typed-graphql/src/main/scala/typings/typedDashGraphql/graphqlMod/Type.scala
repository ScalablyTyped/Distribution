package typings.typedDashGraphql.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Type Reference
/* Rewritten from type alias, can be one of: 
  - typings.typedDashGraphql.graphqlMod.NamedType
  - typings.typedDashGraphql.graphqlMod.ListType
  - typings.typedDashGraphql.graphqlMod.NonNullType
*/
trait Type extends js.Object

object Type {
  @scala.inline
  def NamedType(kind: String, name: Name, loc: Location = null): Type = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  def ListType(kind: String, `type`: Type, loc: Location = null): Type = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  def NonNullType(kind: String, `type`: NamedType | ListType, loc: Location = null): Type = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

