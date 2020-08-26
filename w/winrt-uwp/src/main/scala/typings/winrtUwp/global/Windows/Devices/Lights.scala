package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides APIs for accessing and controlling lamp devices. */
@JSGlobal("Windows.Devices.Lights")
@js.native
object Lights extends js.Object {
  /** Represents a lamp device. */
  @js.native
  abstract class Lamp ()
    extends typings.winrtUwp.Windows.Devices.Lights.Lamp
  
  /** Provides data for the AvailabilityChanged event. */
  @js.native
  abstract class LampAvailabilityChangedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.Lights.LampAvailabilityChangedEventArgs
  
  /* static members */
  @js.native
  object Lamp extends js.Object {
    /**
      * Gets a Lamp object representing the lamp device with the specified ID.
      * @param deviceId The ID of the requested lamp device.
      * @return An asynchronous operation that returns a Lamp object upon successful completion.
      */
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Lights.Lamp] = js.native
    /**
      * Gets a Lamp object representing the default lamp for the device.
      * @return An asynchronous operation that returns a Lamp object upon successful completion.
      */
    def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Lights.Lamp] = js.native
    /**
      * Returns the class selection string that you can use to enumerate lamp devices.
      * @return The class selection string for lamp devices.
      */
    def getDeviceSelector(): String = js.native
  }
  
}

