package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails
import typings.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the activated event that fires when the user searches the app from the Search charm and the app isn't the main app on screen. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Activation.SearchActivatedEventArgs")
@js.native
open class SearchActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Activation.SearchActivatedEventArgs {
  
  /** Gets the identifier for the currently shown app view. */
  /* CompleteClass */
  var currentlyShownApplicationViewId: Double = js.native
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  
  /** Gets the Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
  /* CompleteClass */
  var language: String = js.native
  
  /** Gets a SearchPaneQueryLinguisticDetails object that provides info about query text that the user enters through an Input Method Editor (IME). */
  /* CompleteClass */
  var linguisticDetails: SearchPaneQueryLinguisticDetails = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  
  /** Gets the text that the user wants the app to search for. The user entered this text into the search box of the search pane. */
  /* CompleteClass */
  var queryText: String = js.native
  
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  
  /** Gets the view switcher object that allows you to set the view for the application. */
  /* CompleteClass */
  var viewSwitcher: ActivationViewSwitcher = js.native
}
