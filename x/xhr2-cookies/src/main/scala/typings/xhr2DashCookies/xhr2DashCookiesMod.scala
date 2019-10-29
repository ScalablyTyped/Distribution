package typings.xhr2DashCookies

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.xhr2DashCookies.distXmlDashHttpDashRequestMod.XMLHttpRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr2-cookies", JSImport.Namespace)
@js.native
object xhr2DashCookiesMod extends js.Object {
  @js.native
  class XMLHttpRequest ()
    extends typings.xhr2DashCookies.distXmlDashHttpDashRequestMod.XMLHttpRequest {
    def this(options: XMLHttpRequestOptions) = this()
  }
  
  @js.native
  class XMLHttpRequestEventTarget ()
    extends typings.xhr2DashCookies.distXmlDashHttpDashRequestDashEventDashTargetMod.XMLHttpRequestEventTarget
  
  /* static members */
  @js.native
  object XMLHttpRequest extends js.Object {
    var DONE: Double = js.native
    var HEADERS_RECEIVED: Double = js.native
    var InvalidStateError: Instantiable0[typings.xhr2DashCookies.distErrorsMod.InvalidStateError] = js.native
    var LOADING: Double = js.native
    var NetworkError: Instantiable0[typings.xhr2DashCookies.distErrorsMod.NetworkError] = js.native
    var OPENED: Double = js.native
    var ProgressEvent: Instantiable1[/* type */ String, typings.xhr2DashCookies.distProgressDashEventMod.ProgressEvent] = js.native
    var SecurityError: Instantiable0[typings.xhr2DashCookies.distErrorsMod.SecurityError] = js.native
    var SyntaxError: Instantiable0[typings.xhr2DashCookies.distErrorsMod.SyntaxError] = js.native
    var UNSENT: Double = js.native
    var XMLHttpRequestUpload: Instantiable0[
        typings.xhr2DashCookies.distXmlDashHttpDashRequestDashUploadMod.XMLHttpRequestUpload
      ] = js.native
    var cookieJar: js.Any = js.native
    def nodejsSet(options: Anon_BaseUrl): Unit = js.native
  }
  
}

