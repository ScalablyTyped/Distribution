package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  /**
    * Image height, extracted from the image file when missing.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Image scale factor - the image will be scaled down by this factor.
    * Ignored when width or height are set.
    */
  var scale: js.UndefOr[scala.Double] = js.undefined
  /**
    * Image path or URL.
    */
  var src: java.lang.String
  /**
    * Image width, extracted from the image file when missing.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Height {
  @scala.inline
  def apply(
    src: java.lang.String,
    height: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Anon_Height = {
    val __obj = js.Dynamic.literal(src = src)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Height]
  }
}

