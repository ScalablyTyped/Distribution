package typings.telebot.telebotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait module extends js.Object {
  var defaultConfig: js.Any
  var id: String
  def plugin(args: js.Any*): Unit
}

object module {
  @scala.inline
  def apply(defaultConfig: js.Any, id: String, plugin: /* repeated */ js.Any => Unit): module = {
    val __obj = js.Dynamic.literal(defaultConfig = defaultConfig, id = id, plugin = js.Any.fromFunction1(plugin))
  
    __obj.asInstanceOf[module]
  }
}

