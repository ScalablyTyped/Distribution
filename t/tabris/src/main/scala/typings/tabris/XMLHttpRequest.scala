package typings.tabris

import typings.tabris.tabrisStrings._empty
import typings.tabris.tabrisStrings.arraybuffer
import typings.tabris.tabrisStrings.readystatechange
import typings.tabris.tabrisStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLHttpRequest
  extends StObject
     with EventTarget
     with XMLHttpRequestEventTarget {
  
  val DONE: Double = js.native
  
  val HEADERS_RECEIVED: Double = js.native
  
  val LOADING: Double = js.native
  
  val OPENED: Double = js.native
  
  val UNSENT: Double = js.native
  
  def abort(): Unit = js.native
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListener): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, listener: EventListener, useCapture: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(`type`: readystatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    useCapture: Boolean
  ): Unit = js.native
  
  def getAllResponseHeaders(): String = js.native
  
  def getResponseHeader(header: String): String | Null = js.native
  
  def onreadystatechange(ev: Event): Any = js.native
  
  def open(method: String, url: String): Unit = js.native
  def open(method: String, url: String, async: Boolean): Unit = js.native
  def open(method: String, url: String, async: Boolean, user: String): Unit = js.native
  def open(method: String, url: String, async: Boolean, user: String, password: String): Unit = js.native
  def open(method: String, url: String, async: Boolean, user: Unit, password: String): Unit = js.native
  def open(method: String, url: String, async: Unit, user: String): Unit = js.native
  def open(method: String, url: String, async: Unit, user: String, password: String): Unit = js.native
  def open(method: String, url: String, async: Unit, user: Unit, password: String): Unit = js.native
  
  val readyState: Double = js.native
  
  val response: Any = js.native
  
  val responseText: String = js.native
  
  var responseType: text | arraybuffer | _empty = js.native
  
  def send(): Unit = js.native
  def send(data: String): Unit = js.native
  def send(data: js.typedarray.ArrayBuffer): Unit = js.native
  def send(data: Blob): Unit = js.native
  def send(data: FormData): Unit = js.native
  
  def setRequestHeader(header: String, value: String): Unit = js.native
  
  val status: Double = js.native
  
  val statusText: String = js.native
  
  var timeout: Double = js.native
  
  val upload: XMLHttpRequestUpload = js.native
  
  var withCredentials: Boolean = js.native
}
