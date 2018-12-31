package typings
package torrentDashStreamLib.TorrentStreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TorrentEngine extends js.Object {
  var files: js.Array[TorrentFile] = js.native
  var infoHash: java.lang.String = js.native
  var swarm: Swarm = js.native
  def block(peer: java.lang.String): scala.Unit = js.native
  def connect(peer: java.lang.String): scala.Unit = js.native
  def destroy(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def disconnect(peer: java.lang.String): scala.Unit = js.native
  def listen(port: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def on(event: java.lang.String, callback: js.Function): scala.Unit = js.native
  @JSName("on")
  def on_download(
    event: torrentDashStreamLib.torrentDashStreamLibStrings.download,
    callback: js.Function1[/* pieceIndex */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_idle(event: torrentDashStreamLib.torrentDashStreamLibStrings.idle, callback: js.Function): scala.Unit = js.native
  // Events
  @JSName("on")
  def on_ready(event: torrentDashStreamLib.torrentDashStreamLibStrings.ready, callback: js.Function): scala.Unit = js.native
  @JSName("on")
  def on_torrent(event: torrentDashStreamLib.torrentDashStreamLibStrings.torrent, callback: js.Function): scala.Unit = js.native
  @JSName("on")
  def on_upload(
    event: torrentDashStreamLib.torrentDashStreamLibStrings.upload,
    callback: js.Function3[
      /* pieceIndex */ scala.Double, 
      /* offset */ scala.Double, 
      /* length */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def remove(keepPieces: scala.Boolean, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

