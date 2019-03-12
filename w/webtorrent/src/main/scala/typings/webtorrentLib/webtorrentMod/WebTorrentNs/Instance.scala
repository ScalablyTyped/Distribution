package typings
package webtorrentLib.webtorrentMod.WebTorrentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance
  extends nodeLib.NodeJSNs.EventEmitter {
  val downloadSpeed: scala.Double = js.native
  val progress: scala.Double = js.native
  val ratio: scala.Double = js.native
  val torrents: js.Array[Torrent] = js.native
  val uploadSpeed: scala.Double = js.native
  def add(torrent: java.lang.String): Torrent = js.native
  def add(torrent: java.lang.String, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def add(torrent: java.lang.String, opts: TorrentOptions): Torrent = js.native
  def add(torrent: java.lang.String, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def add(torrent: nodeLib.Buffer): Torrent = js.native
  def add(torrent: nodeLib.Buffer, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def add(torrent: nodeLib.Buffer, opts: TorrentOptions): Torrent = js.native
  def add(torrent: nodeLib.Buffer, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def add(torrent: parseDashTorrentLib.parseDashTorrentMod.ParseTorrentNs.Instance): Torrent = js.native
  def add(
    torrent: parseDashTorrentLib.parseDashTorrentMod.ParseTorrentNs.Instance,
    cb: js.Function1[/* torrent */ Torrent, _]
  ): Torrent = js.native
  def add(torrent: parseDashTorrentLib.parseDashTorrentMod.ParseTorrentNs.Instance, opts: TorrentOptions): Torrent = js.native
  def add(
    torrent: parseDashTorrentLib.parseDashTorrentMod.ParseTorrentNs.Instance,
    opts: TorrentOptions,
    cb: js.Function1[/* torrent */ Torrent, _]
  ): Torrent = js.native
  def destroy(): scala.Unit = js.native
  def destroy(callback: js.Function1[/* err */ stdLib.Error | java.lang.String, scala.Unit]): scala.Unit = js.native
  def get(torrentId: java.lang.String): Torrent | scala.Unit = js.native
  def get(torrentId: nodeLib.Buffer): Torrent | scala.Unit = js.native
  def get(torrentId: Torrent): Torrent | scala.Unit = js.native
  @JSName("on")
  def on_error(
    event: webtorrentLib.webtorrentLibStrings.error,
    callback: js.Function1[/* err */ stdLib.Error | java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_torrent(
    event: webtorrentLib.webtorrentLibStrings.torrent,
    callback: js.Function1[/* torrent */ Torrent, scala.Unit]
  ): this.type = js.native
  def remove(torrentId: java.lang.String): scala.Unit = js.native
  def remove(
    torrentId: java.lang.String,
    callback: js.Function1[/* err */ stdLib.Error | java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def remove(torrentId: nodeLib.Buffer): scala.Unit = js.native
  def remove(
    torrentId: nodeLib.Buffer,
    callback: js.Function1[/* err */ stdLib.Error | java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def remove(torrentId: Torrent): scala.Unit = js.native
  def remove(torrentId: Torrent, callback: js.Function1[/* err */ stdLib.Error | java.lang.String, scala.Unit]): scala.Unit = js.native
  def seed(input: java.lang.String): Torrent = js.native
  def seed(input: java.lang.String, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: java.lang.String, opts: TorrentOptions): Torrent = js.native
  def seed(input: java.lang.String, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(
    input: js.Array[
      nodeLib.Buffer | stdLib.File | nodeLib.NodeJSNs.ReadableStream | java.lang.String
    ]
  ): Torrent = js.native
  def seed(
    input: js.Array[
      nodeLib.Buffer | stdLib.File | nodeLib.NodeJSNs.ReadableStream | java.lang.String
    ],
    cb: js.Function1[/* torrent */ Torrent, _]
  ): Torrent = js.native
  def seed(
    input: js.Array[
      nodeLib.Buffer | stdLib.File | nodeLib.NodeJSNs.ReadableStream | java.lang.String
    ],
    opts: TorrentOptions
  ): Torrent = js.native
  def seed(
    input: js.Array[
      nodeLib.Buffer | stdLib.File | nodeLib.NodeJSNs.ReadableStream | java.lang.String
    ],
    opts: TorrentOptions,
    cb: js.Function1[/* torrent */ Torrent, _]
  ): Torrent = js.native
  def seed(input: nodeLib.Buffer): Torrent = js.native
  def seed(input: nodeLib.Buffer, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: nodeLib.Buffer, opts: TorrentOptions): Torrent = js.native
  def seed(input: nodeLib.Buffer, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: nodeLib.NodeJSNs.ReadableStream): Torrent = js.native
  def seed(input: nodeLib.NodeJSNs.ReadableStream, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: nodeLib.NodeJSNs.ReadableStream, opts: TorrentOptions): Torrent = js.native
  def seed(
    input: nodeLib.NodeJSNs.ReadableStream,
    opts: TorrentOptions,
    cb: js.Function1[/* torrent */ Torrent, _]
  ): Torrent = js.native
  def seed(input: stdLib.File): Torrent = js.native
  def seed(input: stdLib.FileList): Torrent = js.native
  def seed(input: stdLib.FileList, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: stdLib.FileList, opts: TorrentOptions): Torrent = js.native
  def seed(input: stdLib.FileList, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: stdLib.File, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: stdLib.File, opts: TorrentOptions): Torrent = js.native
  def seed(input: stdLib.File, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
}

