package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated because it is the app associated with a file. */
@JSGlobal("Windows.ApplicationModel.Activation.FileActivatedEventArgs")
@js.native
abstract class FileActivatedEventArgs () extends js.Object {
  /** The package family name of the app that launched your app. */
  var callerPackageFamilyName: java.lang.String = js.native
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: scala.Double = js.native
  /** Gets the files for which the app was activated. */
  var files: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem] = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the neighboring files of the files for which the app was activated. */
  var neighboringFilesQuery: winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.StorageFileQueryResult = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the action associated with the activated file. */
  var verb: java.lang.String = js.native
  /** Provides the object that allows you to set the view for the application. */
  var viewSwitcher: winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ActivationViewSwitcher = js.native
}

