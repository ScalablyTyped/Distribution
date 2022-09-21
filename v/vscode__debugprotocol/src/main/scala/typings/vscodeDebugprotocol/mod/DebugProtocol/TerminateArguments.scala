package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `terminate` request. */
trait TerminateArguments extends StObject {
  
  /** A value of true indicates that this `terminate` request is part of a restart sequence. */
  var restart: js.UndefOr[Boolean] = js.undefined
}
object TerminateArguments {
  
  inline def apply(): TerminateArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateArguments]
  }
  
  extension [Self <: TerminateArguments](x: Self) {
    
    inline def setRestart(value: Boolean): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
    
    inline def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
  }
}
