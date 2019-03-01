package typings
package tmpLib.tmpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SynchrounousResult extends js.Object {
  var fd: scala.Double
  var name: java.lang.String
  def removeCallback(): scala.Unit
}

object SynchrounousResult {
  @scala.inline
  def apply(fd: scala.Double, name: java.lang.String, removeCallback: js.Function0[scala.Unit]): SynchrounousResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fd")(fd)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("removeCallback")(removeCallback)
    __obj.asInstanceOf[SynchrounousResult]
  }
}

