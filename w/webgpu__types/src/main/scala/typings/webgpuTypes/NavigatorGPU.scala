package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigatorGPU extends StObject {
  
  val gpu: GPU
}
object NavigatorGPU {
  
  inline def apply(gpu: GPU): NavigatorGPU = {
    val __obj = js.Dynamic.literal(gpu = gpu.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorGPU]
  }
  
  extension [Self <: NavigatorGPU](x: Self) {
    
    inline def setGpu(value: GPU): Self = StObject.set(x, "gpu", value.asInstanceOf[js.Any])
  }
}
