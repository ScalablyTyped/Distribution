package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUMapMode extends StObject {
  
  val READ: GPUFlagsConstant
  
  val WRITE: GPUFlagsConstant
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUMapMode
}
object GPUMapMode {
  
  inline def apply(READ: GPUFlagsConstant, WRITE: GPUFlagsConstant): GPUMapMode = {
    val __obj = js.Dynamic.literal(READ = READ.asInstanceOf[js.Any], WRITE = WRITE.asInstanceOf[js.Any], __brand = "GPUMapMode")
    __obj.asInstanceOf[GPUMapMode]
  }
  
  extension [Self <: GPUMapMode](x: Self) {
    
    inline def setREAD(value: GPUFlagsConstant): Self = StObject.set(x, "READ", value.asInstanceOf[js.Any])
    
    inline def setWRITE(value: GPUFlagsConstant): Self = StObject.set(x, "WRITE", value.asInstanceOf[js.Any])
    
    inline def set__brand(value: typings.webgpuTypes.webgpuTypesStrings.GPUMapMode): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
