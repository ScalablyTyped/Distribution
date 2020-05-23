package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.System.ProtocolForResultsOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the activation arguments when an app is launched via LaunchUriForResultsAsync . */
@JSGlobal("Windows.UI.WebUI.WebUIProtocolForResultsActivatedEventArgs")
@js.native
abstract class WebUIProtocolForResultsActivatedEventArgs ()
  extends typings.winrtUwp.Windows.UI.WebUI.WebUIProtocolForResultsActivatedEventArgs {
  /** Gets the app activation operation. */
  /* CompleteClass */
  override var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  /** Gets the family name of the caller's package. */
  /* CompleteClass */
  override var callerPackageFamilyName: String = js.native
  /** Gets the identifier for the currently shown app view. */
  /* CompleteClass */
  override var currentlyShownApplicationViewId: Double = js.native
  /** Gets the data associated with the activation. */
  /* CompleteClass */
  override var data: ValueSet = js.native
  /** Gets the kind of activation. */
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /** Gets the previous execution state. */
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets info about the protocol for results operation that triggered the activation. */
  /* CompleteClass */
  override var protocolForResultsOperation: ProtocolForResultsOperation = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
  /** Gets the Uniform Resource Identifier (URI) for which the app was activated. */
  /* CompleteClass */
  override var uri: Uri = js.native
}

