package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.typedGraphql.mod.Field
  - typings.typedGraphql.mod.FragmentSpread
  - typings.typedGraphql.mod.InlineFragment
*/
trait Selection extends js.Object

object Selection {
  @scala.inline
  def Field(kind: String, name: Name): Selection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  @scala.inline
  def FragmentSpread(kind: String, name: Name): Selection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  @scala.inline
  def InlineFragment(kind: String, selectionSet: SelectionSet): Selection = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
}

