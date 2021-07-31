package typings.winrt.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPaneQuerySubmittedEventArgs
  extends StObject
     with ISearchPaneQuerySubmittedEventArgs
object SearchPaneQuerySubmittedEventArgs {
  
  @scala.inline
  def apply(language: String, queryText: String): SearchPaneQuerySubmittedEventArgs = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPaneQuerySubmittedEventArgs]
  }
}
