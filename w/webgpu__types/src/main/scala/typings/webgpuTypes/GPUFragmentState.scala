package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUFragmentState
  extends StObject
     with GPUProgrammableStage {
  
  /**
    * A list of {@link GPUColorTargetState} defining the formats and behaviors of the color targets
    * this pipeline writes to.
    */
  var targets: js.Iterable[GPUColorTargetState | Null]
}
object GPUFragmentState {
  
  inline def apply(entryPoint: String, module: GPUShaderModule, targets: js.Iterable[GPUColorTargetState | Null]): GPUFragmentState = {
    val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUFragmentState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUFragmentState] (val x: Self) extends AnyVal {
    
    inline def setTargets(value: js.Iterable[GPUColorTargetState | Null]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
  }
}
