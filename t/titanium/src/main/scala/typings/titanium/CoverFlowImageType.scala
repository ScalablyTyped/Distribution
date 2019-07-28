package typings.titanium

import typings.titanium.TitaniumNs.Blob
import typings.titanium.TitaniumNs.FilesystemNs.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object for defining a single image in a cover flow view.
  */
trait CoverFlowImageType extends js.Object {
  /**
  	 * Display height of the image, in Apple points.
  	 */
  var height: js.UndefOr[Double] = js.undefined
  /**
  	 * Image to use, as a local file URL, `Blob`, or `File`.
  	 */
  var image: js.UndefOr[String | Blob | File] = js.undefined
  /**
  	 * Display width for the image, in Apple points.
  	 */
  var width: js.UndefOr[Double] = js.undefined
}

object CoverFlowImageType {
  @scala.inline
  def apply(height: Int | Double = null, image: String | Blob | File = null, width: Int | Double = null): CoverFlowImageType = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverFlowImageType]
  }
}

