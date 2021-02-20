package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionSet extends Node {
  
  var kind: String = js.native
  
  var loc: js.UndefOr[Location] = js.native
  
  var selections: js.Array[Selection] = js.native
}
object SelectionSet {
  
  @scala.inline
  def apply(kind: String, selections: js.Array[Selection]): SelectionSet = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionSet]
  }
  
  @scala.inline
  implicit class SelectionSetMutableBuilder[Self <: SelectionSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setSelections(value: js.Array[Selection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionsVarargs(value: Selection*): Self = StObject.set(x, "selections", js.Array(value :_*))
  }
}
