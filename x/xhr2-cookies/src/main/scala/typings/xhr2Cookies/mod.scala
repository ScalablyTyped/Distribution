package typings.xhr2Cookies

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.xhr2Cookies.anon.BaseUrl
import typings.xhr2Cookies.errorsMod.InvalidStateError
import typings.xhr2Cookies.errorsMod.NetworkError
import typings.xhr2Cookies.errorsMod.SecurityError
import typings.xhr2Cookies.errorsMod.SyntaxError
import typings.xhr2Cookies.progressEventMod.ProgressEvent
import typings.xhr2Cookies.xmlHttpRequestMod.XMLHttpRequestOptions
import typings.xhr2Cookies.xmlHttpRequestUploadMod.XMLHttpRequestUpload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xhr2-cookies", "XMLHttpRequest")
  @js.native
  class XMLHttpRequest ()
    extends typings.xhr2Cookies.xmlHttpRequestMod.XMLHttpRequest {
    def this(options: XMLHttpRequestOptions) = this()
  }
  /* static members */
  object XMLHttpRequest {
    
    @JSImport("xhr2-cookies", "XMLHttpRequest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("xhr2-cookies", "XMLHttpRequest.DONE")
    @js.native
    def DONE: Double = js.native
    @scala.inline
    def DONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DONE")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies", "XMLHttpRequest.HEADERS_RECEIVED")
    @js.native
    def HEADERS_RECEIVED: Double = js.native
    @scala.inline
    def HEADERS_RECEIVED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADERS_RECEIVED")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies", "XMLHttpRequest.InvalidStateError")
    @js.native
    def InvalidStateError: Instantiable0[typings.xhr2Cookies.errorsMod.InvalidStateError] = js.native
    @scala.inline
    def InvalidStateError_=(x: Instantiable0[InvalidStateError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InvalidStateError")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies", "XMLHttpRequest.LOADING")
    @js.native
    def LOADING: Double = js.native
    @scala.inline
    def LOADING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADING")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies", "XMLHttpRequest.NetworkError")
    @js.native
    def NetworkError: Instantiable0[typings.xhr2Cookies.errorsMod.NetworkError] = js.native
    @scala.inline
    def NetworkError_=(x: Instantiable0[NetworkError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NetworkError")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies", "XMLHttpRequest.OPENED")
    @js.native
    def OPENED: Double = js.native
    @scala.inline
    def OPENED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENED")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies", "XMLHttpRequest.ProgressEvent")
    @js.native
    def ProgressEvent: Instantiable1[/* type */ String, typings.xhr2Cookies.progressEventMod.ProgressEvent] = js.native
    @scala.inline
    def ProgressEvent_=(x: Instantiable1[/* type */ String, ProgressEvent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ProgressEvent")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies", "XMLHttpRequest.SecurityError")
    @js.native
    def SecurityError: Instantiable0[typings.xhr2Cookies.errorsMod.SecurityError] = js.native
    @scala.inline
    def SecurityError_=(x: Instantiable0[SecurityError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SecurityError")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies", "XMLHttpRequest.SyntaxError")
    @js.native
    def SyntaxError: Instantiable0[typings.xhr2Cookies.errorsMod.SyntaxError] = js.native
    @scala.inline
    def SyntaxError_=(x: Instantiable0[SyntaxError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SyntaxError")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies", "XMLHttpRequest.UNSENT")
    @js.native
    def UNSENT: Double = js.native
    @scala.inline
    def UNSENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSENT")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies", "XMLHttpRequest.XMLHttpRequestUpload")
    @js.native
    def XMLHttpRequestUpload: Instantiable0[typings.xhr2Cookies.xmlHttpRequestUploadMod.XMLHttpRequestUpload] = js.native
    @scala.inline
    def XMLHttpRequestUpload_=(x: Instantiable0[XMLHttpRequestUpload]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XMLHttpRequestUpload")(x.asInstanceOf[js.Any])
    
    @JSImport("xhr2-cookies", "XMLHttpRequest.cookieJar")
    @js.native
    def cookieJar: js.Any = js.native
    @scala.inline
    def cookieJar_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookieJar")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def nodejsSet(options: BaseUrl): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nodejsSet")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("xhr2-cookies", "XMLHttpRequestEventTarget")
  @js.native
  class XMLHttpRequestEventTarget ()
    extends typings.xhr2Cookies.xmlHttpRequestEventTargetMod.XMLHttpRequestEventTarget
}
