package typings.typescriptTuple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfiniteArray[Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */, Replacement] extends js.Object {
  
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
  implicit class InfiniteArrayOps[Self <: InfiniteArray[_, _, _], Holder /* <: js.Array[_] */, Tuple /* <: js.Array[_] */, Replacement] (val x: Self with (InfiniteArray[Holder, Tuple, Replacement])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEmpty(value: Holder): Self = this.set("empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfiniteVarargs(value: Replacement*): Self = this.set("infinite", js.Array(value :_*))
    
    @scala.inline
    def setInfinite(value: js.Array[Replacement]): Self = this.set("infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonEmpty(value: js.Any): Self = this.set("nonEmpty", value.asInstanceOf[js.Any])
  }
}
