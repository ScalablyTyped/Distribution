package typings.torrentDashStream.TorrentStreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadStreamOptions extends js.Object {
  var end: Double
  var start: Double
}

object ReadStreamOptions {
  @scala.inline
  def apply(end: Double, start: Double): ReadStreamOptions = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[ReadStreamOptions]
  }
}

