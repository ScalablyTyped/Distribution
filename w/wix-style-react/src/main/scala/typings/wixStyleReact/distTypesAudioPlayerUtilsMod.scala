package typings.wixStyleReact

import typings.wixStyleReact.wixStyleReactDoubles.`8640000000000`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAudioPlayerUtilsMod {
  
  @JSImport("wix-style-react/dist/types/AudioPlayer/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react/dist/types/AudioPlayer/utils", "MAX_SECONDS")
  @js.native
  val MAX_SECONDS: `8640000000000` = js.native
  
  inline def positionToSeconds(positionInPercentage: Any, durationInSeconds: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("positionToSeconds")(positionInPercentage.asInstanceOf[js.Any], durationInSeconds.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def secondsToISO(seconds: Any, isLoaded: Any, duration: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("secondsToISO")(seconds.asInstanceOf[js.Any], isLoaded.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def secondsToPosition(seekInSeconds: Any, durationInSeconds: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("secondsToPosition")(seekInSeconds.asInstanceOf[js.Any], durationInSeconds.asInstanceOf[js.Any])).asInstanceOf[Double]
}
