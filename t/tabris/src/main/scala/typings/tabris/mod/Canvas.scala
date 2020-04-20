package typings.tabris.mod

import typings.tabris.Blob
import typings.tabris.OmitCanvasset
import typings.tabris.tabrisStrings.imageSlashjpeg
import typings.tabris.tabrisStrings.imageSlashpng
import typings.tabris.tabrisStrings.imageSlashwebp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Canvas")
@js.native
class Canvas () extends Composite[Widget] {
  def this(properties: Properties[Canvas, OmitCanvasset]) = this()
  /**
    * Returns the drawing context with the given size.
    * @param contextType The context identifier. Only `"2d"` is supported.
    * @param width the width of the canvas context to create
    * @param height the height of the canvas context to create
    */
  def getContext(contextType: String, width: Double, height: Double): CanvasContext = js.native
  /**
    * Creates a Blob object representing the image contained in the canvas. This is a non-blocking
    * operation.
    * @param callback Callback that will be called with the resulting blob.
    * @param mimeType The expected image format. If `mimeType` is not specified or invalid, the image type is `image/png`. **On iOS the type `image/webp` is not supported. A png will be returned instead.**
    * @param quality A Number between 0 and 1 specifying the image quality. A lower number results in a smaller file size at the same resolution. If `quality` is not specified or invalid the value `0.92` is for `image/jpeg` and  `0.80` for `image/webp` respectively. The value has no effect for `image/png`.
    */
  def toBlob(callback: js.Function1[/* blob */ Blob, Unit]): Unit = js.native
  @JSName("toBlob")
  def toBlob_imagejpeg(callback: js.Function1[/* blob */ Blob, Unit], mimeType: imageSlashjpeg): Unit = js.native
  @JSName("toBlob")
  def toBlob_imagejpeg(callback: js.Function1[/* blob */ Blob, Unit], mimeType: imageSlashjpeg, quality: Double): Unit = js.native
  @JSName("toBlob")
  def toBlob_imagepng(callback: js.Function1[/* blob */ Blob, Unit], mimeType: imageSlashpng): Unit = js.native
  @JSName("toBlob")
  def toBlob_imagepng(callback: js.Function1[/* blob */ Blob, Unit], mimeType: imageSlashpng, quality: Double): Unit = js.native
  @JSName("toBlob")
  def toBlob_imagewebp(callback: js.Function1[/* blob */ Blob, Unit], mimeType: imageSlashwebp): Unit = js.native
  @JSName("toBlob")
  def toBlob_imagewebp(callback: js.Function1[/* blob */ Blob, Unit], mimeType: imageSlashwebp, quality: Double): Unit = js.native
}

