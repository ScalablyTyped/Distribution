package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typedGraphql.mod.Field
  - typings.typedGraphql.mod.FragmentSpread
  - typings.typedGraphql.mod.InlineFragment
*/
trait Selection extends StObject
object Selection {
  
  @scala.inline
  def Field(kind: String, name: Name): typings.typedGraphql.mod.Field = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.Field]
  }
  
  @scala.inline
  def FragmentSpread(kind: String, name: Name): typings.typedGraphql.mod.FragmentSpread = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.FragmentSpread]
  }
  
  @scala.inline
  def InlineFragment(kind: String, selectionSet: SelectionSet): typings.typedGraphql.mod.InlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typedGraphql.mod.InlineFragment]
  }
}
