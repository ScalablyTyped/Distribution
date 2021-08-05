package typings.wixUiCore.componentsVideoTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConfig extends StObject {
  
  var dailymotion: js.UndefOr[IDailyMotionConfig] = js.undefined
  
  var facebook: js.UndefOr[IFacebookConfig] = js.undefined
  
  var playable: js.UndefOr[IPlayableConfig] = js.undefined
  
  var twitch: js.UndefOr[ITwitchConfig] = js.undefined
  
  var vimeo: js.UndefOr[IVimeoConfig] = js.undefined
  
  var youtube: js.UndefOr[IYouTubeMotionConfig] = js.undefined
}
object IConfig {
  
  inline def apply(): IConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConfig]
  }
  
  extension [Self <: IConfig](x: Self) {
    
    inline def setDailymotion(value: IDailyMotionConfig): Self = StObject.set(x, "dailymotion", value.asInstanceOf[js.Any])
    
    inline def setDailymotionUndefined: Self = StObject.set(x, "dailymotion", js.undefined)
    
    inline def setFacebook(value: IFacebookConfig): Self = StObject.set(x, "facebook", value.asInstanceOf[js.Any])
    
    inline def setFacebookUndefined: Self = StObject.set(x, "facebook", js.undefined)
    
    inline def setPlayable(value: IPlayableConfig): Self = StObject.set(x, "playable", value.asInstanceOf[js.Any])
    
    inline def setPlayableUndefined: Self = StObject.set(x, "playable", js.undefined)
    
    inline def setTwitch(value: ITwitchConfig): Self = StObject.set(x, "twitch", value.asInstanceOf[js.Any])
    
    inline def setTwitchUndefined: Self = StObject.set(x, "twitch", js.undefined)
    
    inline def setVimeo(value: IVimeoConfig): Self = StObject.set(x, "vimeo", value.asInstanceOf[js.Any])
    
    inline def setVimeoUndefined: Self = StObject.set(x, "vimeo", js.undefined)
    
    inline def setYoutube(value: IYouTubeMotionConfig): Self = StObject.set(x, "youtube", value.asInstanceOf[js.Any])
    
    inline def setYoutubeUndefined: Self = StObject.set(x, "youtube", js.undefined)
  }
}
