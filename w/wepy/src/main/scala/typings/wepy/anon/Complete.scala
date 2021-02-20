package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Complete[T] extends StObject {
  
  def complete(): Unit = js.native
  
  def fail(): Unit = js.native
  
  def success(res: T): Unit = js.native
}
object Complete {
  
  @scala.inline
  def apply[T](complete: () => Unit, fail: () => Unit, success: T => Unit): Complete[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), fail = js.Any.fromFunction0(fail), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[Complete[T]]
  }
  
  @scala.inline
  implicit class CompleteMutableBuilder[Self <: Complete[_], T] (val x: Self with Complete[T]) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccess(value: T => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
