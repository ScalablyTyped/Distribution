package typings.wordpressPlugins.mod

import typings.react.mod.ComponentType
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@wordpress/plugins.@wordpress/plugins.Plugin, 'render'> */
@js.native
trait PluginContext extends js.Object {
  var icon: Icon | ComponentType[js.Object] = js.native
  var name: String = js.native
}

object PluginContext {
  @scala.inline
  def apply(icon: Icon | ComponentType[js.Object], name: String): PluginContext = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginContext]
  }
  @scala.inline
  implicit class PluginContextOps[Self <: PluginContext] (val x: Self) extends AnyVal {
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
    def setIcon(value: Icon | ComponentType[js.Object]): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

