package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugAdapterTracker extends StObject {
  
  /**
    * The debug adapter has sent a Debug Adapter Protocol message to the editor.
    */
  var onDidSendMessage: js.UndefOr[js.Function1[/* message */ Any, Unit]] = js.undefined
  
  /**
    * An error with the debug adapter has occurred.
    */
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  
  /**
    * The debug adapter has exited with the given exit code or signal.
    */
  var onExit: js.UndefOr[
    js.Function2[/* code */ js.UndefOr[Double], /* signal */ js.UndefOr[String], Unit]
  ] = js.undefined
  
  /**
    * The debug adapter is about to receive a Debug Adapter Protocol message from the editor.
    */
  var onWillReceiveMessage: js.UndefOr[js.Function1[/* message */ Any, Unit]] = js.undefined
  
  /**
    * A session with the debug adapter is about to be started.
    */
  var onWillStartSession: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * The debug adapter session is about to be stopped.
    */
  var onWillStopSession: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object DebugAdapterTracker {
  
  inline def apply(): DebugAdapterTracker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugAdapterTracker]
  }
  
  extension [Self <: DebugAdapterTracker](x: Self) {
    
    inline def setOnDidSendMessage(value: /* message */ Any => Unit): Self = StObject.set(x, "onDidSendMessage", js.Any.fromFunction1(value))
    
    inline def setOnDidSendMessageUndefined: Self = StObject.set(x, "onDidSendMessage", js.undefined)
    
    inline def setOnError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnExit(value: (/* code */ js.UndefOr[Double], /* signal */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction2(value))
    
    inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    inline def setOnWillReceiveMessage(value: /* message */ Any => Unit): Self = StObject.set(x, "onWillReceiveMessage", js.Any.fromFunction1(value))
    
    inline def setOnWillReceiveMessageUndefined: Self = StObject.set(x, "onWillReceiveMessage", js.undefined)
    
    inline def setOnWillStartSession(value: () => Unit): Self = StObject.set(x, "onWillStartSession", js.Any.fromFunction0(value))
    
    inline def setOnWillStartSessionUndefined: Self = StObject.set(x, "onWillStartSession", js.undefined)
    
    inline def setOnWillStopSession(value: () => Unit): Self = StObject.set(x, "onWillStopSession", js.Any.fromFunction0(value))
    
    inline def setOnWillStopSessionUndefined: Self = StObject.set(x, "onWillStopSession", js.undefined)
  }
}
