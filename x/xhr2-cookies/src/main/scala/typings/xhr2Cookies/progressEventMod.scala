package typings.xhr2Cookies

import typings.xhr2Cookies.xmlHttpRequestEventTargetMod.XMLHttpRequestEventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressEventMod {
  
  @JSImport("xhr2-cookies/dist/progress-event", "ProgressEvent")
  @js.native
  class ProgressEvent protected () extends StObject {
    def this(`type`: String) = this()
    
    var bubbles: Boolean = js.native
    
    var cancelable: Boolean = js.native
    
    var lengthComputable: Boolean = js.native
    
    var loaded: Double = js.native
    
    var target: XMLHttpRequestEventTarget = js.native
    
    var total: Double = js.native
    
    var `type`: String = js.native
  }
}
