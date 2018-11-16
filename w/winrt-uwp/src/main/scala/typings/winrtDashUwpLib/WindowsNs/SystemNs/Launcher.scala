package typings
package winrtDashUwpLib.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Starts the default app associated with the specified file or URI. */
@JSGlobal("Windows.System.Launcher")
@js.native
abstract class Launcher () extends js.Object

/** Starts the default app associated with the specified file or URI. */
@JSGlobal("Windows.System.Launcher")
@js.native
object Launcher extends js.Object {
  /**
               * Enumerate the file handlers on the device.
               * @param extension The file extension that you want to find handlers for. For example, ".bat". Include the leading period '.'.
               * @return A list of AppInfo s for each application that handles the specified file extension.
               */
  def findFileHandlersAsync(extension: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppInfo]
  ] = js.native
  /**
               * Enumerates the
               * @param scheme The scheme name that you find to find handlers for. For example, "ms-lens".
               * @return A list of AppInfo s for each application that handles the specified scheme.
               */
  def findUriSchemeHandlersAsync(scheme: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppInfo]
  ] = js.native
  /**
               * Enumerate the scheme handlers on the device.
               * @param scheme The scheme name that you find to find handlers for. For example, "ms-lens".
               * @param launchQuerySupportType Filter the list of handlers by whether they can be launched for results or not.
               * @return A list of AppInfo s for each application that handles the specified scheme.
               */
  def findUriSchemeHandlersAsync(
    scheme: java.lang.String,
    launchQuerySupportType: winrtDashUwpLib.WindowsNs.SystemNs.LaunchQuerySupportType
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppInfo]
  ] = js.native
  /**
               * Starts the default app associated with the specified file.
               * @param file The file.
               * @return The launch operation.
               */
  def launchFileAsync(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
               * Starts the default app associated with the specified file, using the specified options.
               * @param file The file.
               * @param options The launch options for the app.
               * @return The launch operation.
               */
  def launchFileAsync(
    file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    options: winrtDashUwpLib.WindowsNs.SystemNs.LauncherOptions
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
               * Launches File Explorer and displays the contents of the specified folder.
               * @param folder The folder to display in File Explorer.
               * @return The result of the operation.
               */
  def launchFolderAsync(folder: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFolder): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
               * Launches File Explorer with the specified options and displays the contents of the specified folder.
               * @param folder The folder to display in File Explorer.
               * @param options Options that specify the amount of screen space that File Explorer fills, and the list of items to select in the specified folder.
               * @return The result of the operation.
               */
  def launchFolderAsync(
    folder: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFolder,
    options: winrtDashUwpLib.WindowsNs.SystemNs.FolderLauncherOptions
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
               * Starts the default app associated with the URI scheme name for the specified URI.
               * @param uri The URI.
               * @return The launch operation.
               */
  def launchUriAsync(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
               * Starts the default app associated with the URI scheme name or the one specified by the ContentType for the specified URI, using the specified options.
               * @param uri The URI.
               * @param options The launch options for the app.
               * @return The launch operation.
               */
  def launchUriAsync(
    uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    options: winrtDashUwpLib.WindowsNs.SystemNs.LauncherOptions
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
               * Starts the default app associated with the URI scheme name for the specified URI, using the specified options and input data.
               * @param uri The URI.
               * @param options The launch options for the app.
               * @param inputData The input data for the app.
               * @return The launch operation.
               */
  def launchUriAsync(
    uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    options: winrtDashUwpLib.WindowsNs.SystemNs.LauncherOptions,
    inputData: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
               * Asynchronously starts the default app associated with the URI scheme name for the specified URI, using the specified options.
               * @param uri The Uri to launch.
               * @param options The launch options.
               * @return When this method completes, it returns the results of the launch.
               */
  def launchUriForResultsAsync(
    uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    options: winrtDashUwpLib.WindowsNs.SystemNs.LauncherOptions
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SystemNs.LaunchUriResult] = js.native
  /**
               * Asynchronously starts the default app associated with the URI scheme name for the specified URI, using the specified options and input data.
               * @param uri The Uri to launch.
               * @param options The launch options.
               * @param inputData The data to send to the launched app.
               * @return When this method completes, it returns the results of the launch.
               */
  def launchUriForResultsAsync(
    uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    options: winrtDashUwpLib.WindowsNs.SystemNs.LauncherOptions,
    inputData: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SystemNs.LaunchUriResult] = js.native
  /**
               * Asynchronously query whether an app can be activated for the specified file.
               * @param file The file for which to query support.
               * @return A value that indicates whether an application can be activated for the file.
               */
  def queryFileSupportAsync(file: winrtDashUwpLib.WindowsNs.StorageNs.StorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SystemNs.LaunchQuerySupportStatus] = js.native
  /**
               * Asynchronously query whether an app with the specified package name can be activated for the specified file.
               * @param file The file for which to query support.
               * @param packageFamilyName The package for which to query support.
               * @return A value that indicates whether an application can be activated for the file.
               */
  def queryFileSupportAsync(file: winrtDashUwpLib.WindowsNs.StorageNs.StorageFile, packageFamilyName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SystemNs.LaunchQuerySupportStatus] = js.native
  /**
               * Asynchronously query whether an app can be activated for the specified URI and launch type.
               * @param uri The URI for which to query support.
               * @param launchQuerySupportType The type of launch for which to query support.
               * @return A value that indicates whether an application is available to launch the URI.
               */
  def queryUriSupportAsync(
    uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    launchQuerySupportType: winrtDashUwpLib.WindowsNs.SystemNs.LaunchQuerySupportType
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SystemNs.LaunchQuerySupportStatus] = js.native
  /**
               * Asynchronously query whether an app can be activated for the specified URI, launch type, and package name.
               * @param uri The URI for which to query support.
               * @param launchQuerySupportType The type of launch for which to query support.
               * @param packageFamilyName Specifies a specific package that will be used to launch this URI.
               * @return A value that indicates whether the application is available to launch the URI.
               */
  def queryUriSupportAsync(
    uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri,
    launchQuerySupportType: winrtDashUwpLib.WindowsNs.SystemNs.LaunchQuerySupportType,
    packageFamilyName: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SystemNs.LaunchQuerySupportStatus] = js.native
}

