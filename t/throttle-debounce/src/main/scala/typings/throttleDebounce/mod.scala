package typings.throttleDebounce

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("throttle-debounce", "debounce")
  @js.native
  def debounce[T /* <: js.Function1[/* repeated */ js.Any, _] */](delay: Double, atBegin: Boolean, callback: T): debounce[T] = js.native
  @JSImport("throttle-debounce", "debounce")
  @js.native
  def debounce[T /* <: js.Function1[/* repeated */ js.Any, _] */](delay: Double, callback: T): debounce[T] = js.native
  type debounce[T] = throttle[T]
  
  @JSImport("throttle-debounce", "throttle")
  @js.native
  def throttle[T /* <: js.Function1[/* repeated */ js.Any, _] */](delay: Double, callback: T): throttle[T] = js.native
  @JSImport("throttle-debounce", "throttle")
  @js.native
  def throttle[T /* <: js.Function1[/* repeated */ js.Any, _] */](delay: Double, callback: T, debounceMode: Boolean): throttle[T] = js.native
  @JSImport("throttle-debounce", "throttle")
  @js.native
  def throttle[T /* <: js.Function1[/* repeated */ js.Any, _] */](delay: Double, noTrailing: Boolean, callback: T): throttle[T] = js.native
  @JSImport("throttle-debounce", "throttle")
  @js.native
  def throttle[T /* <: js.Function1[/* repeated */ js.Any, _] */](delay: Double, noTrailing: Boolean, callback: T, debounceMode: Boolean): throttle[T] = js.native
  type throttle[T] = T with Cancel
  
  @js.native
  trait Cancel extends StObject {
    
    def cancel(): Unit = js.native
  }
  object Cancel {
    
    @scala.inline
    def apply(cancel: () => Unit): Cancel = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
      __obj.asInstanceOf[Cancel]
    }
    
    @scala.inline
    implicit class CancelMutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    }
  }
}
