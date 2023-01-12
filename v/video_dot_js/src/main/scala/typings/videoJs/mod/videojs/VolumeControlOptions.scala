package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeControlOptions
  extends StObject
     with ComponentOptions {
  
  var vertical: js.UndefOr[Boolean] = js.undefined
  
  var volumeBar: js.UndefOr[VolumeBar] = js.undefined
}
object VolumeControlOptions {
  
  inline def apply(): VolumeControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeControlOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VolumeControlOptions] (val x: Self) extends AnyVal {
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    
    inline def setVolumeBar(value: VolumeBar): Self = StObject.set(x, "volumeBar", value.asInstanceOf[js.Any])
    
    inline def setVolumeBarUndefined: Self = StObject.set(x, "volumeBar", js.undefined)
  }
}
