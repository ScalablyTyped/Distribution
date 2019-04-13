package typings
package webtorrentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Files extends js.Object {
  var files: js.Array[stdLib.File]
  var length: scala.Double
  var torrent: webtorrentLib.webtorrentMod.Torrent
}

object Anon_Files {
  @scala.inline
  def apply(files: js.Array[stdLib.File], length: scala.Double, torrent: webtorrentLib.webtorrentMod.Torrent): Anon_Files = {
    val __obj = js.Dynamic.literal(files = files, length = length, torrent = torrent)
  
    __obj.asInstanceOf[Anon_Files]
  }
}

