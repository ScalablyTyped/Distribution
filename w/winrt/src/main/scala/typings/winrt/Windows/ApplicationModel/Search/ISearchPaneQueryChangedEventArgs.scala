package typings.winrt.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchPaneQueryChangedEventArgs extends StObject {
  
  var language: String
  
  var linguisticDetails: SearchPaneQueryLinguisticDetails
  
  var queryText: String
}
object ISearchPaneQueryChangedEventArgs {
  
  inline def apply(language: String, linguisticDetails: SearchPaneQueryLinguisticDetails, queryText: String): ISearchPaneQueryChangedEventArgs = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], linguisticDetails = linguisticDetails.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPaneQueryChangedEventArgs]
  }
  
  extension [Self <: ISearchPaneQueryChangedEventArgs](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLinguisticDetails(value: SearchPaneQueryLinguisticDetails): Self = StObject.set(x, "linguisticDetails", value.asInstanceOf[js.Any])
    
    inline def setQueryText(value: String): Self = StObject.set(x, "queryText", value.asInstanceOf[js.Any])
  }
}
