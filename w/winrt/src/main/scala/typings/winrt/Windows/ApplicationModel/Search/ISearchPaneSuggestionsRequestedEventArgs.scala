package typings.winrt.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchPaneSuggestionsRequestedEventArgs
  extends StObject
     with ISearchPaneQueryChangedEventArgs {
  
  var request: SearchPaneSuggestionsRequest
}
object ISearchPaneSuggestionsRequestedEventArgs {
  
  inline def apply(
    language: String,
    linguisticDetails: SearchPaneQueryLinguisticDetails,
    queryText: String,
    request: SearchPaneSuggestionsRequest
  ): ISearchPaneSuggestionsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], linguisticDetails = linguisticDetails.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPaneSuggestionsRequestedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISearchPaneSuggestionsRequestedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setRequest(value: SearchPaneSuggestionsRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
