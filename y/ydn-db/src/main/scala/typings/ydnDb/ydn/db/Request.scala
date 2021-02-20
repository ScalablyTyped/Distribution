package typings.ydnDb.ydn.db

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends StObject {
  
  def abort(): js.Any = js.native
  
  def always(callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  
  def canAbort(): Boolean = js.native
  
  def done(callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  
  def fail(callback: js.Function1[/* data */ js.Any, Unit]): js.Any = js.native
  
  def `then`(
    success_callback: js.Function1[/* data */ js.Any, _],
    error_callback: js.Function1[/* data */ Error, _]
  ): js.Any = js.native
}
object Request {
  
  @scala.inline
  def apply(
    abort: () => js.Any,
    always: js.Function1[/* data */ js.Any, Unit] => js.Any,
    canAbort: () => Boolean,
    done: js.Function1[/* data */ js.Any, Unit] => js.Any,
    fail: js.Function1[/* data */ js.Any, Unit] => js.Any,
    `then`: (js.Function1[/* data */ js.Any, _], js.Function1[/* data */ Error, _]) => js.Any
  ): Request = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), always = js.Any.fromFunction1(always), canAbort = js.Any.fromFunction0(canAbort), done = js.Any.fromFunction1(done), fail = js.Any.fromFunction1(fail))
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: () => js.Any): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAlways(value: js.Function1[/* data */ js.Any, Unit] => js.Any): Self = StObject.set(x, "always", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCanAbort(value: () => Boolean): Self = StObject.set(x, "canAbort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDone(value: js.Function1[/* data */ js.Any, Unit] => js.Any): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFail(value: js.Function1[/* data */ js.Any, Unit] => js.Any): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThen(value: (js.Function1[/* data */ js.Any, _], js.Function1[/* data */ Error, _]) => js.Any): Self = StObject.set(x, "then", js.Any.fromFunction2(value))
  }
}
