package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginImport extends js.Object {
  var name: java.lang.String
}

object PluginImport {
  @scala.inline
  def apply(name: java.lang.String): PluginImport = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginImport]
  }
}

