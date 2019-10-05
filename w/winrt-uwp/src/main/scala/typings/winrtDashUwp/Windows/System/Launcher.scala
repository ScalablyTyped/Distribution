package typings.winrtDashUwp.Windows.System

import typings.winrtDashUwp.Windows.ApplicationModel.AppInfo
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.Uri
import typings.winrtDashUwp.Windows.Storage.IStorageFile
import typings.winrtDashUwp.Windows.Storage.IStorageFolder
import typings.winrtDashUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Starts the default app associated with the specified file or URI. */
@JSGlobal("Windows.System.Launcher")
@js.native
abstract class Launcher () extends js.Object

/* static members */
@JSGlobal("Windows.System.Launcher")
@js.native
object Launcher extends js.Object {
  /**
    * Enumerate the file handlers on the device.
    * @param extension The file extension that you want to find handlers for. For example, ".bat". Include the leading period '.'.
    * @return A list of AppInfo s for each application that handles the specified file extension.
    */
  def findFileHandlersAsync(extension: String): IPromiseWithIAsyncOperation[IVectorView[AppInfo]] = js.native
  /**
    * Enumerates the
    * @param scheme The scheme name that you find to find handlers for. For example, "ms-lens".
    * @return A list of AppInfo s for each application that handles the specified scheme.
    */
  def findUriSchemeHandlersAsync(scheme: String): IPromiseWithIAsyncOperation[IVectorView[AppInfo]] = js.native
  /**
    * Enumerate the scheme handlers on the device.
    * @param scheme The scheme name that you find to find handlers for. For example, "ms-lens".
    * @param launchQuerySupportType Filter the list of handlers by whether they can be launched for results or not.
    * @return A list of AppInfo s for each application that handles the specified scheme.
    */
  def findUriSchemeHandlersAsync(scheme: String, launchQuerySupportType: LaunchQuerySupportType): IPromiseWithIAsyncOperation[IVectorView[AppInfo]] = js.native
  /**
    * Starts the default app associated with the specified file.
    * @param file The file.
    * @return The launch operation.
    */
  def launchFileAsync(file: IStorageFile): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Starts the default app associated with the specified file, using the specified options.
    * @param file The file.
    * @param options The launch options for the app.
    * @return The launch operation.
    */
  def launchFileAsync(file: IStorageFile, options: LauncherOptions): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Launches File Explorer and displays the contents of the specified folder.
    * @param folder The folder to display in File Explorer.
    * @return The result of the operation.
    */
  def launchFolderAsync(folder: IStorageFolder): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Launches File Explorer with the specified options and displays the contents of the specified folder.
    * @param folder The folder to display in File Explorer.
    * @param options Options that specify the amount of screen space that File Explorer fills, and the list of items to select in the specified folder.
    * @return The result of the operation.
    */
  def launchFolderAsync(folder: IStorageFolder, options: FolderLauncherOptions): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Starts the default app associated with the URI scheme name for the specified URI.
    * @param uri The URI.
    * @return The launch operation.
    */
  def launchUriAsync(uri: Uri): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Starts the default app associated with the URI scheme name or the one specified by the ContentType for the specified URI, using the specified options.
    * @param uri The URI.
    * @param options The launch options for the app.
    * @return The launch operation.
    */
  def launchUriAsync(uri: Uri, options: LauncherOptions): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Starts the default app associated with the URI scheme name for the specified URI, using the specified options and input data.
    * @param uri The URI.
    * @param options The launch options for the app.
    * @param inputData The input data for the app.
    * @return The launch operation.
    */
  def launchUriAsync(uri: Uri, options: LauncherOptions, inputData: ValueSet): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Asynchronously starts the default app associated with the URI scheme name for the specified URI, using the specified options.
    * @param uri The Uri to launch.
    * @param options The launch options.
    * @return When this method completes, it returns the results of the launch.
    */
  def launchUriForResultsAsync(uri: Uri, options: LauncherOptions): IPromiseWithIAsyncOperation[LaunchUriResult] = js.native
  /**
    * Asynchronously starts the default app associated with the URI scheme name for the specified URI, using the specified options and input data.
    * @param uri The Uri to launch.
    * @param options The launch options.
    * @param inputData The data to send to the launched app.
    * @return When this method completes, it returns the results of the launch.
    */
  def launchUriForResultsAsync(uri: Uri, options: LauncherOptions, inputData: ValueSet): IPromiseWithIAsyncOperation[LaunchUriResult] = js.native
  /**
    * Asynchronously query whether an app can be activated for the specified file.
    * @param file The file for which to query support.
    * @return A value that indicates whether an application can be activated for the file.
    */
  def queryFileSupportAsync(file: StorageFile): IPromiseWithIAsyncOperation[LaunchQuerySupportStatus] = js.native
  /**
    * Asynchronously query whether an app with the specified package name can be activated for the specified file.
    * @param file The file for which to query support.
    * @param packageFamilyName The package for which to query support.
    * @return A value that indicates whether an application can be activated for the file.
    */
  def queryFileSupportAsync(file: StorageFile, packageFamilyName: String): IPromiseWithIAsyncOperation[LaunchQuerySupportStatus] = js.native
  /**
    * Asynchronously query whether an app can be activated for the specified URI and launch type.
    * @param uri The URI for which to query support.
    * @param launchQuerySupportType The type of launch for which to query support.
    * @return A value that indicates whether an application is available to launch the URI.
    */
  def queryUriSupportAsync(uri: Uri, launchQuerySupportType: LaunchQuerySupportType): IPromiseWithIAsyncOperation[LaunchQuerySupportStatus] = js.native
  /**
    * Asynchronously query whether an app can be activated for the specified URI, launch type, and package name.
    * @param uri The URI for which to query support.
    * @param launchQuerySupportType The type of launch for which to query support.
    * @param packageFamilyName Specifies a specific package that will be used to launch this URI.
    * @return A value that indicates whether the application is available to launch the URI.
    */
  def queryUriSupportAsync(uri: Uri, launchQuerySupportType: LaunchQuerySupportType, packageFamilyName: String): IPromiseWithIAsyncOperation[LaunchQuerySupportStatus] = js.native
}

