package typings.webgpuTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUTextureDescriptor
  extends StObject
     with GPUObjectDescriptorBase {
  
  /**
    * Whether the texture is one-dimensional, an array of two-dimensional layers, or three-dimensional.
    */
  var dimension: js.UndefOr[GPUTextureDimension] = js.undefined
  
  /**
    * The format of the texture.
    */
  var format: GPUTextureFormat
  
  /**
    * The number of mip levels the texture will contain.
    */
  var mipLevelCount: js.UndefOr[GPUIntegerCoordinate] = js.undefined
  
  /**
    * The sample count of the texture. A {@link GPUTextureDescriptor#sampleCount} &gt; `1` indicates
    * a multisampled texture.
    */
  var sampleCount: js.UndefOr[GPUSize32] = js.undefined
  
  /**
    * The width, height, and depth or layer count of the texture.
    */
  var size: GPUExtent3DStrict
  
  /**
    * The allowed usages for the texture.
    */
  var usage: GPUTextureUsageFlags
  
  /**
    * Specifies what view {@link GPUTextureViewDescriptor#format} values will be allowed when calling
    * {@link GPUTexture#createView} on this texture (in addition to the texture's actual
    * {@link GPUTextureDescriptor#format}).
    * <div class=note>
    * Note:
    * Adding a format to this list may have a significant performance impact, so it is best
    * to avoid adding formats unnecessarily.
    * The actual performance impact is highly dependent on the target system; developers must
    * test various systems to find out the impact on their particular application.
    * For example, on some systems any texture with a {@link GPUTextureDescriptor#format} or
    * {@link GPUTextureDescriptor#viewFormats} entry including
    * {@link GPUTextureFormat#"rgba8unorm-srgb"} will perform less optimally than a
    * {@link GPUTextureFormat#"rgba8unorm"} texture which does not.
    * Similar caveats exist for other formats and pairs of formats on other systems.
    * </div>
    * Formats in this list must be texture view format compatible with the texture format.
    * <div algorithm>
    * Two {@link GPUTextureFormat}s `format` and `viewFormat` are <dfn dfn for=>texture view format compatible</dfn> if:
    * - `format` equals `viewFormat`, or
    * - `format` and `viewFormat` differ only in whether they are `srgb` formats (have the `-srgb` suffix).
    * </div>
    */
  var viewFormats: js.UndefOr[js.Iterable[GPUTextureFormat]] = js.undefined
}
object GPUTextureDescriptor {
  
  inline def apply(format: GPUTextureFormat, size: GPUExtent3DStrict, usage: GPUTextureUsageFlags): GPUTextureDescriptor = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUTextureDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUTextureDescriptor] (val x: Self) extends AnyVal {
    
    inline def setDimension(value: GPUTextureDimension): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setFormat(value: GPUTextureFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setMipLevelCount(value: GPUIntegerCoordinate): Self = StObject.set(x, "mipLevelCount", value.asInstanceOf[js.Any])
    
    inline def setMipLevelCountUndefined: Self = StObject.set(x, "mipLevelCount", js.undefined)
    
    inline def setSampleCount(value: GPUSize32): Self = StObject.set(x, "sampleCount", value.asInstanceOf[js.Any])
    
    inline def setSampleCountUndefined: Self = StObject.set(x, "sampleCount", js.undefined)
    
    inline def setSize(value: GPUExtent3DStrict): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setUsage(value: GPUTextureUsageFlags): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setViewFormats(value: js.Iterable[GPUTextureFormat]): Self = StObject.set(x, "viewFormats", value.asInstanceOf[js.Any])
    
    inline def setViewFormatsUndefined: Self = StObject.set(x, "viewFormats", js.undefined)
  }
}
