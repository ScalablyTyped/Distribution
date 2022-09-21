package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPURenderPassLayout
  extends StObject
     with GPUObjectDescriptorBase {
  
  var colorFormats: js.Iterable[GPUTextureFormat | Null]
  
  var depthStencilFormat: js.UndefOr[GPUTextureFormat] = js.undefined
  
  var sampleCount: js.UndefOr[GPUSize32] = js.undefined
}
object GPURenderPassLayout {
  
  inline def apply(colorFormats: js.Iterable[GPUTextureFormat | Null]): GPURenderPassLayout = {
    val __obj = js.Dynamic.literal(colorFormats = colorFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPURenderPassLayout]
  }
  
  extension [Self <: GPURenderPassLayout](x: Self) {
    
    inline def setColorFormats(value: js.Iterable[GPUTextureFormat | Null]): Self = StObject.set(x, "colorFormats", value.asInstanceOf[js.Any])
    
    inline def setDepthStencilFormat(value: GPUTextureFormat): Self = StObject.set(x, "depthStencilFormat", value.asInstanceOf[js.Any])
    
    inline def setDepthStencilFormatUndefined: Self = StObject.set(x, "depthStencilFormat", js.undefined)
    
    inline def setSampleCount(value: GPUSize32): Self = StObject.set(x, "sampleCount", value.asInstanceOf[js.Any])
    
    inline def setSampleCountUndefined: Self = StObject.set(x, "sampleCount", js.undefined)
  }
}
