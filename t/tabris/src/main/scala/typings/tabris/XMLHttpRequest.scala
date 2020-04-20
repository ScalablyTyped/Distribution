package typings.tabris

import org.scalablytyped.runtime.Instantiable0
import typings.std.ArrayBuffer
import typings.tabris.tabrisStrings.arraybuffer
import typings.tabris.tabrisStrings.readystatechange
import typings.tabris.tabrisStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLHttpRequest
  extends EventTarget
     with XMLHttpRequestEventTarget {
  val DONE: Double = js.native
  val HEADERS_RECEIVED: Double = js.native
  val LOADING: Double = js.native
  val OPENED: Double = js.native
  val UNSENT: Double = js.native
  val readyState: Double = js.native
  val response: js.Any = js.native
  val responseText: String = js.native
  var responseType: text | arraybuffer | typings.tabris.tabrisStrings._empty = js.native
  val status: Double = js.native
  val statusText: String = js.native
  var timeout: Double = js.native
  val upload: XMLHttpRequestUpload = js.native
  var withCredentials: Boolean = js.native
  def abort(): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListener): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListener, useCapture: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(`type`: readystatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  def getAllResponseHeaders(): String = js.native
  def getResponseHeader(header: String): String | Null = js.native
  def onreadystatechange(ev: Event): js.Any = js.native
  def open(method: String, url: String): Unit = js.native
  def open(method: String, url: String, async: Boolean): Unit = js.native
  def open(method: String, url: String, async: Boolean, user: String): Unit = js.native
  def open(method: String, url: String, async: Boolean, user: String, password: String): Unit = js.native
  def send(): Unit = js.native
  def send(data: String): Unit = js.native
  def send(data: ArrayBuffer): Unit = js.native
  def send(data: Blob): Unit = js.native
  def send(data: FormData): Unit = js.native
  def setRequestHeader(header: String, value: String): Unit = js.native
}

@JSGlobal("XMLHttpRequest")
@js.native
object XMLHttpRequest extends Instantiable0[XMLHttpRequest] {
  val DONE: Double = js.native
  val HEADERS_RECEIVED: Double = js.native
  val LOADING: Double = js.native
  val OPENED: Double = js.native
  val UNSENT: Double = js.native
}

