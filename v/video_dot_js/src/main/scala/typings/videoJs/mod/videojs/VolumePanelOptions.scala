package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumePanelOptions
  extends StObject
     with ComponentOptions {
  
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  var volumeControl: js.UndefOr[VolumeControlOptions] = js.undefined
}
object VolumePanelOptions {
  
  inline def apply(): VolumePanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumePanelOptions]
  }
  
  extension [Self <: VolumePanelOptions](x: Self) {
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setVolumeControl(value: VolumeControlOptions): Self = StObject.set(x, "volumeControl", value.asInstanceOf[js.Any])
    
    inline def setVolumeControlUndefined: Self = StObject.set(x, "volumeControl", js.undefined)
  }
}
