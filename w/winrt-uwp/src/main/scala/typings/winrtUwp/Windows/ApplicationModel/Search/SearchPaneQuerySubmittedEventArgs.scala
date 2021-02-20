package typings.winrtUwp.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a querysubmitted event that is associated with a searchPane instance. */
@js.native
trait SearchPaneQuerySubmittedEventArgs extends StObject {
  
  /** The Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
  var language: String = js.native
  
  /** An object that provides linguistic information about query text that the user is entering through an Input Method Editor (IME). */
  var linguisticDetails: SearchPaneQueryLinguisticDetails = js.native
  
  /** The text that was submitted through the search pane. */
  var queryText: String = js.native
}
object SearchPaneQuerySubmittedEventArgs {
  
  @scala.inline
  def apply(language: String, linguisticDetails: SearchPaneQueryLinguisticDetails, queryText: String): SearchPaneQuerySubmittedEventArgs = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], linguisticDetails = linguisticDetails.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPaneQuerySubmittedEventArgs]
  }
  
  @scala.inline
  implicit class SearchPaneQuerySubmittedEventArgsMutableBuilder[Self <: SearchPaneQuerySubmittedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinguisticDetails(value: SearchPaneQueryLinguisticDetails): Self = StObject.set(x, "linguisticDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryText(value: String): Self = StObject.set(x, "queryText", value.asInstanceOf[js.Any])
  }
}
