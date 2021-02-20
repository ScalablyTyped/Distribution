package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details for a network registration state change notification. */
@js.native
trait MobileBroadbandPinLockStateChangeTriggerDetails extends StObject {
  
  /** Gets the collection of PIN lock state change details associated with a notification. */
  var pinLockStateChanges: IVectorView[MobileBroadbandPinLockStateChange] = js.native
}
object MobileBroadbandPinLockStateChangeTriggerDetails {
  
  @scala.inline
  def apply(pinLockStateChanges: IVectorView[MobileBroadbandPinLockStateChange]): MobileBroadbandPinLockStateChangeTriggerDetails = {
    val __obj = js.Dynamic.literal(pinLockStateChanges = pinLockStateChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandPinLockStateChangeTriggerDetails]
  }
  
  @scala.inline
  implicit class MobileBroadbandPinLockStateChangeTriggerDetailsMutableBuilder[Self <: MobileBroadbandPinLockStateChangeTriggerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPinLockStateChanges(value: IVectorView[MobileBroadbandPinLockStateChange]): Self = StObject.set(x, "pinLockStateChanges", value.asInstanceOf[js.Any])
  }
}
