package typings.thepiratebay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TVSeason extends js.Object {
  var title: String = js.native
  var torrents: js.Array[TVTorrent] = js.native
}

object TVSeason {
  @scala.inline
  def apply(title: String, torrents: js.Array[TVTorrent]): TVSeason = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], torrents = torrents.asInstanceOf[js.Any])
    __obj.asInstanceOf[TVSeason]
  }
  @scala.inline
  implicit class TVSeasonOps[Self <: TVSeason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTorrentsVarargs(value: TVTorrent*): Self = this.set("torrents", js.Array(value :_*))
    @scala.inline
    def setTorrents(value: js.Array[TVTorrent]): Self = this.set("torrents", value.asInstanceOf[js.Any])
  }
  
}

