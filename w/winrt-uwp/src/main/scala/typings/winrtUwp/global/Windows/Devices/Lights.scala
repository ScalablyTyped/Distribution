package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for accessing and controlling lamp devices. */
object Lights {
  
  /** Represents a lamp device. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Lights.Lamp")
  @js.native
  open class Lamp ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Lights.Lamp
  object Lamp {
    
    @JSGlobal("Windows.Devices.Lights.Lamp")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets a Lamp object representing the lamp device with the specified ID.
      * @param deviceId The ID of the requested lamp device.
      * @return An asynchronous operation that returns a Lamp object upon successful completion.
      */
    /* static member */
    inline def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Lights.Lamp] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Lights.Lamp]]
    
    /**
      * Gets a Lamp object representing the default lamp for the device.
      * @return An asynchronous operation that returns a Lamp object upon successful completion.
      */
    /* static member */
    inline def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Lights.Lamp] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAsync")().asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Lights.Lamp]]
    
    /**
      * Returns the class selection string that you can use to enumerate lamp devices.
      * @return The class selection string for lamp devices.
      */
    /* static member */
    inline def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
  }
  
  /** Provides data for the AvailabilityChanged event. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Lights.LampAvailabilityChangedEventArgs")
  @js.native
  open class LampAvailabilityChangedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Lights.LampAvailabilityChangedEventArgs {
    
    /** Gets a value indicating whether the lamp device that triggered the event is available. */
    /* CompleteClass */
    var isAvailable: Boolean = js.native
  }
}
