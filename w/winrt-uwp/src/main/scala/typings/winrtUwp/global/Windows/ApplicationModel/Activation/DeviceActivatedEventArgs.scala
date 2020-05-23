package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information for a device that invokes AutoPlay. */
@JSGlobal("Windows.ApplicationModel.Activation.DeviceActivatedEventArgs")
@js.native
abstract class DeviceActivatedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Activation.DeviceActivatedEventArgs {
  /** Gets the identifier for the currently shown app view. */
  /* CompleteClass */
  override var currentlyShownApplicationViewId: Double = js.native
  /** Gets the device identifier for the device that invoked AutoPlay. */
  /* CompleteClass */
  override var deviceInformationId: String = js.native
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  /** Gets the action associated with the activated device. */
  /* CompleteClass */
  override var verb: String = js.native
  /** Gets the view switcher object that allows you to set the view for the application. */
  /* CompleteClass */
  override var viewSwitcher: ActivationViewSwitcher = js.native
}

