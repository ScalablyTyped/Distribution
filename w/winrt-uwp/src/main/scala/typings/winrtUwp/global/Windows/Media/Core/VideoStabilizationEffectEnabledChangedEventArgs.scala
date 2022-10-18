package typings.winrtUwp.global.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the VideoStabilizationEffect::EnabledChanged event. */
/* note: abstract class */ @JSGlobal("Windows.Media.Core.VideoStabilizationEffectEnabledChangedEventArgs")
@js.native
open class VideoStabilizationEffectEnabledChangedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Core.VideoStabilizationEffectEnabledChangedEventArgs {
  
  /** Gets a value indicating the reason why the VideoStabilizationEffect::Enabled property changed. */
  /* CompleteClass */
  var reason: typings.winrtUwp.Windows.Media.Core.VideoStabilizationEffectEnabledChangedReason = js.native
}
