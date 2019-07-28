package typings.webpack

import typings.webpack.webpackMod.compilationNs.ModuleTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Javascript extends js.Object {
  var javascript: ModuleTemplate
  var webassembly: ModuleTemplate
}

object Anon_Javascript {
  @scala.inline
  def apply(javascript: ModuleTemplate, webassembly: ModuleTemplate): Anon_Javascript = {
    val __obj = js.Dynamic.literal(javascript = javascript, webassembly = webassembly)
  
    __obj.asInstanceOf[Anon_Javascript]
  }
}

