package typings.tabris.mod

import typings.tabris.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "ImageBitmap")
@js.native
class ImageBitmap protected () extends _ImageValue {
  /**
    * Native image height in pixel
    * @constant
    */
  val height: Double = js.native
  /**
    * Native image width in pixel
    * @constant
    */
  val width: Double = js.native
  /**
    * Disposes the resources associated with this ImageBitmap. Should be called once the image is no longer
    * needed to free up memory.
    */
  def close(): Unit = js.native
}

/* static members */
@JSImport("tabris", "ImageBitmap")
@js.native
object ImageBitmap extends js.Object {
  /**
    * Creates a promise that resolves to a new instance of ImageBitmap. Also available in global scope.
    * @param imageSource The data source to create an ImageBitmap instance from.
    */
  def createImageBitmap(imageSource: Blob): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(imageSource: typings.tabris.ImageData): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(imageSource: Canvas): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(imageSource: ImageBitmap): js.Promise[ImageBitmap] = js.native
}

