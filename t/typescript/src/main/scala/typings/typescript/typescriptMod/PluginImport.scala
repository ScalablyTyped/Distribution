package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginImport extends js.Object {
  var name: String
}

object PluginImport {
  @scala.inline
  def apply(name: String): PluginImport = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PluginImport]
  }
}

