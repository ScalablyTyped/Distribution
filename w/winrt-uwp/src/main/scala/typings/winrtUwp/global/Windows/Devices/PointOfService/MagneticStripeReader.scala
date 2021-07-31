package typings.winrtUwp.global.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the magnetic stripe reader device. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReader")
@js.native
abstract class MagneticStripeReader ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReader
object MagneticStripeReader {
  
  @JSGlobal("Windows.Devices.PointOfService.MagneticStripeReader")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a MagneticStripeReader object from DeviceInformation.Id .
    * @param deviceId The DeviceInformation.Id that identifies a specific magnetic stripe reader, which can be retrieved from the DeviceId property.
    * @return The magnetic stripe reader specified by the unique device identifier. Returns a null object in the following cases:
    */
  /* static member */
  @scala.inline
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReader] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReader]]
  
  /**
    * Returns the first magnetic stripe reader found.
    * @return The first magnetic stripe reader found. Returns a null object in the following cases:
    */
  /* static member */
  @scala.inline
  def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReader] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAsync")().asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReader]]
  
  /**
    * Returns an Advanced Query Syntax (AQS) string that is used to enumerate available magnetic stripe readers.
    * @return An Advanced Query Syntax (AQS) string that is used to enumerate available magnetic stripe readers.
    */
  /* static member */
  @scala.inline
  def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
}
