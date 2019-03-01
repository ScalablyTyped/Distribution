package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToManager extends js.Object {
  var defaultSourceSelection: scala.Boolean
  var onsourcerequested: js.Any
  var onsourceselected: js.Any
}

object IPlayToManager {
  @scala.inline
  def apply(defaultSourceSelection: scala.Boolean, onsourcerequested: js.Any, onsourceselected: js.Any): IPlayToManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultSourceSelection")(defaultSourceSelection)
    __obj.updateDynamic("onsourcerequested")(onsourcerequested)
    __obj.updateDynamic("onsourceselected")(onsourceselected)
    __obj.asInstanceOf[IPlayToManager]
  }
}

