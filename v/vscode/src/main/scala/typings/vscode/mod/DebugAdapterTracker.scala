package typings.vscode.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugAdapterTracker extends StObject {
  
  /**
    * The debug adapter has sent a Debug Adapter Protocol message to VS Code.
    */
  var onDidSendMessage: js.UndefOr[js.Function1[/* message */ js.Any, Unit]] = js.native
  
  /**
    * An error with the debug adapter has occurred.
    */
  var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  
  /**
    * The debug adapter has exited with the given exit code or signal.
    */
  var onExit: js.UndefOr[
    js.Function2[/* code */ js.UndefOr[Double], /* signal */ js.UndefOr[String], Unit]
  ] = js.native
  
  /**
    * The debug adapter is about to receive a Debug Adapter Protocol message from VS Code.
    */
  var onWillReceiveMessage: js.UndefOr[js.Function1[/* message */ js.Any, Unit]] = js.native
  
  /**
    * A session with the debug adapter is about to be started.
    */
  var onWillStartSession: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * The debug adapter session is about to be stopped.
    */
  var onWillStopSession: js.UndefOr[js.Function0[Unit]] = js.native
}
object DebugAdapterTracker {
  
  @scala.inline
  def apply(): DebugAdapterTracker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugAdapterTracker]
  }
  
  @scala.inline
  implicit class DebugAdapterTrackerMutableBuilder[Self <: DebugAdapterTracker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnDidSendMessage(value: /* message */ js.Any => Unit): Self = StObject.set(x, "onDidSendMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDidSendMessageUndefined: Self = StObject.set(x, "onDidSendMessage", js.undefined)
    
    @scala.inline
    def setOnError(value: /* error */ Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnExit(value: (/* code */ js.UndefOr[Double], /* signal */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    @scala.inline
    def setOnWillReceiveMessage(value: /* message */ js.Any => Unit): Self = StObject.set(x, "onWillReceiveMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWillReceiveMessageUndefined: Self = StObject.set(x, "onWillReceiveMessage", js.undefined)
    
    @scala.inline
    def setOnWillStartSession(value: () => Unit): Self = StObject.set(x, "onWillStartSession", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnWillStartSessionUndefined: Self = StObject.set(x, "onWillStartSession", js.undefined)
    
    @scala.inline
    def setOnWillStopSession(value: () => Unit): Self = StObject.set(x, "onWillStopSession", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnWillStopSessionUndefined: Self = StObject.set(x, "onWillStopSession", js.undefined)
  }
}
