package typings.tizenCommonWeb.packageMod

import typings.tizenCommonWeb.tizenMod.ErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackageManager extends js.Object {
  /**
    * Gets information of an installed package.
    *
    * If the ID is set to <var>null</var> or not set at all, it returns the package information of the current application.
    * The list of installed packages and their package IDs is obtained using `getPackagesInfo()`.
    *
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/package.info
    *
    * @param id A string representing the package ID. If the ID is not provided, the package information of the calling application is returned.
    *
    * @returns The information of a package.
    *
    * @throw WebAPIException `TypeMismatchError`, `SecurityError`, `NotFoundError`, `UnknownError`.
    */
  def getPackageInfo(): PackageInformation = js.native
  def getPackageInfo(id: PackageId): PackageInformation = js.native
  /**
    * Gets information of the installed packages.
    *
    * The result contains the snapshots of the installed packages information.
    *
    * The `errorCallback()` is launched with this error type:
    * - UnknownError - If any other platform error occurs.
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/package.info
    *
    * @param successCallback The method to call when an invocation ends successfully.
    * @param errorCallback The method to call when an error occurs.
    *
    * @throw WebAPIException `TypeMismatchError`, `SecurityError`.
    */
  def getPackagesInfo(successCallback: PackageInformationArraySuccessCallback): Unit = js.native
  def getPackagesInfo(successCallback: PackageInformationArraySuccessCallback, errorCallback: ErrorCallback): Unit = js.native
  /**
    * Installs a package with a specified file on a device.
    *
    * This API provides a way to notify the progress and completion of an installation request through PackageProgressCallback.
    *
    * The `ErrorCallback()` is launched with these error types:
    * - `NotFoundError` - If the package is not found at the specified location.
    * - `UnknownError` - If it is not allowed to install the package by the platform or any other platform error occurs.
    * @privilegeLevel platform
    * @privilegeName http://tizen.org/privilege/packagemanager.install
    *
    * @remark Virtual path cannot be used for the parameter. First, you need to convert any virtual path to a file URI path using the resolve function in the Filesystem API before passing it to the function.
    *
    * @param packageFileURI The location of the package to install.
    * @param progressCallback The method to invoke when the installation is in progress or has been completed.
    * @param errorCallback The method to invoke when an error occurs.
    *
    * @throw WebAPIException `TypeMismatchError`, `SecurityError`.
    *
    */
  def install(packageFileURI: String, progressCallback: PackageProgressCallback): Unit = js.native
  def install(packageFileURI: String, progressCallback: PackageProgressCallback, errorCallback: ErrorCallback): Unit = js.native
  /**
    * Sets a listener to receive notifications for any changes made to the list of installed packages.
    *
    * This method sets a `PackageInformationEventCallback` type callback that is triggered when a package is installed, removed, or updated.
    *
    * The callback lasts until the `unsetPackageInfoEventListener()` method is called.
    *
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/package.info
    *
    * @param eventCallback The method to be called when any change is made to the list of installed packages.
    *
    * @throw WebAPIException `TypeMismatchError`, `SecurityError`, `UnknownError`.
    */
  def setPackageInfoEventListener(eventCallback: PackageInformationEventCallback): Unit = js.native
  /**
    * Uninstalls the package with a specified package ID.
    *
    * This API provides a way to notify about the progress and completion of an uninstallation request through PackageProgressCallback.
    *
    * The `ErrorCallback()` is launched with these error types:
    * - `NotFoundError` - If the package is not found with the specified ID.
    * - `UnknownError` - If it is not allowed to uninstall the package from the platform or any other platform error occurs.
    *
    *
    * @privilegeLevel platform
    * @privilegeName http://tizen.org/privilege/packagemanager.install
    *
    * @remark Some preloaded packages cannot be uninstalled. In this case, ErrorCallback with the UnKnownError type is launched.
    *
    * @param id The package ID to uninstall.
    * @param progressCallback The method to invoke when uninstallation is in progress or has been completed.
    * @param errorCallback The method to invoke when an error occurs.
    *
    * @throw WebAPIException `TypeMismatchError`, `SecurityError`.
    *
    */
  def uninstall(id: PackageId, progressCallback: PackageProgressCallback): Unit = js.native
  def uninstall(id: PackageId, progressCallback: PackageProgressCallback, errorCallback: ErrorCallback): Unit = js.native
  /**
    * Unsets the listener to stop receiving package notifications.
    *
    * Calling this function has no effect if listener is not set.
    *
    *
    * @privilegeLevel public
    * @privilegeName http://tizen.org/privilege/package.info
    *
    * @throw WebAPIException `TypeMismatchError`, `SecurityError`, `UnknownError`.
    */
  def unsetPackageInfoEventListener(): Unit = js.native
}

