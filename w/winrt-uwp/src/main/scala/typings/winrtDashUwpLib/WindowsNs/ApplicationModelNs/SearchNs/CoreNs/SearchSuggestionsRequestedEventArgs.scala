package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.SearchNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the SuggestionsRequested event. */
@JSGlobal("Windows.ApplicationModel.Search.Core.SearchSuggestionsRequestedEventArgs")
@js.native
abstract class SearchSuggestionsRequestedEventArgs () extends js.Object {
  /** Gets the Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
  var language: java.lang.String = js.native
  /** Gets an object that provides linguistic information about query text that the user is entering through an Input Method Editor (IME). */
  var linguisticDetails: winrtDashUwpLib.WindowsNs.ApplicationModelNs.SearchNs.SearchQueryLinguisticDetails = js.native
  /** The text that the app should provide suggestions for and that was in the search box when the SuggestionsRequested event was raised. */
  var queryText: java.lang.String = js.native
  /** Gets an object that stores suggestions and information about the request. */
  var request: winrtDashUwpLib.WindowsNs.ApplicationModelNs.SearchNs.SearchSuggestionsRequest = js.native
}

