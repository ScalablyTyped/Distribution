package typings.unified.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Presets provide a potentially sharable way to configure processors.
  * They can contain multiple plugins and optionally settings as well.
  *
  * @typeParam P Processor settings
  */
@js.native
trait Preset[S, P] extends js.Object {
  
  var plugins: PluggableList[P] = js.native
  
  var settings: js.UndefOr[Settings] = js.native
}
object Preset {
  
  @scala.inline
  def apply[S, P](plugins: PluggableList[P]): Preset[S, P] = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[Preset[S, P]]
  }
  
  @scala.inline
  implicit class PresetOps[Self <: Preset[_, _], S, P] (val x: Self with (Preset[S, P])) extends AnyVal {
    
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
    def setPluginsVarargs(value: (Pluggable[js.Array[js.UndefOr[js.Any]], P])*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: PluggableList[P]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: Settings): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
  }
}
