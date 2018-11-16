package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.SearchNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables access to the search suggestions that the SearchSuggestionManager provides. */
@JSGlobal("Windows.ApplicationModel.Search.Core.SearchSuggestion")
@js.native
abstract class SearchSuggestion () extends js.Object {
  /** Gets the value that was passed to the detailText parameter of the AppendResultSuggestion method. */
  var detailText: java.lang.String = js.native
  /** Gets the value that was passed to the image parameter of the AppendResultSuggestion method. */
  var image: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /** Gets the value that was passed to the imageAlternateText parameter of the AppendResultSuggestion method. */
  var imageAlternateText: java.lang.String = js.native
  /** Gets the type of suggestion. */
  var kind: SearchSuggestionKind = js.native
  /** Gets the value that was passed to the tag parameter of the AppendResultSuggestion method. */
  var tag: java.lang.String = js.native
  /** Gets the localized text of the suggestion for display in the search suggestions UI. */
  var text: java.lang.String = js.native
}

