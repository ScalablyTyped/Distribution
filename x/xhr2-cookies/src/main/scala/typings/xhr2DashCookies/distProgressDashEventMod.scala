package typings.xhr2DashCookies

import typings.xhr2DashCookies.distXmlDashHttpDashRequestDashEventDashTargetMod.XMLHttpRequestEventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr2-cookies/dist/progress-event", JSImport.Namespace)
@js.native
object distProgressDashEventMod extends js.Object {
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

