package typings.vhtml.mod.JSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var autoplay: js.UndefOr[Boolean] = js.undefined
  
  var controls: js.UndefOr[Boolean] = js.undefined
  
  var controlslist: js.UndefOr[String] = js.undefined
  
  var crossorigin: js.UndefOr[String] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var mediagroup: js.UndefOr[String] = js.undefined
  
  var muted: js.UndefOr[Boolean] = js.undefined
  
  var playsinline: js.UndefOr[Boolean] = js.undefined
  
  var preload: js.UndefOr[String] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
}
object MediaHTMLAttributes {
  
  inline def apply(): MediaHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaHTMLAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaHTMLAttributes] (val x: Self) extends AnyVal {
    
    inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setControlslist(value: String): Self = StObject.set(x, "controlslist", value.asInstanceOf[js.Any])
    
    inline def setControlslistUndefined: Self = StObject.set(x, "controlslist", js.undefined)
    
    inline def setCrossorigin(value: String): Self = StObject.set(x, "crossorigin", value.asInstanceOf[js.Any])
    
    inline def setCrossoriginUndefined: Self = StObject.set(x, "crossorigin", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setMediagroup(value: String): Self = StObject.set(x, "mediagroup", value.asInstanceOf[js.Any])
    
    inline def setMediagroupUndefined: Self = StObject.set(x, "mediagroup", js.undefined)
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setPlaysinline(value: Boolean): Self = StObject.set(x, "playsinline", value.asInstanceOf[js.Any])
    
    inline def setPlaysinlineUndefined: Self = StObject.set(x, "playsinline", js.undefined)
    
    inline def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
