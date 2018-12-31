package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object used to specify options for [imageAsCropped](Titanium.Blob.imageAsCropped).
  */
trait ImageAsCroppedDict extends js.Object {
  /**
  	 * Height to crop this image to.
  	 */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Width to crop this image to.
  	 */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Left coordinate of the cropped rectangle within the source image.
  	 */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Top coordinate of the cropped rectangle within the source image.
  	 */
  var y: js.UndefOr[scala.Double] = js.undefined
}

