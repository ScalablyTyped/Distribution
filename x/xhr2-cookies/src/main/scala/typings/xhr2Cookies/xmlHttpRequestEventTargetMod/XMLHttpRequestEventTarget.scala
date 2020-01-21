package typings.xhr2Cookies.xmlHttpRequestEventTargetMod

import typings.xhr2Cookies.progressEventMod.ProgressEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr2-cookies/dist/xml-http-request-event-target", "XMLHttpRequestEventTarget")
@js.native
class XMLHttpRequestEventTarget () extends js.Object {
  var listeners: js.Any = js.native
  var onabort: ProgressEventListener | Null = js.native
  var onerror: ProgressEventListener | Null = js.native
  var onload: ProgressEventListener | Null = js.native
  var onloadend: ProgressEventListener | Null = js.native
  var onloadstart: ProgressEventListener | Null = js.native
  var onprogress: ProgressEventListener | Null = js.native
  var ontimeout: ProgressEventListener | Null = js.native
  def addEventListener(eventType: String): Unit = js.native
  def addEventListener(eventType: String, listener: ProgressEventListenerOrEventListenerObject): Unit = js.native
  def dispatchEvent(event: ProgressEvent): Boolean = js.native
  def removeEventListener(eventType: String): Unit = js.native
  def removeEventListener(eventType: String, listener: ProgressEventListenerOrEventListenerObject): Unit = js.native
}

