package typings.winrtUwp.global.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A cash drawer device in a retail scenario. */
@JSGlobal("Windows.Devices.PointOfService.CashDrawer")
@js.native
abstract class CashDrawer ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.CashDrawer
object CashDrawer {
  
  /**
    * Creates CashDrawer object from the DeviceInformation.Id .
    * @param deviceId The DeviceInformation.Id that identifies a specific cash drawer, which can be retrieved from the DeviceId property.
    * @return The cash drawer specified by the unique device identifier. Returns a null object in the following cases:
    */
  /* static member */
  @JSGlobal("Windows.Devices.PointOfService.CashDrawer.fromIdAsync")
  @js.native
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.PointOfService.CashDrawer] = js.native
  
  /**
    * Gets the default paired or locally-connected cash drawer.
    * @return The default locally-connected drawer. May return null if there is no drawer available.
    */
  /* static member */
  @JSGlobal("Windows.Devices.PointOfService.CashDrawer.getDefaultAsync")
  @js.native
  def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.PointOfService.CashDrawer] = js.native
  
  /**
    * Gets an Advanced Query Syntax (AQS) string that you can use to list the available cash drawers.
    * @return An Advanced Query Syntax (AQS) string that is used to enumerate available cash drawers.
    */
  /* static member */
  @JSGlobal("Windows.Devices.PointOfService.CashDrawer.getDeviceSelector")
  @js.native
  def getDeviceSelector(): String = js.native
}
