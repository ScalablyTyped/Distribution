package typings.wixUiCore.videoTypesMod

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
  
  @scala.inline
  def apply(): IConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConfig]
  }
  
  @scala.inline
  implicit class IConfigMutableBuilder[Self <: IConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDailymotion(value: IDailyMotionConfig): Self = StObject.set(x, "dailymotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailymotionUndefined: Self = StObject.set(x, "dailymotion", js.undefined)
    
    @scala.inline
    def setFacebook(value: IFacebookConfig): Self = StObject.set(x, "facebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacebookUndefined: Self = StObject.set(x, "facebook", js.undefined)
    
    @scala.inline
    def setPlayable(value: IPlayableConfig): Self = StObject.set(x, "playable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayableUndefined: Self = StObject.set(x, "playable", js.undefined)
    
    @scala.inline
    def setTwitch(value: ITwitchConfig): Self = StObject.set(x, "twitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwitchUndefined: Self = StObject.set(x, "twitch", js.undefined)
    
    @scala.inline
    def setVimeo(value: IVimeoConfig): Self = StObject.set(x, "vimeo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVimeoUndefined: Self = StObject.set(x, "vimeo", js.undefined)
    
    @scala.inline
    def setYoutube(value: IYouTubeMotionConfig): Self = StObject.set(x, "youtube", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYoutubeUndefined: Self = StObject.set(x, "youtube", js.undefined)
  }
}
