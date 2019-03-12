package typings
package telebotLib.telebotMod.telebotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait module extends js.Object {
  var defaultConfig: js.Any
  var id: java.lang.String
  def plugin(args: js.Any*): scala.Unit
}

object module {
  @scala.inline
  def apply(defaultConfig: js.Any, id: java.lang.String, plugin: /* repeated */ js.Any => scala.Unit): module = {
    val __obj = js.Dynamic.literal(defaultConfig = defaultConfig, id = id, plugin = js.Any.fromFunction1(plugin))
  
    __obj.asInstanceOf[module]
  }
}

