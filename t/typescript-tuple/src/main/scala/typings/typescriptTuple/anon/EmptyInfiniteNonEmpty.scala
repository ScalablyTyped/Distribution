package typings.typescriptTuple.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmptyInfiniteNonEmpty[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */] extends StObject {
  
  var empty: Holder = js.native
  
  var infinite: js.Any = js.native
  
  var nonEmpty: js.Any = js.native
}
object EmptyInfiniteNonEmpty {
  
  @scala.inline
  def apply[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */](empty: Holder, infinite: js.Any, nonEmpty: js.Any): EmptyInfiniteNonEmpty[Holder, Tuple] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyInfiniteNonEmpty[Holder, Tuple]]
  }
  
  @scala.inline
  implicit class EmptyInfiniteNonEmptyMutableBuilder[Self <: EmptyInfiniteNonEmpty[_, _], Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */] (val x: Self with (EmptyInfiniteNonEmpty[Holder, Tuple])) extends AnyVal {
    
    @scala.inline
    def setEmpty(value: Holder): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfinite(value: js.Any): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonEmpty(value: js.Any): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
  }
}
