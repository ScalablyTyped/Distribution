package typings.webpack

import typings.webpack.mod.compilation.ModuleTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJavascript extends js.Object {
  var javascript: ModuleTemplate
  var webassembly: ModuleTemplate
}

object AnonJavascript {
  @scala.inline
  def apply(javascript: ModuleTemplate, webassembly: ModuleTemplate): AnonJavascript = {
    val __obj = js.Dynamic.literal(javascript = javascript.asInstanceOf[js.Any], webassembly = webassembly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJavascript]
  }
}

