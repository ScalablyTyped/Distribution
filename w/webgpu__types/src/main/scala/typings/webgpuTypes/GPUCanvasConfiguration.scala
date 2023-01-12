package typings.webgpuTypes

import typings.std.PredefinedColorSpace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUCanvasConfiguration extends StObject {
  
  /**
    * Determines the effect that alpha values will have on the content of textures returned by
    * {@link GPUCanvasContext#getCurrentTexture} when read, displayed, or used as an image source.
    */
  var alphaMode: js.UndefOr[GPUCanvasAlphaMode] = js.undefined
  
  /**
    * The color space that values written into textures returned by
    * {@link GPUCanvasContext#getCurrentTexture} should be displayed with.
    */
  var colorSpace: js.UndefOr[PredefinedColorSpace] = js.undefined
  
  /** @deprecated use alphaMode instead (it is specified to affect the behavior of reading from the canvas) */
  var compositingAlphaMode: js.UndefOr[GPUCanvasCompositingAlphaMode] = js.undefined
  
  /**
    * The {@link GPUDevice} that textures returned by {@link GPUCanvasContext#getCurrentTexture} will be
    * compatible with.
    */
  var device: GPUDevice
  
  /**
    * The format that textures returned by {@link GPUCanvasContext#getCurrentTexture} will have.
    * Must be one of the Supported context formats.
    */
  var format: GPUTextureFormat
  
  /** @deprecated use the canvas width/height instead */
  var size: js.UndefOr[GPUExtent3D] = js.undefined
  
  /**
    * The usage that textures returned by {@link GPUCanvasContext#getCurrentTexture} will have.
    * {@link GPUTextureUsage#RENDER_ATTACHMENT} is the default, but is not automatically included
    * if the usage is explicitly set. Be sure to include {@link GPUTextureUsage#RENDER_ATTACHMENT}
    * when setting a custom usage if you wish to use textures returned by
    * {@link GPUCanvasContext#getCurrentTexture} as color targets for a render pass.
    */
  var usage: js.UndefOr[GPUTextureUsageFlags] = js.undefined
  
  /**
    * The formats that views created from textures returned by
    * {@link GPUCanvasContext#getCurrentTexture} may use.
    */
  var viewFormats: js.UndefOr[js.Iterable[GPUTextureFormat]] = js.undefined
}
object GPUCanvasConfiguration {
  
  inline def apply(device: GPUDevice, format: GPUTextureFormat): GPUCanvasConfiguration = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUCanvasConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUCanvasConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAlphaMode(value: GPUCanvasAlphaMode): Self = StObject.set(x, "alphaMode", value.asInstanceOf[js.Any])
    
    inline def setAlphaModeUndefined: Self = StObject.set(x, "alphaMode", js.undefined)
    
    inline def setColorSpace(value: PredefinedColorSpace): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
    
    inline def setCompositingAlphaMode(value: GPUCanvasCompositingAlphaMode): Self = StObject.set(x, "compositingAlphaMode", value.asInstanceOf[js.Any])
    
    inline def setCompositingAlphaModeUndefined: Self = StObject.set(x, "compositingAlphaMode", js.undefined)
    
    inline def setDevice(value: GPUDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: GPUTextureFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setSize(value: GPUExtent3D): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUsage(value: GPUTextureUsageFlags): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    
    inline def setViewFormats(value: js.Iterable[GPUTextureFormat]): Self = StObject.set(x, "viewFormats", value.asInstanceOf[js.Any])
    
    inline def setViewFormatsUndefined: Self = StObject.set(x, "viewFormats", js.undefined)
  }
}
