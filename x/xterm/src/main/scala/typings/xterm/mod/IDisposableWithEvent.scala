package typings.xterm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDisposableWithEvent
  extends StObject
     with IDisposable {
  
  /**
    * Whether this is disposed.
    */
  val isDisposed: Boolean
  
  /**
    * Event listener to get notified when this gets disposed.
    */
  def onDispose(listener: js.Function2[/* arg1 */ Unit, /* arg2 */ Unit, Any]): IDisposable
  /**
    * Event listener to get notified when this gets disposed.
    */
  @JSName("onDispose")
  var onDispose_Original: IEvent[Unit, Unit]
}
object IDisposableWithEvent {
  
  inline def apply(
    dispose: () => Unit,
    isDisposed: Boolean,
    onDispose: /* listener */ js.Function2[Unit, Unit, Any] => IDisposable
  ): IDisposableWithEvent = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], onDispose = js.Any.fromFunction1(onDispose))
    __obj.asInstanceOf[IDisposableWithEvent]
  }
  
  extension [Self <: IDisposableWithEvent](x: Self) {
    
    inline def setIsDisposed(value: Boolean): Self = StObject.set(x, "isDisposed", value.asInstanceOf[js.Any])
    
    inline def setOnDispose(value: /* listener */ js.Function2[Unit, Unit, Any] => IDisposable): Self = StObject.set(x, "onDispose", js.Any.fromFunction1(value))
  }
}
