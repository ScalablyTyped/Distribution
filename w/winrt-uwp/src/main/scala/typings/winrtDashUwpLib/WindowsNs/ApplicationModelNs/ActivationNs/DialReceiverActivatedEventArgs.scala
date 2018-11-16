package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated from another app by using the DIAL protocol. */
@JSGlobal("Windows.ApplicationModel.Activation.DialReceiverActivatedEventArgs")
@js.native
abstract class DialReceiverActivatedEventArgs () extends js.Object {
  /** Gets the name of the app that invoked the dial receiver app. */
  var appName: java.lang.String = js.native
  /** Gets the arguments passed by the calling app. */
  var arguments: java.lang.String = js.native
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: scala.Double = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the unique tile identifier for the calling app. */
  var tileId: java.lang.String = js.native
  /** Gets the view switcher object that allows you to set the view for the application. */
  var viewSwitcher: winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.ActivationViewSwitcher = js.native
}

