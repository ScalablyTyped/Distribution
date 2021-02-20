package typings.torrentStream

import typings.node.Buffer
import typings.torrentStream.TorrentStream.TorrentEngine
import typings.torrentStream.TorrentStream.TorrentEngineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("torrent-stream", JSImport.Namespace)
  @js.native
  def apply(magnet: String): TorrentEngine = js.native
  @JSImport("torrent-stream", JSImport.Namespace)
  @js.native
  def apply(magnet: String, options: TorrentEngineOptions): TorrentEngine = js.native
  @JSImport("torrent-stream", JSImport.Namespace)
  @js.native
  def apply(magnet: Buffer): TorrentEngine = js.native
  @JSImport("torrent-stream", JSImport.Namespace)
  @js.native
  def apply(magnet: Buffer, options: TorrentEngineOptions): TorrentEngine = js.native
}
