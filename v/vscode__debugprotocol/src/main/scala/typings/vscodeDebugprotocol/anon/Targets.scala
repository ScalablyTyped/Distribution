package typings.vscodeDebugprotocol.anon

import typings.vscodeDebugprotocol.mod.DebugProtocol.StepInTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Targets extends StObject {
  
  /** The possible step-in targets of the specified source location. */
  var targets: js.Array[StepInTarget]
}
object Targets {
  
  inline def apply(targets: js.Array[StepInTarget]): Targets = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Targets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Targets] (val x: Self) extends AnyVal {
    
    inline def setTargets(value: js.Array[StepInTarget]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: StepInTarget*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}
