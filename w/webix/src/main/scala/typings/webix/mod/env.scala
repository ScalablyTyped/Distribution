package typings.webix.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait env extends js.Object {
  var cssPrefix: String
  var isFF: Boolean
  var isIE: Boolean
  var isSafari: Boolean
  var isWebKit: Boolean
  var jsPrefix: String
  var mouse: js.Any
  var strict: Boolean
  var svg: Boolean
  var transform: Boolean
  var transition: Boolean
  var transitionDuration: String
  var transitionEnd: String
  var translate: String
}

@JSImport("webix", "env")
@js.native
object env
  extends TopLevel[typings.webix.webix.env]

