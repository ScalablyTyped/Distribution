package typings.winrtUwp.global.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a point-of-service printer. */
/* note: abstract class */ @JSGlobal("Windows.Devices.PointOfService.PosPrinter")
@js.native
open class PosPrinter ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.PosPrinter
object PosPrinter {
  
  @JSGlobal("Windows.Devices.PointOfService.PosPrinter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a PosPrinter object for point-of-service printer with the specified DeviceInformation.Id .
    * @param deviceId The DeviceInformation.Id that identifies a specific point-of-service printer.
    * @return The point-of-service printer that the unique device identifier identifies. Returns a null object in the following cases:
    */
  /* static member */
  inline def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.PointOfService.PosPrinter] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.PointOfService.PosPrinter]]
  
  /**
    * Gets the default paired or locally-connected printer.
    * @return The default locally-connected printer.
    */
  /* static member */
  inline def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.PointOfService.PosPrinter] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAsync")().asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.PointOfService.PosPrinter]]
  
  /**
    * Gets an Advanced Query Syntax (AQS) string that you can use to list the available point-of-service printers.
    * @return An Advanced Query Syntax (AQS) string that you can use to list the available point-of-service printers.
    */
  /* static member */
  inline def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
}
