package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `disconnect` request. */
trait DisconnectArguments extends StObject {
  
  /** A value of true indicates that this `disconnect` request is part of a restart sequence. */
  var restart: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates whether the debuggee should stay suspended when the debugger is disconnected.
  			If unspecified, the debuggee should resume execution.
  			The attribute is only honored by a debug adapter if the corresponding capability `supportSuspendDebuggee` is true.
  		*/
  var suspendDebuggee: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates whether the debuggee should be terminated when the debugger is disconnected.
  			If unspecified, the debug adapter is free to do whatever it thinks is best.
  			The attribute is only honored by a debug adapter if the corresponding capability `supportTerminateDebuggee` is true.
  		*/
  var terminateDebuggee: js.UndefOr[Boolean] = js.undefined
}
object DisconnectArguments {
  
  inline def apply(): DisconnectArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisconnectArguments]
  }
  
  extension [Self <: DisconnectArguments](x: Self) {
    
    inline def setRestart(value: Boolean): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
    
    inline def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
    
    inline def setSuspendDebuggee(value: Boolean): Self = StObject.set(x, "suspendDebuggee", value.asInstanceOf[js.Any])
    
    inline def setSuspendDebuggeeUndefined: Self = StObject.set(x, "suspendDebuggee", js.undefined)
    
    inline def setTerminateDebuggee(value: Boolean): Self = StObject.set(x, "terminateDebuggee", value.asInstanceOf[js.Any])
    
    inline def setTerminateDebuggeeUndefined: Self = StObject.set(x, "terminateDebuggee", js.undefined)
  }
}
