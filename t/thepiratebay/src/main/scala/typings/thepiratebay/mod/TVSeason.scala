package typings.thepiratebay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TVSeason extends js.Object {
  var title: String
  var torrents: js.Array[TVTorrent]
}

object TVSeason {
  @scala.inline
  def apply(title: String, torrents: js.Array[TVTorrent]): TVSeason = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], torrents = torrents.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TVSeason]
  }
}

