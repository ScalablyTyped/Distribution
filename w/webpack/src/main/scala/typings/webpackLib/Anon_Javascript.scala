package typings
package webpackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Javascript extends js.Object {
  var javascript: webpackLib.webpackMod.webpackNs.compilationNs.ModuleTemplate
  var webassembly: webpackLib.webpackMod.webpackNs.compilationNs.ModuleTemplate
}

object Anon_Javascript {
  @scala.inline
  def apply(
    javascript: webpackLib.webpackMod.webpackNs.compilationNs.ModuleTemplate,
    webassembly: webpackLib.webpackMod.webpackNs.compilationNs.ModuleTemplate
  ): Anon_Javascript = {
    val __obj = js.Dynamic.literal(javascript = javascript, webassembly = webassembly)
  
    __obj.asInstanceOf[Anon_Javascript]
  }
}

