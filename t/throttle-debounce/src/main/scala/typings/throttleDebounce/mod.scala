package typings.throttleDebounce

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("throttle-debounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def debounce[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */](delay: Double, atBegin: Boolean, callback: T): debounce[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(delay.asInstanceOf[js.Any], atBegin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[debounce[T]]
  @scala.inline
  def debounce[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */](delay: Double, callback: T): debounce[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[debounce[T]]
  type debounce[T] = throttle[T]
  
  @scala.inline
  def throttle[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */](delay: Double, callback: T): throttle[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[throttle[T]]
  @scala.inline
  def throttle[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */](delay: Double, callback: T, debounceMode: Boolean): throttle[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(delay.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], debounceMode.asInstanceOf[js.Any])).asInstanceOf[throttle[T]]
  @scala.inline
  def throttle[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */](delay: Double, noTrailing: Boolean, callback: T): throttle[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(delay.asInstanceOf[js.Any], noTrailing.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[throttle[T]]
  @scala.inline
  def throttle[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */](delay: Double, noTrailing: Boolean, callback: T, debounceMode: Boolean): throttle[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(delay.asInstanceOf[js.Any], noTrailing.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], debounceMode.asInstanceOf[js.Any])).asInstanceOf[throttle[T]]
  type throttle[T] = T & Cancel
  
  trait Cancel extends StObject {
    
    def cancel(): Unit
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
