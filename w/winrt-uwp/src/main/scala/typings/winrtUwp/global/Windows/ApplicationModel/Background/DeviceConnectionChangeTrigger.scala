package typings.winrtUwp.global.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that launches a background task when the connection status of a device changes. */
@JSGlobal("Windows.ApplicationModel.Background.DeviceConnectionChangeTrigger")
@js.native
abstract class DeviceConnectionChangeTrigger ()
  extends typings.winrtUwp.Windows.ApplicationModel.Background.DeviceConnectionChangeTrigger
object DeviceConnectionChangeTrigger {
  
  /**
    * Begins an asynchronous operation to get the DeviceConnectionChangeTrigger associated with the specified Id.
    * @param deviceId The device Id with which to find the associated trigger.
    * @return The DeviceConnectionChangeTrigger object associated with the specified device Id.
    */
  /* static member */
  @JSGlobal("Windows.ApplicationModel.Background.DeviceConnectionChangeTrigger.fromIdAsync")
  @js.native
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[
    typings.winrtUwp.Windows.ApplicationModel.Background.DeviceConnectionChangeTrigger
  ] = js.native
}
