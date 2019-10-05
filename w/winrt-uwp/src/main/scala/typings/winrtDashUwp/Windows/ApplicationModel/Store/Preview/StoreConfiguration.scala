package typings.winrtDashUwp.Windows.ApplicationModel.Store.Preview

import typings.std.Date
import typings.winrtDashUwp.Windows.Foundation.Collections.IIterable
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines static methods and properties for accessing information about the device hardware and configuring information about the system, the mobile operator, and the active user account. These members are used in various Windows Store scenarios. */
@JSGlobal("Windows.ApplicationModel.Store.Preview.StoreConfiguration")
@js.native
abstract class StoreConfiguration () extends js.Object

/* static members */
@JSGlobal("Windows.ApplicationModel.Store.Preview.StoreConfiguration")
@js.native
object StoreConfiguration extends js.Object {
  /** Gets hardware manufacturer information for the current device. */
  var hardwareManufacturerInfo: StoreHardwareManufacturerInfo = js.native
  /** Gets or sets a value that indicates whether the Windows Store prompts the user before making a purchase. */
  var purchasePromptingPolicy: Double = js.native
  /**
    * Given a list of hardware features, this method returns a modified list that contains only the hardware features that are supported on the current device.
    * @param systemFeatures A list of StoreSystemFeature objects that represent the hardware features to be queried on the current device.
    * @return An asynchronous operation that, on successful completion, returns a list of hardware features that are supported on the current device. If you use Asynchronous programming, the result type is a read-only list/vector of StoreSystemFeature items. (You can use APIs of IVectorView<StoreSystemFeature> for C++ or JavaScript, APIs of IReadOnlyList<StoreSystemFeature> for .NET.)
    */
  def filterUnsupportedSystemFeaturesAsync(systemFeatures: IIterable[StoreSystemFeature]): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Determines whether a given user ID is also being used to sign in to the Windows Store. Typically, this method is used to determine whether a user ID that is currently signed in to an app is also signed in to the Windows Store.
    * @param webAccountId The user ID (typically obtained from the WebAccount.Id property) to check.
    * @return True if the user account specified by webAccountId is the same account that is signed in to the Windows Store; otherwise false.
    */
  def isStoreWebAccountId(webAccountId: String): Boolean = js.native
  /**
    * Configures mobile operator information for the device.
    * @param mobileOperatorId The mobile operator ID.
    * @param appDownloadLimitInMegabytes The maximum app download size defined by the mobile operator, in MB.
    * @param updateDownloadLimitInMegabytes The maximum OS update download size defined by the mobile operator, in MB.
    */
  def setMobileOperatorConfiguration(
    mobileOperatorId: String,
    appDownloadLimitInMegabytes: Double,
    updateDownloadLimitInMegabytes: Double
  ): Unit = js.native
  /**
    * Sets the ID of the user account that is signed in to the Windows Store so that other apps can query against this ID.
    * @param webAccountId The user account ID (typically obtained from the WebAccount.Id property) that is signed in to the Windows Store.
    */
  def setStoreWebAccountId(webAccountId: String): Unit = js.native
  /**
    * Configures miscellaneous system information for the device.
    * @param catalogHardwareManufacturerId The ID of the hardware manufacturer.
    * @param catalogStoreContentModifierId The ID of the Windows Store content modifier.
    * @param systemConfigurationExpiration The expiration date for the system configuration.
    * @param catalogHardwareDescriptor A descriptor string that specifies the hardware components supported by the device.
    */
  def setSystemConfiguration(
    catalogHardwareManufacturerId: String,
    catalogStoreContentModifierId: String,
    systemConfigurationExpiration: Date,
    catalogHardwareDescriptor: String
  ): Unit = js.native
}

