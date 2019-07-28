package typings.torrentDashSearchDashApi.torrentDashSearchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Torrent extends js.Object {
  var desc: String
  var magnet: String
  var provider: String
  var size: String
  var time: String
  var title: String
}

object Torrent {
  @scala.inline
  def apply(desc: String, magnet: String, provider: String, size: String, time: String, title: String): Torrent = {
    val __obj = js.Dynamic.literal(desc = desc, magnet = magnet, provider = provider, size = size, time = time, title = title)
  
    __obj.asInstanceOf[Torrent]
  }
}

