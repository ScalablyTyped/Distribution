package typings.torrentStream

import typings.torrentStream.torrentStreamStrings.download
import typings.torrentStream.torrentStreamStrings.idle
import typings.torrentStream.torrentStreamStrings.ready
import typings.torrentStream.torrentStreamStrings.torrent
import typings.torrentStream.torrentStreamStrings.upload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TorrentStream {
  
  trait ReadStreamOptions extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object ReadStreamOptions {
    
    @scala.inline
    def apply(end: Double, start: Double): ReadStreamOptions = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadStreamOptions]
    }
    
    @scala.inline
    implicit class ReadStreamOptionsMutableBuilder[Self <: ReadStreamOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Swarm extends StObject {
    
    var downloaded: Double
  }
  object Swarm {
    
    @scala.inline
    def apply(downloaded: Double): Swarm = {
      val __obj = js.Dynamic.literal(downloaded = downloaded.asInstanceOf[js.Any])
      __obj.asInstanceOf[Swarm]
    }
    
    @scala.inline
    implicit class SwarmMutableBuilder[Self <: Swarm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownloaded(value: Double): Self = StObject.set(x, "downloaded", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TorrentEngine extends StObject {
    
    def block(peer: String): Unit = js.native
    
    def connect(peer: String): Unit = js.native
    
    def destroy(callback: js.Function0[Unit]): Unit = js.native
    
    def disconnect(peer: String): Unit = js.native
    
    var files: js.Array[TorrentFile] = js.native
    
    var infoHash: String = js.native
    
    def listen(port: Double, callback: js.Function0[Unit]): Unit = js.native
    
    def on(event: String, callback: js.Function): Unit = js.native
    @JSName("on")
    def on_download(event: download, callback: js.Function1[/* pieceIndex */ Double, Unit]): Unit = js.native
    @JSName("on")
    def on_idle(event: idle, callback: js.Function): Unit = js.native
    // Events
    @JSName("on")
    def on_ready(event: ready, callback: js.Function): Unit = js.native
    @JSName("on")
    def on_torrent(event: torrent, callback: js.Function): Unit = js.native
    @JSName("on")
    def on_upload(
      event: upload,
      callback: js.Function3[/* pieceIndex */ Double, /* offset */ Double, /* length */ Double, Unit]
    ): Unit = js.native
    
    def remove(keepPieces: Boolean, callback: js.Function0[Unit]): Unit = js.native
    
    var swarm: Swarm = js.native
  }
  
  trait TorrentEngineOptions extends StObject {
    
    var connections: js.UndefOr[Double] = js.undefined
    
    // Verify previously stored data before starting.
    var dht: js.UndefOr[Boolean] = js.undefined
    
    // Root folder for the files storage. Default folder under /tmp/torrent-stream/{infoHash}.
    var path: js.UndefOr[String] = js.undefined
    
    // Allows to declare additional custom trackers to use.
    var storage: js.UndefOr[js.Any] = js.undefined
    
    // Number of upload slots.
    var tmp: js.UndefOr[String] = js.undefined
    
    // Whether or not to use DHT to initialize the swarm.
    var tracker: js.UndefOr[Boolean] = js.undefined
    
    // Whether or not to use trackers from torrent file or magnet link.
    var trackers: js.UndefOr[js.Array[String]] = js.undefined
    
    // Max amount of peers to be connected to.
    var uploads: js.UndefOr[Double] = js.undefined
    
    // Path where to save the files. Overrides 'tmp'.
    var verify: js.UndefOr[Boolean] = js.undefined
  }
  object TorrentEngineOptions {
    
    @scala.inline
    def apply(): TorrentEngineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TorrentEngineOptions]
    }
    
    @scala.inline
    implicit class TorrentEngineOptionsMutableBuilder[Self <: TorrentEngineOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnections(value: Double): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
      
      @scala.inline
      def setDht(value: Boolean): Self = StObject.set(x, "dht", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDhtUndefined: Self = StObject.set(x, "dht", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setStorage(value: js.Any): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
      
      @scala.inline
      def setTmp(value: String): Self = StObject.set(x, "tmp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTmpUndefined: Self = StObject.set(x, "tmp", js.undefined)
      
      @scala.inline
      def setTracker(value: Boolean): Self = StObject.set(x, "tracker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackerUndefined: Self = StObject.set(x, "tracker", js.undefined)
      
      @scala.inline
      def setTrackers(value: js.Array[String]): Self = StObject.set(x, "trackers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackersUndefined: Self = StObject.set(x, "trackers", js.undefined)
      
      @scala.inline
      def setTrackersVarargs(value: String*): Self = StObject.set(x, "trackers", js.Array(value :_*))
      
      @scala.inline
      def setUploads(value: Double): Self = StObject.set(x, "uploads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadsUndefined: Self = StObject.set(x, "uploads", js.undefined)
      
      @scala.inline
      def setVerify(value: Boolean): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
    }
  }
  
  @js.native
  trait TorrentFile extends StObject {
    
    def createReadStream(): js.Any = js.native
    def createReadStream(options: ReadStreamOptions): js.Any = js.native
    
    def deselect(): Unit = js.native
    
    var length: Double = js.native
    
    var name: String = js.native
    
    var path: String = js.native
    
    def select(): Unit = js.native
  }
}
