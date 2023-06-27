package typings.webgpuTypes

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
  var origin: js.UndefOr[GPUOrigin2DStrict] = js.undefined
  
  /**
    * The source of the image copy. The copy source data is captured at the moment that
    * {@link GPUQueue#copyExternalImageToTexture} is issued. Source size is defined by source
    * type, given by this table:
    *
    * <table class=data>
    * <thead>
    * <tr>
    * <th>Source type
    * <th>Width
    * <th>Height
    * </thead>
    * <tbody>
    * <tr>
    * <td>{@link ImageBitmap}
    * <td>{@link ImageBitmap#width|ImageBitmap.width}
    * <td>{@link ImageBitmap#height|ImageBitmap.height}
    * <tr>
    * <td>{@link HTMLVideoElement}
    * <td>video/intrinsic width|intrinsic width of the frame
    * <td>video/intrinsic height|intrinsic height of the frame
    * <tr>
    * <td>{@link VideoFrame}
    * <td>{@link VideoFrame#codedWidth|VideoFrame.codedWidth}
    * <td>{@link VideoFrame#codedHeight|VideoFrame.codedHeight}
    * <tr>
    * <td>{@link HTMLCanvasElement}
    * <td>{@link HTMLCanvasElement#width|HTMLCanvasElement.width}
    * <td>{@link HTMLCanvasElement#height|HTMLCanvasElement.height}
    * <tr>
    * <td>{@link OffscreenCanvas}
    * <td>{@link OffscreenCanvas#width|OffscreenCanvas.width}
    * <td>{@link OffscreenCanvas#height|OffscreenCanvas.height}
    * </tbody>
    * </table>
    */
  var source: GPUImageCopyExternalImageSource
}
object GPUImageCopyExternalImage {
  
  inline def apply(source: GPUImageCopyExternalImageSource): GPUImageCopyExternalImage = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUImageCopyExternalImage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUImageCopyExternalImage] (val x: Self) extends AnyVal {
    
    inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
    
    inline def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
    
    inline def setOrigin(value: GPUOrigin2DStrict): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setSource(value: GPUImageCopyExternalImageSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
