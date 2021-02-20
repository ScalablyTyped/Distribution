package typings.typescriptTuple.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Empty[Finite, Tuple /* <: js.Array[_] */, Infinite] extends StObject {
  
  var empty: Finite = js.native
  
  var infinite: Infinite = js.native
  
  var nonEmpty: js.Any = js.native
}
object Empty {
  
  @scala.inline
  def apply[Finite, Tuple /* <: js.Array[_] */, Infinite](empty: Finite, infinite: Infinite, nonEmpty: js.Any): Empty[Finite, Tuple, Infinite] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Empty[Finite, Tuple, Infinite]]
  }
  
  @scala.inline
  implicit class EmptyMutableBuilder[Self <: Empty[_, _, _], Finite, Tuple /* <: js.Array[_] */, Infinite] (val x: Self with (Empty[Finite, Tuple, Infinite])) extends AnyVal {
    
    @scala.inline
    def setEmpty(value: Finite): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfinite(value: Infinite): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonEmpty(value: js.Any): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
  }
}
