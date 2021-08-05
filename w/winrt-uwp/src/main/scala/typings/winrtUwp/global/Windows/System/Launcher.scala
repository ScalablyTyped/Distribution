package typings.winrtUwp.global.Windows.System

import typings.winrtUwp.Windows.ApplicationModel.AppInfo
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.IStorageFolder
import typings.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Starts the default app associated with the specified file or URI. */
@JSGlobal("Windows.System.Launcher")
@js.native
abstract class Launcher ()
  extends StObject
     with typings.winrtUwp.Windows.System.Launcher
object Launcher {
  
  @JSGlobal("Windows.System.Launcher")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Enumerate the file handlers on the device.
    * @param extension The file extension that you want to find handlers for. For example, ".bat". Include the leading period '.'.
    * @return A list of AppInfo s for each application that handles the specified file extension.
    */
  /* static member */
  inline def findFileHandlersAsync(`extension`: String): IPromiseWithIAsyncOperation[IVectorView[AppInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFileHandlersAsync")(`extension`.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[AppInfo]]]
  
  /**
    * Enumerates the
    * @param scheme The scheme name that you find to find handlers for. For example, "ms-lens".
    * @return A list of AppInfo s for each application that handles the specified scheme.
    */
  /* static member */
  inline def findUriSchemeHandlersAsync(scheme: String): IPromiseWithIAsyncOperation[IVectorView[AppInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findUriSchemeHandlersAsync")(scheme.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[AppInfo]]]
  /**
    * Enumerate the scheme handlers on the device.
    * @param scheme The scheme name that you find to find handlers for. For example, "ms-lens".
    * @param launchQuerySupportType Filter the list of handlers by whether they can be launched for results or not.
    * @return A list of AppInfo s for each application that handles the specified scheme.
    */
  /* static member */
  inline def findUriSchemeHandlersAsync(scheme: String, launchQuerySupportType: typings.winrtUwp.Windows.System.LaunchQuerySupportType): IPromiseWithIAsyncOperation[IVectorView[AppInfo]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findUriSchemeHandlersAsync")(scheme.asInstanceOf[js.Any], launchQuerySupportType.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[AppInfo]]]
  
  /**
    * Starts the default app associated with the specified file.
    * @param file The file.
    * @return The launch operation.
    */
  /* static member */
  inline def launchFileAsync(file: IStorageFile): IPromiseWithIAsyncOperation[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("launchFileAsync")(file.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
  /**
    * Starts the default app associated with the specified file, using the specified options.
    * @param file The file.
    * @param options The launch options for the app.
    * @return The launch operation.
    */
  /* static member */
  inline def launchFileAsync(file: IStorageFile, options: typings.winrtUwp.Windows.System.LauncherOptions): IPromiseWithIAsyncOperation[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("launchFileAsync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
  
  /**
    * Launches File Explorer and displays the contents of the specified folder.
    * @param folder The folder to display in File Explorer.
    * @return The result of the operation.
    */
  /* static member */
  inline def launchFolderAsync(folder: IStorageFolder): IPromiseWithIAsyncOperation[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("launchFolderAsync")(folder.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
  /**
    * Launches File Explorer with the specified options and displays the contents of the specified folder.
    * @param folder The folder to display in File Explorer.
    * @param options Options that specify the amount of screen space that File Explorer fills, and the list of items to select in the specified folder.
    * @return The result of the operation.
    */
  /* static member */
  inline def launchFolderAsync(folder: IStorageFolder, options: typings.winrtUwp.Windows.System.FolderLauncherOptions): IPromiseWithIAsyncOperation[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("launchFolderAsync")(folder.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
  
  /**
    * Starts the default app associated with the URI scheme name for the specified URI.
    * @param uri The URI.
    * @return The launch operation.
    */
  /* static member */
  inline def launchUriAsync(uri: Uri): IPromiseWithIAsyncOperation[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("launchUriAsync")(uri.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
  /**
    * Starts the default app associated with the URI scheme name or the one specified by the ContentType for the specified URI, using the specified options.
    * @param uri The URI.
    * @param options The launch options for the app.
    * @return The launch operation.
    */
  /* static member */
  inline def launchUriAsync(uri: Uri, options: typings.winrtUwp.Windows.System.LauncherOptions): IPromiseWithIAsyncOperation[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("launchUriAsync")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
  /**
    * Starts the default app associated with the URI scheme name for the specified URI, using the specified options and input data.
    * @param uri The URI.
    * @param options The launch options for the app.
    * @param inputData The input data for the app.
    * @return The launch operation.
    */
  /* static member */
  inline def launchUriAsync(uri: Uri, options: typings.winrtUwp.Windows.System.LauncherOptions, inputData: ValueSet): IPromiseWithIAsyncOperation[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("launchUriAsync")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], inputData.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[Boolean]]
  
  /**
    * Asynchronously starts the default app associated with the URI scheme name for the specified URI, using the specified options.
    * @param uri The Uri to launch.
    * @param options The launch options.
    * @return When this method completes, it returns the results of the launch.
    */
  /* static member */
  inline def launchUriForResultsAsync(uri: Uri, options: typings.winrtUwp.Windows.System.LauncherOptions): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.LaunchUriResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("launchUriForResultsAsync")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.LaunchUriResult]]
  /**
    * Asynchronously starts the default app associated with the URI scheme name for the specified URI, using the specified options and input data.
    * @param uri The Uri to launch.
    * @param options The launch options.
    * @param inputData The data to send to the launched app.
    * @return When this method completes, it returns the results of the launch.
    */
  /* static member */
  inline def launchUriForResultsAsync(uri: Uri, options: typings.winrtUwp.Windows.System.LauncherOptions, inputData: ValueSet): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.LaunchUriResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("launchUriForResultsAsync")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any], inputData.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.LaunchUriResult]]
  
  /**
    * Asynchronously query whether an app can be activated for the specified file.
    * @param file The file for which to query support.
    * @return A value that indicates whether an application can be activated for the file.
    */
  /* static member */
  inline def queryFileSupportAsync(file: StorageFile): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.LaunchQuerySupportStatus] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryFileSupportAsync")(file.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.LaunchQuerySupportStatus]]
  /**
    * Asynchronously query whether an app with the specified package name can be activated for the specified file.
    * @param file The file for which to query support.
    * @param packageFamilyName The package for which to query support.
    * @return A value that indicates whether an application can be activated for the file.
    */
  /* static member */
  inline def queryFileSupportAsync(file: StorageFile, packageFamilyName: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.LaunchQuerySupportStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("queryFileSupportAsync")(file.asInstanceOf[js.Any], packageFamilyName.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.LaunchQuerySupportStatus]]
  
  /**
    * Asynchronously query whether an app can be activated for the specified URI and launch type.
    * @param uri The URI for which to query support.
    * @param launchQuerySupportType The type of launch for which to query support.
    * @return A value that indicates whether an application is available to launch the URI.
    */
  /* static member */
  inline def queryUriSupportAsync(uri: Uri, launchQuerySupportType: typings.winrtUwp.Windows.System.LaunchQuerySupportType): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.LaunchQuerySupportStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("queryUriSupportAsync")(uri.asInstanceOf[js.Any], launchQuerySupportType.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.LaunchQuerySupportStatus]]
  /**
    * Asynchronously query whether an app can be activated for the specified URI, launch type, and package name.
    * @param uri The URI for which to query support.
    * @param launchQuerySupportType The type of launch for which to query support.
    * @param packageFamilyName Specifies a specific package that will be used to launch this URI.
    * @return A value that indicates whether the application is available to launch the URI.
    */
  /* static member */
  inline def queryUriSupportAsync(
    uri: Uri,
    launchQuerySupportType: typings.winrtUwp.Windows.System.LaunchQuerySupportType,
    packageFamilyName: String
  ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.LaunchQuerySupportStatus] = (^.asInstanceOf[js.Dynamic].applyDynamic("queryUriSupportAsync")(uri.asInstanceOf[js.Any], launchQuerySupportType.asInstanceOf[js.Any], packageFamilyName.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.System.LaunchQuerySupportStatus]]
}
