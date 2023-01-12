package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Complete[T] extends StObject {
  
  def complete(): Unit
  
  def fail(): Unit
  
  def success(res: T): Unit
}
object Complete {
  
  inline def apply[T](complete: () => Unit, fail: () => Unit, success: T => Unit): Complete[T] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), fail = js.Any.fromFunction0(fail), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[Complete[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Complete[?], T] (val x: Self & Complete[T]) extends AnyVal {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setSuccess(value: T => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
