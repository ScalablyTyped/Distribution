package typings.wordpressPlugins.mod

import typings.react.mod.ComponentType
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginSettings extends js.Object {
  /**
    * An icon to be shown in the UI. It can be a slug of the Dashicon, or an
    * element (or function returning an element) if you choose to render your
    * own SVG.
    */
  var icon: Icon | ComponentType[js.Object] = js.native
  /**
    * A component containing the UI elements to be rendered.
    */
  var render: ComponentType[js.Object] = js.native
}

object PluginSettings {
  @scala.inline
  def apply(icon: Icon | ComponentType[js.Object], render: ComponentType[js.Object]): PluginSettings = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginSettings]
  }
  @scala.inline
  implicit class PluginSettingsOps[Self <: PluginSettings] (val x: Self) extends AnyVal {
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
    def setRender(value: ComponentType[js.Object]): Self = this.set("render", value.asInstanceOf[js.Any])
  }
  
}

