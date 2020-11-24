package typings.webtorrent.mod

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.std.Error
import typings.std.File
import typings.std.FileList
import typings.webtorrent.webtorrentStrings.error
import typings.webtorrent.webtorrentStrings.torrent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instance extends EventEmitter {
  
  def add(torrent: String): Torrent = js.native
  def add(torrent: String, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def add(torrent: String, opts: js.UndefOr[scala.Nothing], cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def add(torrent: String, opts: TorrentOptions): Torrent = js.native
  def add(torrent: String, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def add(torrent: Buffer): Torrent = js.native
  def add(torrent: Buffer, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def add(torrent: Buffer, opts: js.UndefOr[scala.Nothing], cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def add(torrent: Buffer, opts: TorrentOptions): Torrent = js.native
  def add(torrent: Buffer, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def add(torrent: typings.parseTorrent.mod.Instance): Torrent = js.native
  def add(torrent: typings.parseTorrent.mod.Instance, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def add(
    torrent: typings.parseTorrent.mod.Instance,
    opts: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* torrent */ Torrent, _]
  ): Torrent = js.native
  def add(torrent: typings.parseTorrent.mod.Instance, opts: TorrentOptions): Torrent = js.native
  def add(
    torrent: typings.parseTorrent.mod.Instance,
    opts: TorrentOptions,
    cb: js.Function1[/* torrent */ Torrent, _]
  ): Torrent = js.native
  def add(torrent: File): Torrent = js.native
  def add(torrent: File, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def add(torrent: File, opts: js.UndefOr[scala.Nothing], cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def add(torrent: File, opts: TorrentOptions): Torrent = js.native
  def add(torrent: File, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  
  def destroy(): Unit = js.native
  def destroy(callback: js.Function1[/* err */ Error | String, Unit]): Unit = js.native
  
  val downloadSpeed: Double = js.native
  
  def get(torrentId: String): Torrent | Unit = js.native
  def get(torrentId: Buffer): Torrent | Unit = js.native
  def get(torrentId: Torrent): Torrent | Unit = js.native
  
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* err */ Error | String, Unit]): this.type = js.native
  @JSName("on")
  def on_torrent(event: torrent, callback: js.Function1[/* torrent */ Torrent, Unit]): this.type = js.native
  
  val progress: Double = js.native
  
  val ratio: Double = js.native
  
  def remove(torrentId: String): Unit = js.native
  def remove(
    torrentId: String,
    opts: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ Error | String, Unit]
  ): Unit = js.native
  def remove(torrentId: String, opts: TorrentDestroyOptions): Unit = js.native
  def remove(
    torrentId: String,
    opts: TorrentDestroyOptions,
    callback: js.Function1[/* err */ Error | String, Unit]
  ): Unit = js.native
  def remove(torrentId: Buffer): Unit = js.native
  def remove(
    torrentId: Buffer,
    opts: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ Error | String, Unit]
  ): Unit = js.native
  def remove(torrentId: Buffer, opts: TorrentDestroyOptions): Unit = js.native
  def remove(
    torrentId: Buffer,
    opts: TorrentDestroyOptions,
    callback: js.Function1[/* err */ Error | String, Unit]
  ): Unit = js.native
  def remove(torrentId: Torrent): Unit = js.native
  def remove(
    torrentId: Torrent,
    opts: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ Error | String, Unit]
  ): Unit = js.native
  def remove(torrentId: Torrent, opts: TorrentDestroyOptions): Unit = js.native
  def remove(
    torrentId: Torrent,
    opts: TorrentDestroyOptions,
    callback: js.Function1[/* err */ Error | String, Unit]
  ): Unit = js.native
  
  def seed(input: String): Torrent = js.native
  def seed(input: String, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: String, opts: js.UndefOr[scala.Nothing], cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: String, opts: TorrentOptions): Torrent = js.native
  def seed(input: String, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: js.Array[Buffer | File | ReadableStream | String]): Torrent = js.native
  def seed(
    input: js.Array[Buffer | File | ReadableStream | String],
    cb: js.Function1[/* torrent */ Torrent, _]
  ): Torrent = js.native
  def seed(
    input: js.Array[Buffer | File | ReadableStream | String],
    opts: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* torrent */ Torrent, _]
  ): Torrent = js.native
  def seed(input: js.Array[Buffer | File | ReadableStream | String], opts: TorrentOptions): Torrent = js.native
  def seed(
    input: js.Array[Buffer | File | ReadableStream | String],
    opts: TorrentOptions,
    cb: js.Function1[/* torrent */ Torrent, _]
  ): Torrent = js.native
  def seed(input: Buffer): Torrent = js.native
  def seed(input: Buffer, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: Buffer, opts: js.UndefOr[scala.Nothing], cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: Buffer, opts: TorrentOptions): Torrent = js.native
  def seed(input: Buffer, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: ReadableStream): Torrent = js.native
  def seed(input: ReadableStream, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: ReadableStream, opts: js.UndefOr[scala.Nothing], cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: ReadableStream, opts: TorrentOptions): Torrent = js.native
  def seed(input: ReadableStream, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: File): Torrent = js.native
  def seed(input: FileList): Torrent = js.native
  def seed(input: FileList, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: FileList, opts: js.UndefOr[scala.Nothing], cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: FileList, opts: TorrentOptions): Torrent = js.native
  def seed(input: FileList, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: File, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: File, opts: js.UndefOr[scala.Nothing], cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  def seed(input: File, opts: TorrentOptions): Torrent = js.native
  def seed(input: File, opts: TorrentOptions, cb: js.Function1[/* torrent */ Torrent, _]): Torrent = js.native
  
  val torrents: js.Array[Torrent] = js.native
  
  val uploadSpeed: Double = js.native
}
