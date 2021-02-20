package typings.winrt.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISearchPaneQuerySubmittedEventArgs extends StObject {
  
  var language: String = js.native
  
  var queryText: String = js.native
}
object ISearchPaneQuerySubmittedEventArgs {
  
  @scala.inline
  def apply(language: String, queryText: String): ISearchPaneQuerySubmittedEventArgs = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPaneQuerySubmittedEventArgs]
  }
  
  @scala.inline
  implicit class ISearchPaneQuerySubmittedEventArgsMutableBuilder[Self <: ISearchPaneQuerySubmittedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryText(value: String): Self = StObject.set(x, "queryText", value.asInstanceOf[js.Any])
  }
}
