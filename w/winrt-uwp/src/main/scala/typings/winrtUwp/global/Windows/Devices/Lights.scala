package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for accessing and controlling lamp devices. */
object Lights {
  
  /** Represents a lamp device. */
  @JSGlobal("Windows.Devices.Lights.Lamp")
  @js.native
  abstract class Lamp ()
    extends typings.winrtUwp.Windows.Devices.Lights.Lamp
  object Lamp {
    
    /**
      * Gets a Lamp object representing the lamp device with the specified ID.
      * @param deviceId The ID of the requested lamp device.
      * @return An asynchronous operation that returns a Lamp object upon successful completion.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Lights.Lamp.fromIdAsync")
    @js.native
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Lights.Lamp] = js.native
    
    /**
      * Gets a Lamp object representing the default lamp for the device.
      * @return An asynchronous operation that returns a Lamp object upon successful completion.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Lights.Lamp.getDefaultAsync")
    @js.native
    def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Lights.Lamp] = js.native
    
    /**
      * Returns the class selection string that you can use to enumerate lamp devices.
      * @return The class selection string for lamp devices.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Lights.Lamp.getDeviceSelector")
    @js.native
    def getDeviceSelector(): String = js.native
  }
  
  /** Provides data for the AvailabilityChanged event. */
  @JSGlobal("Windows.Devices.Lights.LampAvailabilityChangedEventArgs")
  @js.native
  abstract class LampAvailabilityChangedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.Lights.LampAvailabilityChangedEventArgs
}
