package typings
package titaniumLib

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
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Image to use, as a local file URL, `Blob`, or `File`.
  	 */
  var image: js.UndefOr[
    java.lang.String | titaniumLib.TitaniumNs.Blob | titaniumLib.TitaniumNs.FilesystemNs.File
  ] = js.undefined
  /**
  	 * Display width for the image, in Apple points.
  	 */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object CoverFlowImageType {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    image: java.lang.String | titaniumLib.TitaniumNs.Blob | titaniumLib.TitaniumNs.FilesystemNs.File = null,
    width: scala.Int | scala.Double = null
  ): CoverFlowImageType = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverFlowImageType]
  }
}

