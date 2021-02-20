package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the VideoStabilizationEffect::EnabledChanged event. */
@js.native
trait VideoStabilizationEffectEnabledChangedEventArgs extends StObject {
  
  /** Gets a value indicating the reason why the VideoStabilizationEffect::Enabled property changed. */
  var reason: VideoStabilizationEffectEnabledChangedReason = js.native
}
object VideoStabilizationEffectEnabledChangedEventArgs {
  
  @scala.inline
  def apply(reason: VideoStabilizationEffectEnabledChangedReason): VideoStabilizationEffectEnabledChangedEventArgs = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoStabilizationEffectEnabledChangedEventArgs]
  }
  
  @scala.inline
  implicit class VideoStabilizationEffectEnabledChangedEventArgsMutableBuilder[Self <: VideoStabilizationEffectEnabledChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: VideoStabilizationEffectEnabledChangedReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
