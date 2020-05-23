package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.System.ProtocolForResultsOperation
import typings.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Received by an application when it is launched by another application with the expectation that it will return results back to the caller. */
@JSGlobal("Windows.ApplicationModel.Activation.ProtocolForResultsActivatedEventArgs")
@js.native
abstract class ProtocolForResultsActivatedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Activation.ProtocolForResultsActivatedEventArgs {
  /** Gets the package family name of the application that activated the current application. */
  /* CompleteClass */
  override var callerPackageFamilyName: String = js.native
  /** Gets the identifier for the currently shown app view. */
  /* CompleteClass */
  override var currentlyShownApplicationViewId: Double = js.native
  /** Data received from the application that activated the current application. */
  /* CompleteClass */
  override var data: ValueSet = js.native
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  /** Gets the ProtocolForResultsOperation that you use to signal that your app is ready to return to the app that launched it for results. */
  /* CompleteClass */
  override var protocolForResultsOperation: ProtocolForResultsOperation = js.native
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  /** Gets the Uniform Resource Identifier (URI) used to activate the app. */
  /* CompleteClass */
  override var uri: Uri = js.native
  /** Gets the view switcher object that allows you to set the view for the application. */
  /* CompleteClass */
  override var viewSwitcher: ActivationViewSwitcher = js.native
}

