package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Youtube extends StObject {
  
  var dailymotion: Unit
  
  var playable: Unit
  
  var youtube: PlayerOptionsColor
}
object Youtube {
  
  @scala.inline
  def apply(dailymotion: Unit, playable: Unit, youtube: PlayerOptionsColor): Youtube = {
    val __obj = js.Dynamic.literal(dailymotion = dailymotion.asInstanceOf[js.Any], playable = playable.asInstanceOf[js.Any], youtube = youtube.asInstanceOf[js.Any])
    __obj.asInstanceOf[Youtube]
  }
  
  @scala.inline
  implicit class YoutubeMutableBuilder[Self <: Youtube] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDailymotion(value: Unit): Self = StObject.set(x, "dailymotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayable(value: Unit): Self = StObject.set(x, "playable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYoutube(value: PlayerOptionsColor): Self = StObject.set(x, "youtube", value.asInstanceOf[js.Any])
  }
}
