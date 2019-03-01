package typings
package thepiratebayLib.thepiratebayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TVSeason extends js.Object {
  var title: java.lang.String
  var torrents: js.Array[TVTorrent]
}

object TVSeason {
  @scala.inline
  def apply(title: java.lang.String, torrents: js.Array[TVTorrent]): TVSeason = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("torrents")(torrents)
    __obj.asInstanceOf[TVSeason]
  }
}

