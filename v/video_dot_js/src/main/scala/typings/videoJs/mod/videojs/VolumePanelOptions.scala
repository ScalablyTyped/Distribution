package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumePanelOptions extends ComponentOptions {
  
  var `inline`: js.UndefOr[Boolean] = js.native
  
  var volumeControl: js.UndefOr[VolumeControlOptions] = js.native
}
object VolumePanelOptions {
  
  @scala.inline
  def apply(): VolumePanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumePanelOptions]
  }
  
  @scala.inline
  implicit class VolumePanelOptionsMutableBuilder[Self <: VolumePanelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    @scala.inline
    def setVolumeControl(value: VolumeControlOptions): Self = StObject.set(x, "volumeControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeControlUndefined: Self = StObject.set(x, "volumeControl", js.undefined)
  }
}
