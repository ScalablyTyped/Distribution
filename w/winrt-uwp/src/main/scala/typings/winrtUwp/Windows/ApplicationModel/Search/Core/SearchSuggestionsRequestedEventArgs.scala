package typings.winrtUwp.Windows.ApplicationModel.Search.Core

import typings.winrtUwp.Windows.ApplicationModel.Search.SearchQueryLinguisticDetails
import typings.winrtUwp.Windows.ApplicationModel.Search.SearchSuggestionsRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the SuggestionsRequested event. */
trait SearchSuggestionsRequestedEventArgs extends js.Object {
  /** Gets the Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
  var language: String
  /** Gets an object that provides linguistic information about query text that the user is entering through an Input Method Editor (IME). */
  var linguisticDetails: SearchQueryLinguisticDetails
  /** The text that the app should provide suggestions for and that was in the search box when the SuggestionsRequested event was raised. */
  var queryText: String
  /** Gets an object that stores suggestions and information about the request. */
  var request: SearchSuggestionsRequest
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
}

