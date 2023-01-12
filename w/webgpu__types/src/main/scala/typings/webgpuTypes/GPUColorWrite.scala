package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUColorWrite extends StObject {
  
  val ALL: GPUFlagsConstant
  
  val ALPHA: GPUFlagsConstant
  
  val BLUE: GPUFlagsConstant
  
  val GREEN: GPUFlagsConstant
  
  val RED: GPUFlagsConstant
  
  /**
    * Nominal type branding.
    * https://github.com/microsoft/TypeScript/pull/33038
    * @internal
    */
  val __brand: typings.webgpuTypes.webgpuTypesStrings.GPUColorWrite
}
object GPUColorWrite {
  
  inline def apply(
    ALL: GPUFlagsConstant,
    ALPHA: GPUFlagsConstant,
    BLUE: GPUFlagsConstant,
    GREEN: GPUFlagsConstant,
    RED: GPUFlagsConstant
  ): GPUColorWrite = {
    val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], ALPHA = ALPHA.asInstanceOf[js.Any], BLUE = BLUE.asInstanceOf[js.Any], GREEN = GREEN.asInstanceOf[js.Any], RED = RED.asInstanceOf[js.Any], __brand = "GPUColorWrite")
    __obj.asInstanceOf[GPUColorWrite]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUColorWrite] (val x: Self) extends AnyVal {
    
    inline def setALL(value: GPUFlagsConstant): Self = StObject.set(x, "ALL", value.asInstanceOf[js.Any])
    
    inline def setALPHA(value: GPUFlagsConstant): Self = StObject.set(x, "ALPHA", value.asInstanceOf[js.Any])
    
    inline def setBLUE(value: GPUFlagsConstant): Self = StObject.set(x, "BLUE", value.asInstanceOf[js.Any])
    
    inline def setGREEN(value: GPUFlagsConstant): Self = StObject.set(x, "GREEN", value.asInstanceOf[js.Any])
    
    inline def setRED(value: GPUFlagsConstant): Self = StObject.set(x, "RED", value.asInstanceOf[js.Any])
    
    inline def set__brand(value: typings.webgpuTypes.webgpuTypesStrings.GPUColorWrite): Self = StObject.set(x, "__brand", value.asInstanceOf[js.Any])
  }
}
