package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated because it is the app associated with a URI scheme name. */
@JSGlobal("Windows.ApplicationModel.Activation.ProtocolActivatedEventArgs")
@js.native
abstract class ProtocolActivatedEventArgs () extends js.Object {
  /** Gets the package family name of the application that activated the current application. */
  var callerPackageFamilyName: java.lang.String = js.native
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: scala.Double = js.native
  /** Data received from the application that activated the current application. */
  var data: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the Uniform Resource Identifier (URI) for which the app was activated. */
  var uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Gets the view switcher object that allows you to set the view for the application. */
  var viewSwitcher: winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ActivationViewSwitcher = js.native
}

