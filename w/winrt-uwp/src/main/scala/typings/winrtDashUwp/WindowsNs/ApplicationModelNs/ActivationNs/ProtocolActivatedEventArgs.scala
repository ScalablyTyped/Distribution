package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.ValueSet
import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.ActivationViewSwitcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated because it is the app associated with a URI scheme name. */
@JSGlobal("Windows.ApplicationModel.Activation.ProtocolActivatedEventArgs")
@js.native
abstract class ProtocolActivatedEventArgs () extends js.Object {
  /** Gets the package family name of the application that activated the current application. */
  var callerPackageFamilyName: String = js.native
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double = js.native
  /** Data received from the application that activated the current application. */
  var data: ValueSet = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the Uniform Resource Identifier (URI) for which the app was activated. */
  var uri: Uri = js.native
  /** Gets the view switcher object that allows you to set the view for the application. */
  var viewSwitcher: ActivationViewSwitcher = js.native
}

