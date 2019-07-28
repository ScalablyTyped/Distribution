package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object for describing the preview image rectangle. This will be undefined when custom camera overlay is not used.
  */
trait PreviewRectType extends js.Object {
  /**
  	 * Height preview image, in pixels.
  	 */
  var height: js.UndefOr[Double] = js.undefined
  /**
  	 * Width preview image, in pixels.
  	 */
  var width: js.UndefOr[Double] = js.undefined
}

object PreviewRectType {
  @scala.inline
  def apply(height: Int | Double = null, width: Int | Double = null): PreviewRectType = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewRectType]
  }
}

