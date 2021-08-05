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
  
  inline def apply(dailymotion: Unit, playable: AlwaysShowLogo, youtube: Unit): Dailymotion = {
    val __obj = js.Dynamic.literal(dailymotion = dailymotion.asInstanceOf[js.Any], playable = playable.asInstanceOf[js.Any], youtube = youtube.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dailymotion]
  }
  
  extension [Self <: Dailymotion](x: Self) {
    
    inline def setDailymotion(value: Unit): Self = StObject.set(x, "dailymotion", value.asInstanceOf[js.Any])
    
    inline def setPlayable(value: AlwaysShowLogo): Self = StObject.set(x, "playable", value.asInstanceOf[js.Any])
    
    inline def setYoutube(value: Unit): Self = StObject.set(x, "youtube", value.asInstanceOf[js.Any])
  }
}
