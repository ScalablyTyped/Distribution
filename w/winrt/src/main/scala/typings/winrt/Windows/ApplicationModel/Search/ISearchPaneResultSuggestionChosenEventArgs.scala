package typings.winrt.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchPaneResultSuggestionChosenEventArgs extends StObject {
  
  var tag: String
}
object ISearchPaneResultSuggestionChosenEventArgs {
  
  @scala.inline
  def apply(tag: String): ISearchPaneResultSuggestionChosenEventArgs = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPaneResultSuggestionChosenEventArgs]
  }
  
  @scala.inline
  implicit class ISearchPaneResultSuggestionChosenEventArgsMutableBuilder[Self <: ISearchPaneResultSuggestionChosenEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
