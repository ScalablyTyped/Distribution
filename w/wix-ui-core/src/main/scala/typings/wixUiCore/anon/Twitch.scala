package typings.wixUiCore.anon

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Twitch extends StObject {
  
  var dailymotion: ComponentType[js.Any]
  
  var facebook: ComponentType[js.Any]
  
  var playable: ComponentType[js.Any]
  
  var twitch: ComponentType[js.Any]
  
  var vimeo: ComponentType[js.Any]
  
  var youtube: ComponentType[js.Any]
}
object Twitch {
  
  @scala.inline
  def apply(
    dailymotion: ComponentType[js.Any],
    facebook: ComponentType[js.Any],
    playable: ComponentType[js.Any],
    twitch: ComponentType[js.Any],
    vimeo: ComponentType[js.Any],
    youtube: ComponentType[js.Any]
  ): Twitch = {
    val __obj = js.Dynamic.literal(dailymotion = dailymotion.asInstanceOf[js.Any], facebook = facebook.asInstanceOf[js.Any], playable = playable.asInstanceOf[js.Any], twitch = twitch.asInstanceOf[js.Any], vimeo = vimeo.asInstanceOf[js.Any], youtube = youtube.asInstanceOf[js.Any])
    __obj.asInstanceOf[Twitch]
  }
  
  @scala.inline
  implicit class TwitchMutableBuilder[Self <: Twitch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDailymotion(value: ComponentType[js.Any]): Self = StObject.set(x, "dailymotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacebook(value: ComponentType[js.Any]): Self = StObject.set(x, "facebook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayable(value: ComponentType[js.Any]): Self = StObject.set(x, "playable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwitch(value: ComponentType[js.Any]): Self = StObject.set(x, "twitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVimeo(value: ComponentType[js.Any]): Self = StObject.set(x, "vimeo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYoutube(value: ComponentType[js.Any]): Self = StObject.set(x, "youtube", value.asInstanceOf[js.Any])
  }
}
