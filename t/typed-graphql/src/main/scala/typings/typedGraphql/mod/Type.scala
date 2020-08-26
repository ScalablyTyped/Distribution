package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Type Reference
/* Rewritten from type alias, can be one of: 
  - typings.typedGraphql.mod.NamedType
  - typings.typedGraphql.mod.ListType
  - typings.typedGraphql.mod.NonNullType
*/
trait Type extends js.Object

object Type {
  @scala.inline
  def NamedType(kind: String, name: Name): Type = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  def ListType(kind: String, `type`: Type): Type = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  def NonNullType(kind: String, `type`: NamedType | ListType): Type = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

