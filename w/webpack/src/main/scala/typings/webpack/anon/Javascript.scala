package typings.webpack.anon

import typings.webpack.mod.compilation.ModuleTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Javascript extends js.Object {
  var javascript: ModuleTemplate
  var webassembly: ModuleTemplate
}

object Javascript {
  @scala.inline
  def apply(javascript: ModuleTemplate, webassembly: ModuleTemplate): Javascript = {
    val __obj = js.Dynamic.literal(javascript = javascript.asInstanceOf[js.Any], webassembly = webassembly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Javascript]
  }
}

