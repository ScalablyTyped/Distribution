package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionSet
  extends StObject
     with Node {
  
  var kind: String
  
  var loc: js.UndefOr[Location] = js.undefined
  
  var selections: js.Array[Selection]
}
object SelectionSet {
  
  inline def apply(kind: String, selections: js.Array[Selection]): SelectionSet = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionSet]
  }
  
  extension [Self <: SelectionSet](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setSelections(value: js.Array[Selection]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
    
    inline def setSelectionsVarargs(value: Selection*): Self = StObject.set(x, "selections", js.Array(value*))
  }
}
