package typings.typescriptTuple.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Finite[Holder /* <: js.Array[js.Any] */, Tuple /* <: js.Array[js.Any] */] extends StObject {
  
  var finite: js.Tuple2[Tuple, js.Array[js.Any]]
  
  var matched: js.Tuple2[Holder, Tuple]
  
  var unmatched: js.Any
}
object Finite {
  
  inline def apply[Holder /* <: js.Array[js.Any] */, Tuple /* <: js.Array[js.Any] */](finite: js.Tuple2[Tuple, js.Array[js.Any]], matched: js.Tuple2[Holder, Tuple], unmatched: js.Any): Finite[Holder, Tuple] = {
    val __obj = js.Dynamic.literal(finite = finite.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any], unmatched = unmatched.asInstanceOf[js.Any])
    __obj.asInstanceOf[Finite[Holder, Tuple]]
  }
  
  extension [Self <: Finite[?, ?], Holder /* <: js.Array[js.Any] */, Tuple /* <: js.Array[js.Any] */](x: Self & (Finite[Holder, Tuple])) {
    
    inline def setFinite(value: js.Tuple2[Tuple, js.Array[js.Any]]): Self = StObject.set(x, "finite", value.asInstanceOf[js.Any])
    
    inline def setMatched(value: js.Tuple2[Holder, Tuple]): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
    
    inline def setUnmatched(value: js.Any): Self = StObject.set(x, "unmatched", value.asInstanceOf[js.Any])
  }
}
