package typings.winrt.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchActivatedEventArgs
  extends StObject
     with IActivatedEventArgs {
  
  var language: String
  
  var queryText: String
}
object ISearchActivatedEventArgs {
  
  @scala.inline
  def apply(
    kind: ActivationKind,
    language: String,
    previousExecutionState: ApplicationExecutionState,
    queryText: String,
    splashScreen: SplashScreen
  ): ISearchActivatedEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchActivatedEventArgs]
  }
  
  @scala.inline
  implicit class ISearchActivatedEventArgsMutableBuilder[Self <: ISearchActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryText(value: String): Self = StObject.set(x, "queryText", value.asInstanceOf[js.Any])
  }
}
