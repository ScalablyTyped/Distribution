package typings.webgpuTypes

import typings.std.PredefinedColorSpace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUImageCopyTextureTagged
  extends StObject
     with GPUImageCopyTexture {
  
  /**
    * Describes the color space and encoding used to encode data into the destination texture.
    * This [[#color-space-conversions|may result]] in values outside of the range [0, 1]
    * being written to the target texture, if its format can represent them.
    * Otherwise, the results are clamped to the target texture format's range.
    * Note:
    * If {@link GPUImageCopyTextureTagged#colorSpace} matches the source image,
    * conversion may not be necessary. See [[#color-space-conversion-elision]].
    */
  var colorSpace: js.UndefOr[PredefinedColorSpace] = js.undefined
  
  /**
    * Describes whether the data written into the texture should have its RGB channels
    * premultiplied by the alpha channel, or not.
    * If this option is set to `true` and the {@link GPUImageCopyExternalImage#source} is also
    * premultiplied, the source RGB values must be preserved even if they exceed their
    * corresponding alpha values.
    * Note:
    * If {@link GPUImageCopyTextureTagged#premultipliedAlpha} matches the source image,
    * conversion may not be necessary. See [[#color-space-conversion-elision]].
    */
  var premultipliedAlpha: js.UndefOr[Boolean] = js.undefined
}
object GPUImageCopyTextureTagged {
  
  inline def apply(texture: GPUTexture): GPUImageCopyTextureTagged = {
    val __obj = js.Dynamic.literal(texture = texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUImageCopyTextureTagged]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUImageCopyTextureTagged] (val x: Self) extends AnyVal {
    
    inline def setColorSpace(value: PredefinedColorSpace): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
    
    inline def setPremultipliedAlpha(value: Boolean): Self = StObject.set(x, "premultipliedAlpha", value.asInstanceOf[js.Any])
    
    inline def setPremultipliedAlphaUndefined: Self = StObject.set(x, "premultipliedAlpha", js.undefined)
  }
}
