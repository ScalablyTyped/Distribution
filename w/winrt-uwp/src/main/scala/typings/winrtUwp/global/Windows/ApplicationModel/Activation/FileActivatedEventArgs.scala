package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Storage.IStorageItem
import typings.winrtUwp.Windows.Storage.Search.StorageFileQueryResult
import typings.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated because it is the app associated with a file. */
@JSGlobal("Windows.ApplicationModel.Activation.FileActivatedEventArgs")
@js.native
abstract class FileActivatedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Activation.FileActivatedEventArgs {
  /** The package family name of the app that launched your app. */
  /* CompleteClass */
  override var callerPackageFamilyName: String = js.native
  /** Gets the identifier for the currently shown app view. */
  /* CompleteClass */
  override var currentlyShownApplicationViewId: Double = js.native
  /** Gets the files for which the app was activated. */
  /* CompleteClass */
  override var files: IVectorView[IStorageItem] = js.native
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  /** Gets the neighboring files of the files for which the app was activated. */
  /* CompleteClass */
  override var neighboringFilesQuery: StorageFileQueryResult = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  /** Gets the action associated with the activated file. */
  /* CompleteClass */
  override var verb: String = js.native
  /** Provides the object that allows you to set the view for the application. */
  /* CompleteClass */
  override var viewSwitcher: ActivationViewSwitcher = js.native
}

