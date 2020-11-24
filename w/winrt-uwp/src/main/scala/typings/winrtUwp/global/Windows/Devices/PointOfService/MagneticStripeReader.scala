package typings.winrtUwp.global.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the magnetic stripe reader device. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReader")
@js.native
abstract class MagneticStripeReader ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReader
/* static members */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReader")
@js.native
object MagneticStripeReader extends js.Object {
  
  /**
    * Creates a MagneticStripeReader object from DeviceInformation.Id .
    * @param deviceId The DeviceInformation.Id that identifies a specific magnetic stripe reader, which can be retrieved from the DeviceId property.
    * @return The magnetic stripe reader specified by the unique device identifier. Returns a null object in the following cases:
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReader] = js.native
  
  /**
    * Returns the first magnetic stripe reader found.
    * @return The first magnetic stripe reader found. Returns a null object in the following cases:
    */
  def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReader] = js.native
  
  /**
    * Returns an Advanced Query Syntax (AQS) string that is used to enumerate available magnetic stripe readers.
    * @return An Advanced Query Syntax (AQS) string that is used to enumerate available magnetic stripe readers.
    */
  def getDeviceSelector(): String = js.native
}
