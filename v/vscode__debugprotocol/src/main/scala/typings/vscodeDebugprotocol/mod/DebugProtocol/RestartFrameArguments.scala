package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `restartFrame` request. */
trait RestartFrameArguments extends StObject {
  
  /** Restart this stackframe. */
  var frameId: Double
}
object RestartFrameArguments {
  
  inline def apply(frameId: Double): RestartFrameArguments = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestartFrameArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestartFrameArguments] (val x: Self) extends AnyVal {
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
  }
}
