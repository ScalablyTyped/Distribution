package typings.useSidecar.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SidePush[T] extends js.Object {
  
  def filter(cb: js.Function1[/* x */ T, Boolean]): SidePush[T] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  def push(data: T): Unit = js.native
}
object SidePush {
  
  @scala.inline
  def apply[T](filter: js.Function1[/* x */ T, Boolean] => SidePush[T], push: T => Unit): SidePush[T] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[SidePush[T]]
  }
  
  @scala.inline
  implicit class SidePushOps[Self <: SidePush[_], T] (val x: Self with SidePush[T]) extends AnyVal {
    
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
    def setFilter(value: js.Function1[/* x */ T, Boolean] => SidePush[T]): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPush(value: T => Unit): Self = this.set("push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
  }
}
