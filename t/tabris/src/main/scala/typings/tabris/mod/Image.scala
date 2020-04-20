package typings.tabris.mod

import typings.tabris.Blob
import typings.tabris.tabrisStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Image")
@js.native
class Image protected () extends _ImageValue {
  def this(imageLike: ImageLikeObject) = this()
  /**
    * Image height in dip. Extracted from the image file when 'auto'.
    * @constant
    */
  val height: Double | auto = js.native
  /**
    * Image scale factor - the image will be scaled down by this factor. See
    * [ImageLikeObject](../types.md#imagelikeobject) for details
    * @constant
    */
  val scale: Double | auto = js.native
  /**
    * As a string this is a file system path, relative path or URL. [Data
    * URIs](https://en.wikipedia.org/wiki/Data_URI_scheme) are also supported. Relative paths are resolved
    * **relative to ‘package.json’**. On Android the name of a bundled [drawable
    * resource](https://developer.android.com/guide/topics/resources/drawable-resource) can be provided
    * with the url scheme android-drawable, e.g. android-drawable://ic_info_black.
    * If a closed ImageBitmap is given the constructor will throw.
    * A given Blob must contain an encoded image.
    * @constant
    */
  val src: String | ImageBitmap | Blob = js.native
  /**
    * Image width in dip. Extracted from the image file when 'auto'.
    * @constant
    */
  val width: Double | auto = js.native
  /**
    * Tests if the given value is a `Image` instance that is deeply equal to this one.
    * @param value
    */
  def equals(value: Image): Boolean = js.native
}

/* static members */
@JSImport("tabris", "Image")
@js.native
object Image extends js.Object {
  /**
    * Creates a new instance of Image using any valid Image expression. For any other value, including
    * `null`, the method throws.
    * @param imageValue The value to create an Image instance from. See [ImageValue](../types.html#imagevalue)
    */
  def from(imageValue: ImageValue): Image = js.native
  /**
    * Returns true if value is an ImageValue. This includes `null`. Use this to check if a value will be
    * accepted by an image property. This is also a valid TypeScript type guard function.
    * @param value The value to test
    */
  def isImageValue(value: js.Any): /* is tabris.tabris.ImageValue */ Boolean = js.native
  /**
    * Returns true if value is a valid ImageValue. This excludes `null`. Use this to check if a value will
    * be accepted by Image.from. This is also a valid TypeScript type guard function.
    * @param value The value to test
    */
  def isValidImageValue(value: js.Any): /* is tabris.tabris.ImageValue */ Boolean = js.native
}

