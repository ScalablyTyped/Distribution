package typings
package webtorrentLib.webtorrentMod.WebTorrentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TorrentFile
  extends nodeLib.NodeJSNs.EventEmitter {
  val downloaded: scala.Double = js.native
  val length: scala.Double = js.native
  val name: java.lang.String = js.native
  val path: java.lang.String = js.native
  def appendTo(rootElement: java.lang.String): scala.Unit = js.native
  def appendTo(
    rootElement: java.lang.String,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* element */ stdLib.HTMLMediaElement, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def appendTo(rootElement: java.lang.String, opts: webtorrentLib.Anon_Autoplay): scala.Unit = js.native
  def appendTo(
    rootElement: java.lang.String,
    opts: webtorrentLib.Anon_Autoplay,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* element */ stdLib.HTMLMediaElement, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def appendTo(rootElement: stdLib.HTMLElement): scala.Unit = js.native
  def appendTo(
    rootElement: stdLib.HTMLElement,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* element */ stdLib.HTMLMediaElement, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def appendTo(rootElement: stdLib.HTMLElement, opts: webtorrentLib.Anon_Autoplay): scala.Unit = js.native
  def appendTo(
    rootElement: stdLib.HTMLElement,
    opts: webtorrentLib.Anon_Autoplay,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* element */ stdLib.HTMLMediaElement, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def createReadStream(): nodeLib.NodeJSNs.ReadableStream = js.native
  def createReadStream(opts: webtorrentLib.Anon_Start): nodeLib.NodeJSNs.ReadableStream = js.native
  def deselect(): scala.Unit = js.native
  def getBlob(
    callback: js.Function2[
      /* err */ js.UndefOr[java.lang.String | nodeLib.Error], 
      /* blob */ js.UndefOr[stdLib.Blob], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getBlobURL(
    callback: js.Function2[
      /* err */ js.UndefOr[java.lang.String | nodeLib.Error], 
      /* blobURL */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getBuffer(
    callback: js.Function2[
      /* err */ js.UndefOr[java.lang.String | nodeLib.Error], 
      /* buffer */ js.UndefOr[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def renderTo(rootElement: java.lang.String): scala.Unit = js.native
  def renderTo(
    rootElement: java.lang.String,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* element */ stdLib.HTMLMediaElement, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def renderTo(rootElement: java.lang.String, opts: webtorrentLib.Anon_Autoplay): scala.Unit = js.native
  def renderTo(
    rootElement: java.lang.String,
    opts: webtorrentLib.Anon_Autoplay,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* element */ stdLib.HTMLMediaElement, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def renderTo(rootElement: stdLib.HTMLMediaElement): scala.Unit = js.native
  def renderTo(
    rootElement: stdLib.HTMLMediaElement,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* element */ stdLib.HTMLMediaElement, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def renderTo(rootElement: stdLib.HTMLMediaElement, opts: webtorrentLib.Anon_Autoplay): scala.Unit = js.native
  def renderTo(
    rootElement: stdLib.HTMLMediaElement,
    opts: webtorrentLib.Anon_Autoplay,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error], 
      /* element */ stdLib.HTMLMediaElement, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def select(): scala.Unit = js.native
}

