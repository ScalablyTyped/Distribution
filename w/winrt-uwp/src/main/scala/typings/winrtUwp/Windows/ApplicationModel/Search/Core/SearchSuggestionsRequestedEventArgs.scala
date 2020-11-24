package typings.winrtUwp.Windows.ApplicationModel.Search.Core

import typings.winrtUwp.Windows.ApplicationModel.Search.SearchQueryLinguisticDetails
import typings.winrtUwp.Windows.ApplicationModel.Search.SearchSuggestionsRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the SuggestionsRequested event. */
@js.native
trait SearchSuggestionsRequestedEventArgs extends js.Object {
  
  /** Gets the Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
  var language: String = js.native
  
  /** Gets an object that provides linguistic information about query text that the user is entering through an Input Method Editor (IME). */
  var linguisticDetails: SearchQueryLinguisticDetails = js.native
  
  /** The text that the app should provide suggestions for and that was in the search box when the SuggestionsRequested event was raised. */
  var queryText: String = js.native
  
  /** Gets an object that stores suggestions and information about the request. */
  var request: SearchSuggestionsRequest = js.native
}
object SearchSuggestionsRequestedEventArgs {
  
  @scala.inline
  def apply(
    language: String,
    linguisticDetails: SearchQueryLinguisticDetails,
    queryText: String,
    request: SearchSuggestionsRequest
  ): SearchSuggestionsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], linguisticDetails = linguisticDetails.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSuggestionsRequestedEventArgs]
  }
  
  @scala.inline
  implicit class SearchSuggestionsRequestedEventArgsOps[Self <: SearchSuggestionsRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinguisticDetails(value: SearchQueryLinguisticDetails): Self = this.set("linguisticDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryText(value: String): Self = this.set("queryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: SearchSuggestionsRequest): Self = this.set("request", value.asInstanceOf[js.Any])
  }
}
