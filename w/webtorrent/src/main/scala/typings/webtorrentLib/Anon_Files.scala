package typings
package webtorrentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Files extends js.Object {
  var files: js.Array[stdLib.File]
  var length: scala.Double
  var torrent: webtorrentLib.webtorrentMod.WebTorrentNs.Torrent
}

object Anon_Files {
  @scala.inline
  def apply(
    files: js.Array[stdLib.File],
    length: scala.Double,
    torrent: webtorrentLib.webtorrentMod.WebTorrentNs.Torrent
  ): Anon_Files = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("files")(files)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("torrent")(torrent)
    __obj.asInstanceOf[Anon_Files]
  }
}

