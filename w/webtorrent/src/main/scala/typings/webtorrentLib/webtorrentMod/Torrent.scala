package typings
package webtorrentLib.webtorrentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Torrent
  extends nodeLib.NodeJSNs.EventEmitter {
  val downloadSpeed: scala.Double = js.native
  val downloaded: scala.Double = js.native
  val files: js.Array[TorrentFile] = js.native
  val infoHash: java.lang.String = js.native
  val magnetURI: java.lang.String = js.native
  val name: java.lang.String = js.native
  val numPeers: scala.Double = js.native
  val path: java.lang.String = js.native
  val progress: scala.Double = js.native
  val ratio: scala.Double = js.native
  val ready: scala.Boolean = js.native
  val received: scala.Double = js.native
  val timeRemaining: scala.Double = js.native
  val torrentFile: nodeLib.Buffer = js.native
  val torrentFileBlobURL: java.lang.String = js.native
  val uploadSpeed: scala.Double = js.native
  val uploaded: scala.Double = js.native
  def addPeer(peer: java.lang.String): scala.Boolean = js.native
  def addPeer(peer: simpleDashPeerLib.simpleDashPeerMod.Instance): scala.Boolean = js.native
  def addWebSeed(url: java.lang.String): scala.Unit = js.native
  def createServer(): nodeLib.httpMod.Server = js.native
  def createServer(opts: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.Server = js.native
  def deselect(start: scala.Double, end: scala.Double, priority: scala.Double): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def destroy(cb: js.Function1[/* err */ stdLib.Error | java.lang.String, scala.Unit]): scala.Unit = js.native
  def on(
    event: webtorrentLib.webtorrentLibStrings.noPeers,
    callback: js.Function1[
      /* announceType */ webtorrentLib.webtorrentLibStrings.tracker | webtorrentLib.webtorrentLibStrings.dht, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_done(event: webtorrentLib.webtorrentLibStrings.done, callback: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_download(
    event: webtorrentLib.webtorrentLibStrings.download,
    callback: js.Function1[/* bytes */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: webtorrentLib.webtorrentLibStrings.error,
    callback: js.Function1[/* err */ stdLib.Error | java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_infoHash(event: webtorrentLib.webtorrentLibStrings.infoHash, callback: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_metadata(event: webtorrentLib.webtorrentLibStrings.metadata, callback: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: webtorrentLib.webtorrentLibStrings.ready, callback: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_upload(
    event: webtorrentLib.webtorrentLibStrings.upload,
    callback: js.Function1[/* bytes */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_warning(
    event: webtorrentLib.webtorrentLibStrings.warning,
    callback: js.Function1[/* err */ stdLib.Error | java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_wire(
    event: webtorrentLib.webtorrentLibStrings.wire,
    callback: js.Function2[
      /* wire */ bittorrentDashProtocolLib.bittorrentDashProtocolMod.Wire, 
      /* addr */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): this.type = js.native
  def pause(): scala.Unit = js.native
  def removePeer(peer: java.lang.String): scala.Unit = js.native
  def removePeer(peer: simpleDashPeerLib.simpleDashPeerMod.Instance): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def select(start: scala.Double, end: scala.Double): scala.Unit = js.native
  def select(start: scala.Double, end: scala.Double, priority: scala.Double): scala.Unit = js.native
  def select(start: scala.Double, end: scala.Double, priority: scala.Double, notify: js.Function0[scala.Unit]): scala.Unit = js.native
}

