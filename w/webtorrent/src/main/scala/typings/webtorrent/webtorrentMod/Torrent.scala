package typings.webtorrent.webtorrentMod

import typings.bittorrentDashProtocol.bittorrentDashProtocolMod.Wire
import typings.node.Buffer
import typings.node.NodeJSNs.EventEmitter
import typings.node.httpMod.RequestOptions
import typings.node.httpMod.Server
import typings.std.Date
import typings.std.Error
import typings.webtorrent.webtorrentStrings.dht
import typings.webtorrent.webtorrentStrings.download
import typings.webtorrent.webtorrentStrings.error
import typings.webtorrent.webtorrentStrings.metadata
import typings.webtorrent.webtorrentStrings.noPeers
import typings.webtorrent.webtorrentStrings.tracker
import typings.webtorrent.webtorrentStrings.upload
import typings.webtorrent.webtorrentStrings.warning
import typings.webtorrent.webtorrentStrings.wire
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Torrent extends EventEmitter {
  val announce: js.Array[String] = js.native
  val comment: String = js.native
  val created: Date = js.native
  val createdBy: String = js.native
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
  val path: String = js.native
  val paused: Boolean = js.native
  val pieceLength: Double = js.native
  val pieces: js.Array[TorrentPiece | Null] = js.native
  val progress: Double = js.native
  val ratio: Double = js.native
  val ready: Boolean = js.native
  val received: Double = js.native
  val timeRemaining: Double = js.native
  val torrentFile: Buffer = js.native
  val torrentFileBlobURL: String = js.native
  val uploadSpeed: Double = js.native
  val uploaded: Double = js.native
  def addPeer(peer: String): Boolean = js.native
  def addPeer(peer: typings.simpleDashPeer.simpleDashPeerMod.Instance): Boolean = js.native
  def addWebSeed(url: String): Unit = js.native
  def createServer(): Server = js.native
  def createServer(opts: RequestOptions): Server = js.native
  def deselect(start: Double, end: Double, priority: Double): Unit = js.native
  def destroy(): Unit = js.native
  def destroy(cb: js.Function1[/* err */ Error | String, Unit]): Unit = js.native
  def on(event: noPeers, callback: js.Function1[/* announceType */ tracker | dht, Unit]): this.type = js.native
  @JSName("on")
  def on_done(event: typings.webtorrent.webtorrentStrings.done, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_download(event: download, callback: js.Function1[/* bytes */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* err */ Error | String, Unit]): this.type = js.native
  @JSName("on")
  def on_infoHash(event: typings.webtorrent.webtorrentStrings.infoHash, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_metadata(event: metadata, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: typings.webtorrent.webtorrentStrings.ready, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_upload(event: upload, callback: js.Function1[/* bytes */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_warning(event: warning, callback: js.Function1[/* err */ Error | String, Unit]): this.type = js.native
  @JSName("on")
  def on_wire(event: wire, callback: js.Function2[/* wire */ Wire, /* addr */ js.UndefOr[String], Unit]): this.type = js.native
  def pause(): Unit = js.native
  def removePeer(peer: String): Unit = js.native
  def removePeer(peer: typings.simpleDashPeer.simpleDashPeerMod.Instance): Unit = js.native
  def resume(): Unit = js.native
  def select(start: Double, end: Double): Unit = js.native
  def select(start: Double, end: Double, priority: Double): Unit = js.native
  def select(start: Double, end: Double, priority: Double, notify: js.Function0[Unit]): Unit = js.native
}

