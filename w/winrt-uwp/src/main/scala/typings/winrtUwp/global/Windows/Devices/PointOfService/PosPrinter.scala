package typings.winrtUwp.global.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a point-of-service printer. */
@JSGlobal("Windows.Devices.PointOfService.PosPrinter")
@js.native
abstract class PosPrinter ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.PosPrinter
object PosPrinter {
  
  /**
    * Creates a PosPrinter object for point-of-service printer with the specified DeviceInformation.Id .
    * @param deviceId The DeviceInformation.Id that identifies a specific point-of-service printer.
    * @return The point-of-service printer that the unique device identifier identifies. Returns a null object in the following cases:
    */
  /* static member */
  @JSGlobal("Windows.Devices.PointOfService.PosPrinter.fromIdAsync")
  @js.native
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.PointOfService.PosPrinter] = js.native
  
  /**
    * Gets the default paired or locally-connected printer.
    * @return The default locally-connected printer.
    */
  /* static member */
  @JSGlobal("Windows.Devices.PointOfService.PosPrinter.getDefaultAsync")
  @js.native
  def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.PointOfService.PosPrinter] = js.native
  
  /**
    * Gets an Advanced Query Syntax (AQS) string that you can use to list the available point-of-service printers.
    * @return An Advanced Query Syntax (AQS) string that you can use to list the available point-of-service printers.
    */
  /* static member */
  @JSGlobal("Windows.Devices.PointOfService.PosPrinter.getDeviceSelector")
  @js.native
  def getDeviceSelector(): String = js.native
}
