package typings.webtorrent.mod

import typings.node.Buffer
import typings.node.NodeJS.EventEmitter
import typings.node.NodeJS.ReadableStream
import typings.std.Blob
import typings.std.Error
import typings.std.HTMLElement
import typings.std.HTMLMediaElement
import typings.webtorrent.AnonAutoplay
import typings.webtorrent.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TorrentFile extends EventEmitter {
  val downloaded: Double = js.native
  val length: Double = js.native
  val name: String = js.native
  val path: String = js.native
  def appendTo(rootElement: String): Unit = js.native
  def appendTo(
    rootElement: String,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def appendTo(rootElement: String, opts: AnonAutoplay): Unit = js.native
  def appendTo(
    rootElement: String,
    opts: AnonAutoplay,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def appendTo(rootElement: HTMLElement): Unit = js.native
  def appendTo(
    rootElement: HTMLElement,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def appendTo(rootElement: HTMLElement, opts: AnonAutoplay): Unit = js.native
  def appendTo(
    rootElement: HTMLElement,
    opts: AnonAutoplay,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def createReadStream(): ReadableStream = js.native
  def createReadStream(opts: AnonEnd): ReadableStream = js.native
  def deselect(): Unit = js.native
  def getBlob(callback: js.Function2[/* err */ js.UndefOr[String | Error], /* blob */ js.UndefOr[Blob], Unit]): Unit = js.native
  def getBlobURL(
    callback: js.Function2[/* err */ js.UndefOr[String | Error], /* blobURL */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def getBuffer(
    callback: js.Function2[/* err */ js.UndefOr[String | Error], /* buffer */ js.UndefOr[Buffer], Unit]
  ): Unit = js.native
  def renderTo(rootElement: String): Unit = js.native
  def renderTo(
    rootElement: String,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def renderTo(rootElement: String, opts: AnonAutoplay): Unit = js.native
  def renderTo(
    rootElement: String,
    opts: AnonAutoplay,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def renderTo(rootElement: HTMLMediaElement): Unit = js.native
  def renderTo(
    rootElement: HTMLMediaElement,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def renderTo(rootElement: HTMLMediaElement, opts: AnonAutoplay): Unit = js.native
  def renderTo(
    rootElement: HTMLMediaElement,
    opts: AnonAutoplay,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* element */ HTMLMediaElement, Unit]
  ): Unit = js.native
  def select(): Unit = js.native
}

