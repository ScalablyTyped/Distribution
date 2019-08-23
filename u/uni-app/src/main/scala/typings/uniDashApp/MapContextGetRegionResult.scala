package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapContextGetRegionResult extends js.Object {
  /**
    * 东北角的经纬度
    */
  var northeast: js.UndefOr[LocationObject] = js.undefined
  /**
    * 西南角的经纬度
    */
  var southwest: js.UndefOr[LocationObject] = js.undefined
}

object MapContextGetRegionResult {
  @scala.inline
  def apply(northeast: LocationObject = null, southwest: LocationObject = null): MapContextGetRegionResult = {
    val __obj = js.Dynamic.literal()
    if (northeast != null) __obj.updateDynamic("northeast")(northeast)
    if (southwest != null) __obj.updateDynamic("southwest")(southwest)
    __obj.asInstanceOf[MapContextGetRegionResult]
  }
}

