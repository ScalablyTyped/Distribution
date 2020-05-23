package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an image that is associated with a product listing in the Windows Store. */
trait StoreImage extends js.Object {
  /** Gets the caption for the image. */
  var caption: String
  /** Gets the height of the image, in pixels. */
  var height: Double
  /** Gets the tag for the image. */
  var imagePurposeTag: String
  /** Gets the URI of the image. */
  var uri: Uri
  /** Gets the width of the image, in pixels. */
  var width: Double
}

object StoreImage {
  @scala.inline
  def apply(caption: String, height: Double, imagePurposeTag: String, uri: Uri, width: Double): StoreImage = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], imagePurposeTag = imagePurposeTag.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreImage]
  }
}

