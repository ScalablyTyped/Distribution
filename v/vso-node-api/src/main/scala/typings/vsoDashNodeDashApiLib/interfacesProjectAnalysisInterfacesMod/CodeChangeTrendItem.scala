package typings
package vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeChangeTrendItem extends js.Object {
  var time: stdLib.Date
  var value: scala.Double
}

object CodeChangeTrendItem {
  @scala.inline
  def apply(time: stdLib.Date, value: scala.Double): CodeChangeTrendItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("time")(time)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CodeChangeTrendItem]
  }
}

