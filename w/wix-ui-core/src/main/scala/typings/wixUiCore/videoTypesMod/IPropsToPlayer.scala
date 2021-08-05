package typings.wixUiCore.videoTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropsToPlayer extends StObject {
  
  var alwaysShowLogo: js.UndefOr[String | js.Function] = js.undefined
  
  var controls: js.UndefOr[String | js.Function] = js.undefined
  
  var logoUrl: js.UndefOr[String | js.Function] = js.undefined
  
  var loop: js.UndefOr[String | js.Function] = js.undefined
  
  var muted: js.UndefOr[String | js.Function] = js.undefined
  
  var onLogoClick: js.UndefOr[String | js.Function] = js.undefined
  
  var playing: String | js.Function
  
  var preload: js.UndefOr[String | js.Function] = js.undefined
  
  var showTitle: js.UndefOr[String | js.Function] = js.undefined
  
  var src: String | js.Function
  
  var title: js.UndefOr[String | js.Function] = js.undefined
  
  var volume: js.UndefOr[String | js.Function] = js.undefined
}
object IPropsToPlayer {
  
  inline def apply(playing: String | js.Function, src: String | js.Function): IPropsToPlayer = {
    val __obj = js.Dynamic.literal(playing = playing.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropsToPlayer]
  }
  
  extension [Self <: IPropsToPlayer](x: Self) {
    
    inline def setAlwaysShowLogo(value: String | js.Function): Self = StObject.set(x, "alwaysShowLogo", value.asInstanceOf[js.Any])
    
    inline def setAlwaysShowLogoUndefined: Self = StObject.set(x, "alwaysShowLogo", js.undefined)
    
    inline def setControls(value: String | js.Function): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setLogoUrl(value: String | js.Function): Self = StObject.set(x, "logoUrl", value.asInstanceOf[js.Any])
    
    inline def setLogoUrlUndefined: Self = StObject.set(x, "logoUrl", js.undefined)
    
    inline def setLoop(value: String | js.Function): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setMuted(value: String | js.Function): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setOnLogoClick(value: String | js.Function): Self = StObject.set(x, "onLogoClick", value.asInstanceOf[js.Any])
    
    inline def setOnLogoClickUndefined: Self = StObject.set(x, "onLogoClick", js.undefined)
    
    inline def setPlaying(value: String | js.Function): Self = StObject.set(x, "playing", value.asInstanceOf[js.Any])
    
    inline def setPreload(value: String | js.Function): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setShowTitle(value: String | js.Function): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    inline def setSrc(value: String | js.Function): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String | js.Function): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVolume(value: String | js.Function): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
