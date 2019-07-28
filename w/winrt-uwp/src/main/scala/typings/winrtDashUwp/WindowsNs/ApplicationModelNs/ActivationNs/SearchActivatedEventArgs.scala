package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs

import typings.winrtDashUwp.WindowsNs.ApplicationModelNs.SearchNs.SearchPaneQueryLinguisticDetails
import typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.ActivationViewSwitcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the activated event that fires when the user searches the app from the Search charm and the app isn't the main app on screen. */
@JSGlobal("Windows.ApplicationModel.Activation.SearchActivatedEventArgs")
@js.native
abstract class SearchActivatedEventArgs () extends js.Object {
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
  var language: String = js.native
  /** Gets a SearchPaneQueryLinguisticDetails object that provides info about query text that the user enters through an Input Method Editor (IME). */
  var linguisticDetails: SearchPaneQueryLinguisticDetails = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the text that the user wants the app to search for. The user entered this text into the search box of the search pane. */
  var queryText: String = js.native
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the view switcher object that allows you to set the view for the application. */
  var viewSwitcher: ActivationViewSwitcher = js.native
}

