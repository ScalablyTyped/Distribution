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
  
  inline def apply(dailymotion: Unit, playable: Unit, youtube: PlayerOptionsColor): Youtube = {
    val __obj = js.Dynamic.literal(dailymotion = dailymotion.asInstanceOf[js.Any], playable = playable.asInstanceOf[js.Any], youtube = youtube.asInstanceOf[js.Any])
    __obj.asInstanceOf[Youtube]
  }
  
  extension [Self <: Youtube](x: Self) {
    
    inline def setDailymotion(value: Unit): Self = StObject.set(x, "dailymotion", value.asInstanceOf[js.Any])
    
    inline def setPlayable(value: Unit): Self = StObject.set(x, "playable", value.asInstanceOf[js.Any])
    
    inline def setYoutube(value: PlayerOptionsColor): Self = StObject.set(x, "youtube", value.asInstanceOf[js.Any])
  }
}
