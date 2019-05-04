package typings
package vegaDashLiteLib.buildSrcGuideMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VlOnlyGuideConfig extends js.Object {
  /**
    * Whether month names and weekday names should be abbreviated.
    *
    * __Default value:__  `false`
    */
  var shortTimeLabels: js.UndefOr[scala.Boolean] = js.undefined
}

object VlOnlyGuideConfig {
  @scala.inline
  def apply(shortTimeLabels: js.UndefOr[scala.Boolean] = js.undefined): VlOnlyGuideConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(shortTimeLabels)) __obj.updateDynamic("shortTimeLabels")(shortTimeLabels)
    __obj.asInstanceOf[VlOnlyGuideConfig]
  }
}

