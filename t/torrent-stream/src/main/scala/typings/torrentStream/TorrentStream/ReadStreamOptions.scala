package typings.torrentStream.TorrentStream

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
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadStreamOptions]
  }
}

