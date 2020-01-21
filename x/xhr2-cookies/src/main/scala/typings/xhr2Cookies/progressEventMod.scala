package typings.xhr2Cookies

import typings.xhr2Cookies.xmlHttpRequestEventTargetMod.XMLHttpRequestEventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr2-cookies/dist/progress-event", JSImport.Namespace)
@js.native
object progressEventMod extends js.Object {
  @js.native
  class ProgressEvent protected () extends js.Object {
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

