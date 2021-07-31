package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlBarOptions
  extends StObject
     with ComponentOptions {
  
  var fullscreenToggle: js.UndefOr[Boolean] = js.undefined
  
  var volumePanel: js.UndefOr[VolumePanelOptions] = js.undefined
}
object ControlBarOptions {
  
  @scala.inline
  def apply(): ControlBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlBarOptions]
  }
  
  @scala.inline
  implicit class ControlBarOptionsMutableBuilder[Self <: ControlBarOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullscreenToggle(value: Boolean): Self = StObject.set(x, "fullscreenToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenToggleUndefined: Self = StObject.set(x, "fullscreenToggle", js.undefined)
    
    @scala.inline
    def setVolumePanel(value: VolumePanelOptions): Self = StObject.set(x, "volumePanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumePanelUndefined: Self = StObject.set(x, "volumePanel", js.undefined)
  }
}
