package typings
package wiiuLib.wiiuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageView extends js.Object {
  var viewMode: scala.Double
  def end(): scala.Boolean
  def getErrorCode(): scala.Double
}

object ImageView {
  @scala.inline
  def apply(end: js.Function0[scala.Boolean], getErrorCode: js.Function0[scala.Double], viewMode: scala.Double): ImageView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("getErrorCode")(getErrorCode)
    __obj.updateDynamic("viewMode")(viewMode)
    __obj.asInstanceOf[ImageView]
  }
}

