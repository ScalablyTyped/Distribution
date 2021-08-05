package typings.winrtUwp.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a resultsuggestionchosen event that is associated with a searchPane object. */
trait SearchPaneResultSuggestionChosenEventArgs extends StObject {
  
  /** The tag for the suggested result that the user selected. */
  var tag: String
}
object SearchPaneResultSuggestionChosenEventArgs {
  
  inline def apply(tag: String): SearchPaneResultSuggestionChosenEventArgs = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPaneResultSuggestionChosenEventArgs]
  }
  
  extension [Self <: SearchPaneResultSuggestionChosenEventArgs](x: Self) {
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
