package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.TextTrack.Kind
import typings.videoJs.mod.videojs.TextTrack.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextTrackOptions
  extends StObject
     with TrackOptions {
  
  var default: js.UndefOr[Boolean] = js.undefined
  
  @JSName("kind")
  var kind_TextTrackOptions: js.UndefOr[Kind] = js.undefined
  
  var mode: js.UndefOr[Mode] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var srclang: js.UndefOr[String] = js.undefined
  
  var tech: js.UndefOr[Tech] = js.undefined
}
object TextTrackOptions {
  
  @scala.inline
  def apply(): TextTrackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextTrackOptions]
  }
  
  @scala.inline
  implicit class TextTrackOptionsMutableBuilder[Self <: TextTrackOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setKind(value: Kind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def setSrclang(value: String): Self = StObject.set(x, "srclang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrclangUndefined: Self = StObject.set(x, "srclang", js.undefined)
    
    @scala.inline
    def setTech(value: Tech): Self = StObject.set(x, "tech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTechUndefined: Self = StObject.set(x, "tech", js.undefined)
  }
}
