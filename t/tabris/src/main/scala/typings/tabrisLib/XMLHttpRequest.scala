package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLHttpRequest
  extends EventTarget
     with XMLHttpRequestEventTarget {
  val DONE: scala.Double = js.native
  val HEADERS_RECEIVED: scala.Double = js.native
  val LOADING: scala.Double = js.native
  val OPENED: scala.Double = js.native
  val UNSENT: scala.Double = js.native
  val readyState: scala.Double = js.native
  val response: js.Any = js.native
  val responseText: java.lang.String = js.native
  var responseType: tabrisLib.tabrisLibStrings.text | tabrisLib.tabrisLibStrings.arraybuffer | tabrisLib.tabrisLibStrings.Empty = js.native
  val status: scala.Double = js.native
  val statusText: java.lang.String = js.native
  var timeout: scala.Double = js.native
  val upload: XMLHttpRequestUpload = js.native
  var withCredentials: scala.Boolean = js.native
  def abort(): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListener): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListener, useCapture: scala.Boolean): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: tabrisLib.tabrisLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: tabrisLib.tabrisLibStrings.readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def getAllResponseHeaders(): java.lang.String = js.native
  def getResponseHeader(header: java.lang.String): java.lang.String | scala.Null = js.native
  def onreadystatechange(`this`: XMLHttpRequest, ev: Event): js.Any = js.native
  def open(method: java.lang.String, url: java.lang.String): scala.Unit = js.native
  def open(method: java.lang.String, url: java.lang.String, async: scala.Boolean): scala.Unit = js.native
  def open(method: java.lang.String, url: java.lang.String, async: scala.Boolean, user: java.lang.String): scala.Unit = js.native
  def open(
    method: java.lang.String,
    url: java.lang.String,
    async: scala.Boolean,
    user: java.lang.String,
    password: java.lang.String
  ): scala.Unit = js.native
  def send(): scala.Unit = js.native
  def send(data: java.lang.String): scala.Unit = js.native
  def send(data: js.Any): scala.Unit = js.native
  def setRequestHeader(header: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

@JSGlobal("XMLHttpRequest")
@js.native
class XMLHttpRequestCls () extends XMLHttpRequest

@JSGlobal("XMLHttpRequest")
@js.native
object XMLHttpRequest
  extends org.scalablytyped.runtime.Instantiable0[XMLHttpRequest] {
  val DONE: scala.Double = js.native
  val HEADERS_RECEIVED: scala.Double = js.native
  val LOADING: scala.Double = js.native
  val OPENED: scala.Double = js.native
  val UNSENT: scala.Double = js.native
}

