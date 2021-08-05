package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackRateChangeRequestedEventArgs
  extends StObject
     with IPlaybackRateChangeRequestedEventArgs
object PlaybackRateChangeRequestedEventArgs {
  
  inline def apply(rate: Double): PlaybackRateChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackRateChangeRequestedEventArgs]
  }
}
