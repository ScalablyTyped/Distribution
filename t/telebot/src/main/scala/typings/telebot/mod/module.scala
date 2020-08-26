package typings.telebot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait module extends js.Object {
  var defaultConfig: js.Any = js.native
  var id: String = js.native
  def plugin(args: js.Any*): Unit = js.native
}

object module {
  @scala.inline
  def apply(defaultConfig: js.Any, id: String, plugin: /* repeated */ js.Any => Unit): module = {
    val __obj = js.Dynamic.literal(defaultConfig = defaultConfig.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plugin = js.Any.fromFunction1(plugin))
    __obj.asInstanceOf[module]
  }
  @scala.inline
  implicit class moduleOps[Self <: module] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultConfig(value: js.Any): Self = this.set("defaultConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlugin(value: /* repeated */ js.Any => Unit): Self = this.set("plugin", js.Any.fromFunction1(value))
  }
  
}

