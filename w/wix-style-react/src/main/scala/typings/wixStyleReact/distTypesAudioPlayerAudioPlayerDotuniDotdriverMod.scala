package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAudioPlayerAudioPlayerDotuniDotdriverMod {
  
  trait AudioPlayerUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOnPlayPauseButton(): js.Promise[Unit]
    
    def timeIndicatorText(): js.Promise[String]
  }
  object AudioPlayerUniDriver {
    
    inline def apply(
      click: () => js.Promise[Unit],
      clickOnPlayPauseButton: () => js.Promise[Unit],
      element: () => js.Promise[Any],
      exists: () => js.Promise[Boolean],
      timeIndicatorText: () => js.Promise[String]
    ): AudioPlayerUniDriver = {
      val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), clickOnPlayPauseButton = js.Any.fromFunction0(clickOnPlayPauseButton), element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), timeIndicatorText = js.Any.fromFunction0(timeIndicatorText))
      __obj.asInstanceOf[AudioPlayerUniDriver]
    }
    
    extension [Self <: AudioPlayerUniDriver](x: Self) {
      
      inline def setClickOnPlayPauseButton(value: () => js.Promise[Unit]): Self = StObject.set(x, "clickOnPlayPauseButton", js.Any.fromFunction0(value))
      
      inline def setTimeIndicatorText(value: () => js.Promise[String]): Self = StObject.set(x, "timeIndicatorText", js.Any.fromFunction0(value))
    }
  }
}
