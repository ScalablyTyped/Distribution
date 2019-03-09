package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageParams extends _FormatterParams {
  // Image
  var height: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object ImageParams {
  @scala.inline
  def apply(height: java.lang.String = null, width: java.lang.String = null): ImageParams = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ImageParams]
  }
}

