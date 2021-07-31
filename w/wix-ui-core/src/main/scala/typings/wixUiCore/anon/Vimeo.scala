package typings.wixUiCore.anon

import typings.wixUiCore.videoTypesMod.VerifierType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vimeo extends StObject {
  
  var dailymotion: VerifierType
  
  var facebook: VerifierType
  
  var playable: VerifierType
  
  var twitch: VerifierType
  
  var vimeo: VerifierType
  
  var youtube: VerifierType
}
object Vimeo {
  
  @scala.inline
  def apply(
    dailymotion: /* url */ String | js.Array[String] => Boolean,
    facebook: /* url */ String | js.Array[String] => Boolean,
    playable: /* url */ String | js.Array[String] => Boolean,
    twitch: /* url */ String | js.Array[String] => Boolean,
    vimeo: /* url */ String | js.Array[String] => Boolean,
    youtube: /* url */ String | js.Array[String] => Boolean
  ): Vimeo = {
    val __obj = js.Dynamic.literal(dailymotion = js.Any.fromFunction1(dailymotion), facebook = js.Any.fromFunction1(facebook), playable = js.Any.fromFunction1(playable), twitch = js.Any.fromFunction1(twitch), vimeo = js.Any.fromFunction1(vimeo), youtube = js.Any.fromFunction1(youtube))
    __obj.asInstanceOf[Vimeo]
  }
  
  @scala.inline
  implicit class VimeoMutableBuilder[Self <: Vimeo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDailymotion(value: /* url */ String | js.Array[String] => Boolean): Self = StObject.set(x, "dailymotion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFacebook(value: /* url */ String | js.Array[String] => Boolean): Self = StObject.set(x, "facebook", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPlayable(value: /* url */ String | js.Array[String] => Boolean): Self = StObject.set(x, "playable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTwitch(value: /* url */ String | js.Array[String] => Boolean): Self = StObject.set(x, "twitch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVimeo(value: /* url */ String | js.Array[String] => Boolean): Self = StObject.set(x, "vimeo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setYoutube(value: /* url */ String | js.Array[String] => Boolean): Self = StObject.set(x, "youtube", js.Any.fromFunction1(value))
  }
}
