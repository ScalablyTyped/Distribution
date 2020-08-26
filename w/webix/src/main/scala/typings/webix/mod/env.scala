package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait env extends js.Object {
  var cssPrefix: String = js.native
  var isFF: Boolean = js.native
  var isIE: Boolean = js.native
  var isSafari: Boolean = js.native
  var isWebKit: Boolean = js.native
  var jsPrefix: String = js.native
  var mouse: js.Any = js.native
  var strict: Boolean = js.native
  var svg: Boolean = js.native
  var transform: Boolean = js.native
  var transition: Boolean = js.native
  var transitionDuration: String = js.native
  var transitionEnd: String = js.native
  var translate: String = js.native
}

@JSImport("webix", "env")
@js.native
object env
  extends TopLevel[typings.webix.webix.env]

