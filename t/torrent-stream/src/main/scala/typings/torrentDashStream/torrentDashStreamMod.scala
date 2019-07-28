package typings.torrentDashStream

import typings.node.Buffer
import typings.torrentDashStream.TorrentStreamNs.TorrentEngine
import typings.torrentDashStream.TorrentStreamNs.TorrentEngineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("torrent-stream", JSImport.Namespace)
@js.native
object torrentDashStreamMod extends js.Object {
  def apply(magnet: String | Buffer): TorrentEngine = js.native
  def apply(magnet: String | Buffer, options: TorrentEngineOptions): TorrentEngine = js.native
}

