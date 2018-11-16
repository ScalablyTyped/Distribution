package typings
package winrtDashUwpLib.WindowsNs.UINs.WebUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the activation arguments when an app is launched via LaunchUriForResultsAsync . */
@JSGlobal("Windows.UI.WebUI.WebUIProtocolForResultsActivatedEventArgs")
@js.native
abstract class WebUIProtocolForResultsActivatedEventArgs () extends js.Object {
  /** Gets the app activation operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the family name of the caller's package. */
  var callerPackageFamilyName: java.lang.String = js.native
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: scala.Double = js.native
  /** Gets the data associated with the activation. */
  var data: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet = js.native
  /** Gets the kind of activation. */
  var kind: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ActivationKind = js.native
  /** Gets the previous execution state. */
  var previousExecutionState: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.ApplicationExecutionState = js.native
  /** Gets info about the protocol for results operation that triggered the activation. */
  var protocolForResultsOperation: winrtDashUwpLib.WindowsNs.SystemNs.ProtocolForResultsOperation = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.SplashScreen = js.native
  /** Gets the Uniform Resource Identifier (URI) for which the app was activated. */
  var uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
}

