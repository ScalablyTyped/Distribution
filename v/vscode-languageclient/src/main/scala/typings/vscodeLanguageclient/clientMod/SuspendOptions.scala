package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuspendOptions extends StObject {
  
  /**
    * A callback that is invoked before actually suspending
    * the server. If `false` is returned the client will not continue
    * suspending the server.
    */
  var callback: js.UndefOr[js.Function0[js.Promise[Boolean]]] = js.undefined
  
  /**
    * The interval in milliseconds used to check if the server
    * can be suspended. If the check passes three times in a row
    * (e.g. the server can be suspended for 3 * interval ms) the
    * server is suspended. Defaults to 60000ms, which is also the
    * minimum allowed value.
    */
  var interval: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether suspend mode is supported. If suspend mode is allowed
    * the client will stop a running server when going into suspend mode.
    * If omitted defaults to SuspendMode.off;
    */
  var mode: js.UndefOr[SuspendMode] = js.undefined
}
object SuspendOptions {
  
  inline def apply(): SuspendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuspendOptions]
  }
  
  extension [Self <: SuspendOptions](x: Self) {
    
    inline def setCallback(value: () => js.Promise[Boolean]): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setMode(value: SuspendMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
