package typings
package torrentDashStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("torrent-stream", JSImport.Namespace)
@js.native
object torrentDashStreamMod extends js.Object {
  def apply(magnet: java.lang.String | nodeLib.Buffer): torrentDashStreamLib.TorrentStreamNs.TorrentEngine = js.native
  def apply(
    magnet: java.lang.String | nodeLib.Buffer,
    options: torrentDashStreamLib.TorrentStreamNs.TorrentEngineOptions
  ): torrentDashStreamLib.TorrentStreamNs.TorrentEngine = js.native
}

