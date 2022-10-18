package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details for a network registration state change notification. */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinLockStateChangeTriggerDetails")
@js.native
open class MobileBroadbandPinLockStateChangeTriggerDetails ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinLockStateChangeTriggerDetails {
  
  /** Gets the collection of PIN lock state change details associated with a notification. */
  /* CompleteClass */
  var pinLockStateChanges: IVectorView[
    typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinLockStateChange
  ] = js.native
}
