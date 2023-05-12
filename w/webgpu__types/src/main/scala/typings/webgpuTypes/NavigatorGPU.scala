package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorGPU extends StObject {
  
  /**
    * Provides access to interfaces related to WebGPU.
    */
  val gpu: GPU
}
object NavigatorGPU {
  
  inline def apply(gpu: GPU): NavigatorGPU = {
    val __obj = js.Dynamic.literal(gpu = gpu.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorGPU]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigatorGPU] (val x: Self) extends AnyVal {
    
    inline def setGpu(value: GPU): Self = StObject.set(x, "gpu", value.asInstanceOf[js.Any])
  }
}
