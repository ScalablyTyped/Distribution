package typings.xhr2Cookies

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.xhr2Cookies.xmlHttpRequestMod.XMLHttpRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr2-cookies", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class XMLHttpRequest ()
    extends typings.xhr2Cookies.xmlHttpRequestMod.XMLHttpRequest {
    def this(options: XMLHttpRequestOptions) = this()
  }
  
  @js.native
  class XMLHttpRequestEventTarget ()
    extends typings.xhr2Cookies.xmlHttpRequestEventTargetMod.XMLHttpRequestEventTarget
  
  /* static members */
  @js.native
  object XMLHttpRequest extends js.Object {
    var DONE: Double = js.native
    var HEADERS_RECEIVED: Double = js.native
    var InvalidStateError: Instantiable0[typings.xhr2Cookies.errorsMod.InvalidStateError] = js.native
    var LOADING: Double = js.native
    var NetworkError: Instantiable0[typings.xhr2Cookies.errorsMod.NetworkError] = js.native
    var OPENED: Double = js.native
    var ProgressEvent: Instantiable1[/* type */ String, typings.xhr2Cookies.progressEventMod.ProgressEvent] = js.native
    var SecurityError: Instantiable0[typings.xhr2Cookies.errorsMod.SecurityError] = js.native
    var SyntaxError: Instantiable0[typings.xhr2Cookies.errorsMod.SyntaxError] = js.native
    var UNSENT: Double = js.native
    var XMLHttpRequestUpload: Instantiable0[typings.xhr2Cookies.xmlHttpRequestUploadMod.XMLHttpRequestUpload] = js.native
    var cookieJar: js.Any = js.native
    def nodejsSet(options: AnonBaseUrl): Unit = js.native
  }
  
}

