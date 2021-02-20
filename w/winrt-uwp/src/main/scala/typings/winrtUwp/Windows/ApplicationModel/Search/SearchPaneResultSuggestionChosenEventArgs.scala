package typings.winrtUwp.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a resultsuggestionchosen event that is associated with a searchPane object. */
@js.native
trait SearchPaneResultSuggestionChosenEventArgs extends StObject {
  
  /** The tag for the suggested result that the user selected. */
  var tag: String = js.native
}
object SearchPaneResultSuggestionChosenEventArgs {
  
  @scala.inline
  def apply(tag: String): SearchPaneResultSuggestionChosenEventArgs = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPaneResultSuggestionChosenEventArgs]
  }
  
  @scala.inline
  implicit class SearchPaneResultSuggestionChosenEventArgsMutableBuilder[Self <: SearchPaneResultSuggestionChosenEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
