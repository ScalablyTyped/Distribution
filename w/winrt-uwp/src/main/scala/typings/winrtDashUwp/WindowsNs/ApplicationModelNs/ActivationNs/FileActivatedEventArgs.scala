package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.StorageNs.IStorageItem
import typings.winrtDashUwp.WindowsNs.StorageNs.SearchNs.StorageFileQueryResult
import typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.ActivationViewSwitcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated because it is the app associated with a file. */
@JSGlobal("Windows.ApplicationModel.Activation.FileActivatedEventArgs")
@js.native
abstract class FileActivatedEventArgs () extends js.Object {
  /** The package family name of the app that launched your app. */
  var callerPackageFamilyName: String = js.native
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double = js.native
  /** Gets the files for which the app was activated. */
  var files: IVectorView[IStorageItem] = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the neighboring files of the files for which the app was activated. */
  var neighboringFilesQuery: StorageFileQueryResult = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the action associated with the activated file. */
  var verb: String = js.native
  /** Provides the object that allows you to set the view for the application. */
  var viewSwitcher: ActivationViewSwitcher = js.native
}

