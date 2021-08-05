package typings.torrentStream

import typings.node.Buffer
import typings.torrentStream.TorrentStream.TorrentEngine
import typings.torrentStream.TorrentStream.TorrentEngineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(magnet: String): TorrentEngine = ^.asInstanceOf[js.Dynamic].apply(magnet.asInstanceOf[js.Any]).asInstanceOf[TorrentEngine]
  inline def apply(magnet: String, options: TorrentEngineOptions): TorrentEngine = (^.asInstanceOf[js.Dynamic].apply(magnet.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TorrentEngine]
  inline def apply(magnet: Buffer): TorrentEngine = ^.asInstanceOf[js.Dynamic].apply(magnet.asInstanceOf[js.Any]).asInstanceOf[TorrentEngine]
  inline def apply(magnet: Buffer, options: TorrentEngineOptions): TorrentEngine = (^.asInstanceOf[js.Dynamic].apply(magnet.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TorrentEngine]
  
  @JSImport("torrent-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
