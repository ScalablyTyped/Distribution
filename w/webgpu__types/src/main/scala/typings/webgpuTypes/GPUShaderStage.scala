package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUShaderStage extends StObject {
  
  val COMPUTE: GPUFlagsConstant
  
  val FRAGMENT: GPUFlagsConstant
  
  val VERTEX: GPUFlagsConstant
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUShaderStage
}
object GPUShaderStage {
  
  inline def apply(COMPUTE: GPUFlagsConstant, FRAGMENT: GPUFlagsConstant, VERTEX: GPUFlagsConstant): GPUShaderStage = {
    val __obj = js.Dynamic.literal(COMPUTE = COMPUTE.asInstanceOf[js.Any], FRAGMENT = FRAGMENT.asInstanceOf[js.Any], VERTEX = VERTEX.asInstanceOf[js.Any], __brand = "GPUShaderStage")
    __obj.asInstanceOf[GPUShaderStage]
  }
  
  extension [Self <: GPUShaderStage](x: Self) {
    
    inline def setCOMPUTE(value: GPUFlagsConstant): Self = StObject.set(x, "COMPUTE", value.asInstanceOf[js.Any])
    
    inline def setFRAGMENT(value: GPUFlagsConstant): Self = StObject.set(x, "FRAGMENT", value.asInstanceOf[js.Any])
    
    inline def setVERTEX(value: GPUFlagsConstant): Self = StObject.set(x, "VERTEX", value.asInstanceOf[js.Any])
    
    inline def set__brand(value: typings.webgpuTypes.webgpuTypesStrings.GPUShaderStage): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
