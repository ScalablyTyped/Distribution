package typings.webgpuTypes

import typings.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUImageCopyExternalImage extends StObject {
  
  /**
    * Describes whether the source image is vertically flipped, or not.
    * If this option is set to `true`, the copy is flipped vertically: the bottom row of the source
    * region is copied into the first row of the destination region, and so on.
    * The {@link GPUImageCopyExternalImage#origin} option is still relative to the top-left corner
    * of the source image, increasing downward.
    */
  var flipY: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines the origin of the copy - the minimum (top-left) corner of the source sub-region to copy from.
    * Together with `copySize`, defines the full copy sub-region.
    */
  var origin: js.UndefOr[GPUOrigin2D] = js.undefined
  
  /**
    * The source of the image copy. The copy source data is captured at the moment that
    * {@link GPUQueue#copyExternalImageToTexture} is issued.
    */
  var source: ImageBitmap | HTMLCanvasElement | OffscreenCanvas
}
object GPUImageCopyExternalImage {
  
  inline def apply(source: ImageBitmap | HTMLCanvasElement | OffscreenCanvas): GPUImageCopyExternalImage = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUImageCopyExternalImage]
  }
  
  extension [Self <: GPUImageCopyExternalImage](x: Self) {
    
    inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
    
    inline def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
    
    inline def setOrigin(value: GPUOrigin2D): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setSource(value: ImageBitmap | HTMLCanvasElement | OffscreenCanvas): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
