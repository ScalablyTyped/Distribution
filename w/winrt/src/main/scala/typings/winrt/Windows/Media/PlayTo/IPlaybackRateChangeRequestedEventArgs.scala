package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlaybackRateChangeRequestedEventArgs extends StObject {
  
  var rate: Double = js.native
}
object IPlaybackRateChangeRequestedEventArgs {
  
  @scala.inline
  def apply(rate: Double): IPlaybackRateChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlaybackRateChangeRequestedEventArgs]
  }
  
  @scala.inline
  implicit class IPlaybackRateChangeRequestedEventArgsMutableBuilder[Self <: IPlaybackRateChangeRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
  }
}
