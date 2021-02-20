package typings.typescriptTuple.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Finite[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */] extends StObject {
  
  var finite: js.Tuple2[Tuple, js.Array[js.Any]] = js.native
  
  var matched: js.Tuple2[Holder, Tuple] = js.native
  
  var unmatched: js.Any = js.native
}
object Finite {
  
  @scala.inline
  def apply[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */](finite: js.Tuple2[Tuple, js.Array[js.Any]], matched: js.Tuple2[Holder, Tuple], unmatched: js.Any): Finite[Holder, Tuple] = {
    val __obj = js.Dynamic.literal(finite = finite.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any], unmatched = unmatched.asInstanceOf[js.Any])
    __obj.asInstanceOf[Finite[Holder, Tuple]]
  }
  
  @scala.inline
  implicit class FiniteMutableBuilder[Self <: Finite[_, _], Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */] (val x: Self with (Finite[Holder, Tuple])) extends AnyVal {
    
    @scala.inline
    def setFinite(value: js.Tuple2[Tuple, js.Array[js.Any]]): Self = StObject.set(x, "finite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatched(value: js.Tuple2[Holder, Tuple]): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmatched(value: js.Any): Self = StObject.set(x, "unmatched", value.asInstanceOf[js.Any])
  }
}
