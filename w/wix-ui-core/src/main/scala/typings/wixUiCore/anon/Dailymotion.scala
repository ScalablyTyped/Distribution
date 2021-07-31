package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dailymotion extends StObject {
  
  var dailymotion: Unit
  
  var playable: AlwaysShowLogo
  
  var youtube: Unit
}
object Dailymotion {
  
  @scala.inline
  def apply(dailymotion: Unit, playable: AlwaysShowLogo, youtube: Unit): Dailymotion = {
    val __obj = js.Dynamic.literal(dailymotion = dailymotion.asInstanceOf[js.Any], playable = playable.asInstanceOf[js.Any], youtube = youtube.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dailymotion]
  }
  
  @scala.inline
  implicit class DailymotionMutableBuilder[Self <: Dailymotion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDailymotion(value: Unit): Self = StObject.set(x, "dailymotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayable(value: AlwaysShowLogo): Self = StObject.set(x, "playable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYoutube(value: Unit): Self = StObject.set(x, "youtube", value.asInstanceOf[js.Any])
  }
}
