package typings.typescriptTuple.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfiniteArray[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */, Replacement] extends StObject {
  
  var empty: Holder = js.native
  
  var infinite: js.Array[Replacement] = js.native
  
  var nonEmpty: js.Any = js.native
}
object InfiniteArray {
  
  @scala.inline
  def apply[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */, Replacement](empty: Holder, infinite: js.Array[Replacement], nonEmpty: js.Any): InfiniteArray[Holder, Tuple, Replacement] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfiniteArray[Holder, Tuple, Replacement]]
  }
  
  @scala.inline
  implicit class InfiniteArrayMutableBuilder[Self <: InfiniteArray[_, _, _], Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */, Replacement] (val x: Self with (InfiniteArray[Holder, Tuple, Replacement])) extends AnyVal {
    
    @scala.inline
    def setEmpty(value: Holder): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfinite(value: js.Array[Replacement]): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfiniteVarargs(value: Replacement*): Self = StObject.set(x, "infinite", js.Array(value :_*))
    
    @scala.inline
    def setNonEmpty(value: js.Any): Self = StObject.set(x, "nonEmpty", value.asInstanceOf[js.Any])
  }
}
