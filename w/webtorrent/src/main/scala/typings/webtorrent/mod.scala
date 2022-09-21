package typings.webtorrent

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.bittorrentProtocol.mod.Wire
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestOptions
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeNetMod.Socket
import typings.std.Blob
import typings.std.File
import typings.std.FileList
import typings.std.HTMLElement
import typings.std.HTMLMediaElement
import typings.std.ReadableStream
import typings.webtorrent.anon.Autoplay
import typings.webtorrent.anon.End
import typings.webtorrent.anon.Files
import typings.webtorrent.webtorrentStrings.dht
import typings.webtorrent.webtorrentStrings.download
import typings.webtorrent.webtorrentStrings.error
import typings.webtorrent.webtorrentStrings.metadata
import typings.webtorrent.webtorrentStrings.noPeers
import typings.webtorrent.webtorrentStrings.torrent
import typings.webtorrent.webtorrentStrings.tracker
import typings.webtorrent.webtorrentStrings.upload
import typings.webtorrent.webtorrentStrings.warning
import typings.webtorrent.webtorrentStrings.wire
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("webtorrent", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Instance {
    def this(config: Options) = this()
  }
  @JSImport("webtorrent", JSImport.Namespace)
  @js.native
  val ^ : js.Object & WebTorrent = js.native
  
  @js.native
  trait Instance
    extends StObject
       with EventEmitter {
    
    def add(torrent: String): Torrent = js.native
    def add(torrent: String, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def add(torrent: String, opts: Unit, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def add(torrent: String, opts: TorrentOptions): Torrent = js.native
    def add(torrent: String, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def add(torrent: Buffer): Torrent = js.native
    def add(torrent: Buffer, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def add(torrent: Buffer, opts: Unit, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def add(torrent: Buffer, opts: TorrentOptions): Torrent = js.native
    def add(torrent: Buffer, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def add(torrent: typings.parseTorrent.mod.Instance): Torrent = js.native
    def add(torrent: typings.parseTorrent.mod.Instance, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def add(
      torrent: typings.parseTorrent.mod.Instance,
      opts: Unit,
      cb: js.Function1[/* torrent */ Torrent, Any]
    ): Torrent = js.native
    def add(torrent: typings.parseTorrent.mod.Instance, opts: TorrentOptions): Torrent = js.native
    def add(
      torrent: typings.parseTorrent.mod.Instance,
      opts: TorrentOptions,
      cb: js.Function1[/* torrent */ Torrent, Any]
    ): Torrent = js.native
    def add(torrent: File): Torrent = js.native
    def add(torrent: File, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def add(torrent: File, opts: Unit, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def add(torrent: File, opts: TorrentOptions): Torrent = js.native
    def add(torrent: File, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    
    def destroy(): Unit = js.native
    def destroy(callback: js.Function1[/* err */ js.Error | String, Unit]): Unit = js.native
    
    val downloadSpeed: Double = js.native
    
    def get(torrentId: String): Torrent | Unit = js.native
    def get(torrentId: Buffer): Torrent | Unit = js.native
    def get(torrentId: Torrent): Torrent | Unit = js.native
    
    @JSName("on")
    def on_error(event: error, callback: js.Function1[/* err */ js.Error | String, Unit]): this.type = js.native
    @JSName("on")
    def on_torrent(event: torrent, callback: js.Function1[/* torrent */ Torrent, Unit]): this.type = js.native
    
    val progress: Double = js.native
    
    val ratio: Double = js.native
    
    def remove(torrentId: String): Unit = js.native
    def remove(torrentId: String, opts: Unit, callback: js.Function1[/* err */ js.Error | String, Unit]): Unit = js.native
    def remove(torrentId: String, opts: TorrentDestroyOptions): Unit = js.native
    def remove(
      torrentId: String,
      opts: TorrentDestroyOptions,
      callback: js.Function1[/* err */ js.Error | String, Unit]
    ): Unit = js.native
    def remove(torrentId: Buffer): Unit = js.native
    def remove(torrentId: Buffer, opts: Unit, callback: js.Function1[/* err */ js.Error | String, Unit]): Unit = js.native
    def remove(torrentId: Buffer, opts: TorrentDestroyOptions): Unit = js.native
    def remove(
      torrentId: Buffer,
      opts: TorrentDestroyOptions,
      callback: js.Function1[/* err */ js.Error | String, Unit]
    ): Unit = js.native
    def remove(torrentId: Torrent): Unit = js.native
    def remove(torrentId: Torrent, opts: Unit, callback: js.Function1[/* err */ js.Error | String, Unit]): Unit = js.native
    def remove(torrentId: Torrent, opts: TorrentDestroyOptions): Unit = js.native
    def remove(
      torrentId: Torrent,
      opts: TorrentDestroyOptions,
      callback: js.Function1[/* err */ js.Error | String, Unit]
    ): Unit = js.native
    
    def seed(input: String): Torrent = js.native
    def seed(input: String, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def seed(input: String, opts: Unit, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def seed(input: String, opts: TorrentOptions): Torrent = js.native
    def seed(input: String, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def seed(input: js.Array[Buffer | File | ReadableStream[Any] | String]): Torrent = js.native
    def seed(
      input: js.Array[Buffer | File | ReadableStream[Any] | String],
      cb: js.Function1[/* torrent */ Torrent, Any]
    ): Torrent = js.native
    def seed(
      input: js.Array[Buffer | File | ReadableStream[Any] | String],
      opts: Unit,
      cb: js.Function1[/* torrent */ Torrent, Any]
    ): Torrent = js.native
    def seed(input: js.Array[Buffer | File | ReadableStream[Any] | String], opts: TorrentOptions): Torrent = js.native
    def seed(
      input: js.Array[Buffer | File | ReadableStream[Any] | String],
      opts: TorrentOptions,
      cb: js.Function1[/* torrent */ Torrent, Any]
    ): Torrent = js.native
    def seed(input: Buffer): Torrent = js.native
    def seed(input: Buffer, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def seed(input: Buffer, opts: Unit, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def seed(input: Buffer, opts: TorrentOptions): Torrent = js.native
    def seed(input: Buffer, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def seed(input: File): Torrent = js.native
    def seed(input: FileList): Torrent = js.native
    def seed(input: FileList, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def seed(input: FileList, opts: Unit, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def seed(input: FileList, opts: TorrentOptions): Torrent = js.native
    def seed(input: FileList, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def seed(input: File, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def seed(input: File, opts: Unit, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def seed(input: File, opts: TorrentOptions): Torrent = js.native
    def seed(input: File, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def seed(input: ReadableStream[Any]): Torrent = js.native
    def seed(input: ReadableStream[Any], cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def seed(input: ReadableStream[Any], opts: Unit, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    def seed(input: ReadableStream[Any], opts: TorrentOptions): Torrent = js.native
    def seed(input: ReadableStream[Any], opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, Any]): Torrent = js.native
    
    val torrents: js.Array[Torrent] = js.native
    
    val uploadSpeed: Double = js.native
  }
  
  trait Options extends StObject {
    
    var dht: js.UndefOr[Boolean | js.Object] = js.undefined
    
    var maxConns: js.UndefOr[Double] = js.undefined
    
    var nodeId: js.UndefOr[String | Buffer] = js.undefined
    
    var peerId: js.UndefOr[String | Buffer] = js.undefined
    
    var tracker: js.UndefOr[Boolean | js.Object] = js.undefined
    
    var utp: js.UndefOr[Boolean] = js.undefined
    
    var webSeeds: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDht(value: Boolean | js.Object): Self = StObject.set(x, "dht", value.asInstanceOf[js.Any])
      
      inline def setDhtUndefined: Self = StObject.set(x, "dht", js.undefined)
      
      inline def setMaxConns(value: Double): Self = StObject.set(x, "maxConns", value.asInstanceOf[js.Any])
      
      inline def setMaxConnsUndefined: Self = StObject.set(x, "maxConns", js.undefined)
      
      inline def setNodeId(value: String | Buffer): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
      
      inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
      
      inline def setPeerId(value: String | Buffer): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerIdUndefined: Self = StObject.set(x, "peerId", js.undefined)
      
      inline def setTracker(value: Boolean | js.Object): Self = StObject.set(x, "tracker", value.asInstanceOf[js.Any])
      
      inline def setTrackerUndefined: Self = StObject.set(x, "tracker", js.undefined)
      
      inline def setUtp(value: Boolean): Self = StObject.set(x, "utp", value.asInstanceOf[js.Any])
      
      inline def setUtpUndefined: Self = StObject.set(x, "utp", js.undefined)
      
      inline def setWebSeeds(value: Boolean): Self = StObject.set(x, "webSeeds", value.asInstanceOf[js.Any])
      
      inline def setWebSeedsUndefined: Self = StObject.set(x, "webSeeds", js.undefined)
    }
  }
  
  @js.native
  trait Torrent
    extends StObject
       with EventEmitter {
    
    def addPeer(peer: String): Boolean = js.native
    def addPeer(peer: typings.simplePeer.mod.Instance): Boolean = js.native
    
    def addWebSeed(url: String): Unit = js.native
    
    val announce: js.Array[String] = js.native
    
    val `announce-list`: js.Array[js.Array[String]] = js.native
    
    val comment: String = js.native
    
    def createServer(): Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
    def createServer(opts: RequestOptions): Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
    
    val created: js.Date = js.native
    
    val createdBy: String = js.native
    
    def deselect(start: Double, end: Double, priority: Double): Unit = js.native
    
    def destroy(): Unit = js.native
    def destroy(opts: Unit, cb: js.Function1[/* err */ js.Error | String, Unit]): Unit = js.native
    def destroy(opts: TorrentDestroyOptions): Unit = js.native
    def destroy(opts: TorrentDestroyOptions, cb: js.Function1[/* err */ js.Error | String, Unit]): Unit = js.native
    
    val done: Boolean = js.native
    
    val downloadSpeed: Double = js.native
    
    val downloaded: Double = js.native
    
    val files: js.Array[TorrentFile] = js.native
    
    val infoHash: String = js.native
    
    val lastPieceLength: Double = js.native
    
    val length: Double = js.native
    
    val magnetURI: String = js.native
    
    val maxWebConns: Double = js.native
    
    val name: String = js.native
    
    val numPeers: Double = js.native
    
    def on(
      event: typings.webtorrent.webtorrentStrings.infoHash | metadata | typings.webtorrent.webtorrentStrings.ready | typings.webtorrent.webtorrentStrings.done,
      callback: js.Function0[Unit]
    ): this.type = js.native
    def on(
      event: download | error | upload | warning,
      callback: js.Function1[(/* bytes */ Double) | js.Error | String, Unit]
    ): this.type = js.native
    def on(event: noPeers, callback: js.Function1[/* announceType */ tracker | dht, Unit]): this.type = js.native
    @JSName("on")
    def on_wire(event: wire, callback: js.Function2[/* wire */ Wire, /* addr */ js.UndefOr[String], Unit]): this.type = js.native
    
    val path: String = js.native
    
    def pause(): Unit = js.native
    
    val paused: Boolean = js.native
    
    val pieceLength: Double = js.native
    
    val pieces: js.Array[TorrentPiece | Null] = js.native
    
    val progress: Double = js.native
    
    val ratio: Double = js.native
    
    val ready: Boolean = js.native
    
    val received: Double = js.native
    
    def removePeer(peer: String): Unit = js.native
    def removePeer(peer: typings.simplePeer.mod.Instance): Unit = js.native
    
    def resume(): Unit = js.native
    
    def select(start: Double, end: Double): Unit = js.native
    def select(start: Double, end: Double, priority: Double): Unit = js.native
    def select(start: Double, end: Double, priority: Double, notify: js.Function0[Unit]): Unit = js.native
    def select(start: Double, end: Double, priority: Unit, notify: js.Function0[Unit]): Unit = js.native
    
    val timeRemaining: Double = js.native
    
    val torrentFile: Buffer = js.native
    
    val torrentFileBlobURL: String = js.native
    
    val uploadSpeed: Double = js.native
    
    val uploaded: Double = js.native
  }
  
  trait TorrentDestroyOptions extends StObject {
    
    var destroyStore: js.UndefOr[Boolean] = js.undefined
  }
  object TorrentDestroyOptions {
    
    inline def apply(): TorrentDestroyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TorrentDestroyOptions]
    }
    
    extension [Self <: TorrentDestroyOptions](x: Self) {
      
      inline def setDestroyStore(value: Boolean): Self = StObject.set(x, "destroyStore", value.asInstanceOf[js.Any])
      
      inline def setDestroyStoreUndefined: Self = StObject.set(x, "destroyStore", js.undefined)
    }
  }
  
  @js.native
  trait TorrentFile
    extends StObject
       with EventEmitter {
    
    def appendTo(rootElement: String): Unit = js.native
    def appendTo(
      rootElement: String,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    def appendTo(
      rootElement: String,
      opts: Unit,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    def appendTo(rootElement: String, opts: Autoplay): Unit = js.native
    def appendTo(
      rootElement: String,
      opts: Autoplay,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    def appendTo(rootElement: HTMLElement): Unit = js.native
    def appendTo(
      rootElement: HTMLElement,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    def appendTo(
      rootElement: HTMLElement,
      opts: Unit,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    def appendTo(rootElement: HTMLElement, opts: Autoplay): Unit = js.native
    def appendTo(
      rootElement: HTMLElement,
      opts: Autoplay,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    
    def createReadStream(): ReadableStream[Any] = js.native
    def createReadStream(opts: End): ReadableStream[Any] = js.native
    
    def deselect(): Unit = js.native
    
    val downloaded: Double = js.native
    
    def getBlob(callback: js.Function2[/* err */ js.UndefOr[String | js.Error], /* blob */ js.UndefOr[Blob], Unit]): Unit = js.native
    
    def getBlobURL(
      callback: js.Function2[/* err */ js.UndefOr[String | js.Error], /* blobURL */ js.UndefOr[String], Unit]
    ): Unit = js.native
    
    def getBuffer(
      callback: js.Function2[/* err */ js.UndefOr[String | js.Error], /* buffer */ js.UndefOr[Buffer], Unit]
    ): Unit = js.native
    
    val length: Double = js.native
    
    val name: String = js.native
    
    val path: String = js.native
    
    val progress: Double = js.native
    
    def renderTo(rootElement: String): Unit = js.native
    def renderTo(
      rootElement: String,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    def renderTo(
      rootElement: String,
      opts: Unit,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    def renderTo(rootElement: String, opts: Autoplay): Unit = js.native
    def renderTo(
      rootElement: String,
      opts: Autoplay,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    def renderTo(rootElement: HTMLMediaElement): Unit = js.native
    def renderTo(
      rootElement: HTMLMediaElement,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    def renderTo(
      rootElement: HTMLMediaElement,
      opts: Unit,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    def renderTo(rootElement: HTMLMediaElement, opts: Autoplay): Unit = js.native
    def renderTo(
      rootElement: HTMLMediaElement,
      opts: Autoplay,
      callback: js.Function2[/* err */ js.UndefOr[js.Error], /* element */ HTMLMediaElement, Unit]
    ): Unit = js.native
    
    def select(): Unit = js.native
  }
  
  trait TorrentOptions extends StObject {
    
    var announce: js.UndefOr[js.Array[String]] = js.undefined
    
    var announceList: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
    
    var destroyStoreOnDestroy: js.UndefOr[Boolean] = js.undefined
    
    var getAnnounceOpts: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var maxWebConns: js.UndefOr[Double] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var preloadedStore: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var `private`: js.UndefOr[Boolean] = js.undefined
    
    var skipVerify: js.UndefOr[Boolean] = js.undefined
    
    var store: js.UndefOr[js.Function2[/* chunkLength */ Double, /* storeOpts */ Files, Any]] = js.undefined
    
    var storeCacheSlots: js.UndefOr[Double] = js.undefined
    
    var strategy: js.UndefOr[String] = js.undefined
    
    var urlList: js.UndefOr[js.Array[String]] = js.undefined
  }
  object TorrentOptions {
    
    inline def apply(): TorrentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TorrentOptions]
    }
    
    extension [Self <: TorrentOptions](x: Self) {
      
      inline def setAnnounce(value: js.Array[String]): Self = StObject.set(x, "announce", value.asInstanceOf[js.Any])
      
      inline def setAnnounceList(value: js.Array[js.Array[String]]): Self = StObject.set(x, "announceList", value.asInstanceOf[js.Any])
      
      inline def setAnnounceListUndefined: Self = StObject.set(x, "announceList", js.undefined)
      
      inline def setAnnounceListVarargs(value: js.Array[String]*): Self = StObject.set(x, "announceList", js.Array(value*))
      
      inline def setAnnounceUndefined: Self = StObject.set(x, "announce", js.undefined)
      
      inline def setAnnounceVarargs(value: String*): Self = StObject.set(x, "announce", js.Array(value*))
      
      inline def setDestroyStoreOnDestroy(value: Boolean): Self = StObject.set(x, "destroyStoreOnDestroy", value.asInstanceOf[js.Any])
      
      inline def setDestroyStoreOnDestroyUndefined: Self = StObject.set(x, "destroyStoreOnDestroy", js.undefined)
      
      inline def setGetAnnounceOpts(value: () => Unit): Self = StObject.set(x, "getAnnounceOpts", js.Any.fromFunction0(value))
      
      inline def setGetAnnounceOptsUndefined: Self = StObject.set(x, "getAnnounceOpts", js.undefined)
      
      inline def setMaxWebConns(value: Double): Self = StObject.set(x, "maxWebConns", value.asInstanceOf[js.Any])
      
      inline def setMaxWebConnsUndefined: Self = StObject.set(x, "maxWebConns", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPreloadedStore(value: () => Unit): Self = StObject.set(x, "preloadedStore", js.Any.fromFunction0(value))
      
      inline def setPreloadedStoreUndefined: Self = StObject.set(x, "preloadedStore", js.undefined)
      
      inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      inline def setSkipVerify(value: Boolean): Self = StObject.set(x, "skipVerify", value.asInstanceOf[js.Any])
      
      inline def setSkipVerifyUndefined: Self = StObject.set(x, "skipVerify", js.undefined)
      
      inline def setStore(value: (/* chunkLength */ Double, /* storeOpts */ Files) => Any): Self = StObject.set(x, "store", js.Any.fromFunction2(value))
      
      inline def setStoreCacheSlots(value: Double): Self = StObject.set(x, "storeCacheSlots", value.asInstanceOf[js.Any])
      
      inline def setStoreCacheSlotsUndefined: Self = StObject.set(x, "storeCacheSlots", js.undefined)
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
      
      inline def setUrlList(value: js.Array[String]): Self = StObject.set(x, "urlList", value.asInstanceOf[js.Any])
      
      inline def setUrlListUndefined: Self = StObject.set(x, "urlList", js.undefined)
      
      inline def setUrlListVarargs(value: String*): Self = StObject.set(x, "urlList", js.Array(value*))
    }
  }
  
  trait TorrentPiece extends StObject {
    
    val length: Double
    
    val missing: Double
  }
  object TorrentPiece {
    
    inline def apply(length: Double, missing: Double): TorrentPiece = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any])
      __obj.asInstanceOf[TorrentPiece]
    }
    
    extension [Self <: TorrentPiece](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMissing(value: Double): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebTorrent
    extends StObject
       with Instantiable0[Instance]
       with Instantiable1[/* config */ Options, Instance] {
    
    def apply(): Instance = js.native
    def apply(config: Options): Instance = js.native
    
    var WEBRTC_SUPPORT: Boolean = js.native
  }
  
  type _To = js.Object & WebTorrent
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & WebTorrent = ^
}
