package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Playable extends StObject {
  
  var dailymotion: PlayerOptions
  
  var playable: Unit
  
  var youtube: Unit
}
object Playable {
  
  @scala.inline
  def apply(dailymotion: PlayerOptions, playable: Unit, youtube: Unit): Playable = {
    val __obj = js.Dynamic.literal(dailymotion = dailymotion.asInstanceOf[js.Any], playable = playable.asInstanceOf[js.Any], youtube = youtube.asInstanceOf[js.Any])
    __obj.asInstanceOf[Playable]
  }
  
  @scala.inline
  implicit class PlayableMutableBuilder[Self <: Playable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDailymotion(value: PlayerOptions): Self = StObject.set(x, "dailymotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayable(value: Unit): Self = StObject.set(x, "playable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYoutube(value: Unit): Self = StObject.set(x, "youtube", value.asInstanceOf[js.Any])
  }
}
