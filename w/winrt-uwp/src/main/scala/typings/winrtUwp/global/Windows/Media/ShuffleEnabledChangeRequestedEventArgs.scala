package typings.winrtUwp.global.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the ShuffleEnabledChangeRequested event. */
@JSGlobal("Windows.Media.ShuffleEnabledChangeRequestedEventArgs")
@js.native
abstract class ShuffleEnabledChangeRequestedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.ShuffleEnabledChangeRequestedEventArgs {
  
  /** Gets a value indicating whether the request is to enable or disable shuffle. */
  /* CompleteClass */
  var requestedShuffleEnabled: Boolean = js.native
}
