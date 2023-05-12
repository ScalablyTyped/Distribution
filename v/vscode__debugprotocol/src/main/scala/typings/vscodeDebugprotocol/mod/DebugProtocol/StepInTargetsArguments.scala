package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `stepInTargets` request. */
trait StepInTargetsArguments extends StObject {
  
  /** The stack frame for which to retrieve the possible step-in targets. */
  var frameId: Double
}
object StepInTargetsArguments {
  
  inline def apply(frameId: Double): StepInTargetsArguments = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepInTargetsArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StepInTargetsArguments] (val x: Self) extends AnyVal {
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
  }
}
