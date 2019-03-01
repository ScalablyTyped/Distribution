package typings
package torrentDashStreamLib.TorrentStreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadStreamOptions extends js.Object {
  var end: scala.Double
  var start: scala.Double
}

object ReadStreamOptions {
  @scala.inline
  def apply(end: scala.Double, start: scala.Double): ReadStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[ReadStreamOptions]
  }
}

