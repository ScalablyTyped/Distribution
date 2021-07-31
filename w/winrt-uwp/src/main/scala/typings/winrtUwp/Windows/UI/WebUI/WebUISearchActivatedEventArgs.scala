package typings.winrtUwp.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the activated event that fires when the user searches the app from the Search charm and the app isn't the main app on screen. */
trait WebUISearchActivatedEventArgs extends StObject {
  
  /** Gets the app activated operation. */
  var activatedOperation: ActivatedOperation
  
  /** Gets the identifier for the currently shown app view. */
  var currentlyShownApplicationViewId: Double
  
  /** Gets the activation type. */
  var kind: ActivationKind
  
  /** Gets the Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
  var language: String
  
  /** Gets a SearchPaneQueryLinguisticDetails object that provides info about query text that the user enters through an Input Method Editor (IME). */
  var linguisticDetails: SearchPaneQueryLinguisticDetails
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  
  /** Gets the text that the user wants the app to search for. The user entered this text into the search box of the search pane. */
  var queryText: String
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
}
object WebUISearchActivatedEventArgs {
  
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    currentlyShownApplicationViewId: Double,
    kind: ActivationKind,
    language: String,
    linguisticDetails: SearchPaneQueryLinguisticDetails,
    previousExecutionState: ApplicationExecutionState,
    queryText: String,
    splashScreen: SplashScreen
  ): WebUISearchActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], currentlyShownApplicationViewId = currentlyShownApplicationViewId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], linguisticDetails = linguisticDetails.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUISearchActivatedEventArgs]
  }
  
  @scala.inline
  implicit class WebUISearchActivatedEventArgsMutableBuilder[Self <: WebUISearchActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivatedOperation(value: ActivatedOperation): Self = StObject.set(x, "activatedOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentlyShownApplicationViewId(value: Double): Self = StObject.set(x, "currentlyShownApplicationViewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinguisticDetails(value: SearchPaneQueryLinguisticDetails): Self = StObject.set(x, "linguisticDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryText(value: String): Self = StObject.set(x, "queryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
  }
}
