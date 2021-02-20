package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeControlOptions extends ComponentOptions {
  
  var vertical: js.UndefOr[Boolean] = js.native
  
  var volumeBar: js.UndefOr[VolumeBar] = js.native
}
object VolumeControlOptions {
  
  @scala.inline
  def apply(): VolumeControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeControlOptions]
  }
  
  @scala.inline
  implicit class VolumeControlOptionsMutableBuilder[Self <: VolumeControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    
    @scala.inline
    def setVolumeBar(value: VolumeBar): Self = StObject.set(x, "volumeBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeBarUndefined: Self = StObject.set(x, "volumeBar", js.undefined)
  }
}
