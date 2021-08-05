package typings.typescriptTuple.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyInfiniteNonEmpty[Holder /* <: js.Array[js.Any] */, Tuple /* <: js.Array[js.Any] */] extends StObject {
  
  var empty: Holder
  
  var infinite: js.Any
  
  var nonEmpty: js.Any
}
object EmptyInfiniteNonEmpty {
  
  inline def apply[Holder /* <: js.Array[js.Any] */, Tuple /* <: js.Array[js.Any] */](empty: Holder, infinite: js.Any, nonEmpty: js.Any): EmptyInfiniteNonEmpty[Holder, Tuple] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyInfiniteNonEmpty[Holder, Tuple]]
  }
  
  extension [Self <: EmptyInfiniteNonEmpty[?, ?], Holder /* <: js.Array[js.Any] */, Tuple /* <: js.Array[js.Any] */](x: Self & (EmptyInfiniteNonEmpty[Holder, Tuple])) {
    
    inline def setEmpty(value: Holder): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setInfinite(value: js.Any): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    inline def setNonEmpty(value: js.Any): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
  }
}
