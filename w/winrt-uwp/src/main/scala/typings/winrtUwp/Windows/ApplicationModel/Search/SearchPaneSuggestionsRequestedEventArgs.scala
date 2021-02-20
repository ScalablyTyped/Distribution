package typings.winrtUwp.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a suggestionsrequested event that is associated with a searchPane object. */
@js.native
trait SearchPaneSuggestionsRequestedEventArgs extends StObject {
  
  /** The Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
  var language: String = js.native
  
  /** An object that provides linguistic information about query text that the user is entering through an Input Method Editor (IME). */
  var linguisticDetails: SearchPaneQueryLinguisticDetails = js.native
  
  /** The text that the app should provide suggestions for and that was in the search box when the suggestionsrequested event fired. */
  var queryText: String = js.native
  
  /** An object that stores suggestions and information about the request. */
  var request: SearchPaneSuggestionsRequest = js.native
}
object SearchPaneSuggestionsRequestedEventArgs {
  
  @scala.inline
  def apply(
    language: String,
    linguisticDetails: SearchPaneQueryLinguisticDetails,
    queryText: String,
    request: SearchPaneSuggestionsRequest
  ): SearchPaneSuggestionsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], linguisticDetails = linguisticDetails.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPaneSuggestionsRequestedEventArgs]
  }
  
  @scala.inline
  implicit class SearchPaneSuggestionsRequestedEventArgsMutableBuilder[Self <: SearchPaneSuggestionsRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinguisticDetails(value: SearchPaneQueryLinguisticDetails): Self = StObject.set(x, "linguisticDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryText(value: String): Self = StObject.set(x, "queryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: SearchPaneSuggestionsRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
