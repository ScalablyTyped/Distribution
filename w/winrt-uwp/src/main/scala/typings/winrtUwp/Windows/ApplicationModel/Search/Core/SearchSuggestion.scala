package typings.winrtUwp.Windows.ApplicationModel.Search.Core

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables access to the search suggestions that the SearchSuggestionManager provides. */
trait SearchSuggestion extends js.Object {
  /** Gets the value that was passed to the detailText parameter of the AppendResultSuggestion method. */
  var detailText: String
  /** Gets the value that was passed to the image parameter of the AppendResultSuggestion method. */
  var image: IRandomAccessStreamReference
  /** Gets the value that was passed to the imageAlternateText parameter of the AppendResultSuggestion method. */
  var imageAlternateText: String
  /** Gets the type of suggestion. */
  var kind: SearchSuggestionKind
  /** Gets the value that was passed to the tag parameter of the AppendResultSuggestion method. */
  var tag: String
  /** Gets the localized text of the suggestion for display in the search suggestions UI. */
  var text: String
}

object SearchSuggestion {
  @scala.inline
  def apply(
    detailText: String,
    image: IRandomAccessStreamReference,
    imageAlternateText: String,
    kind: SearchSuggestionKind,
    tag: String,
    text: String
  ): SearchSuggestion = {
    val __obj = js.Dynamic.literal(detailText = detailText.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imageAlternateText = imageAlternateText.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSuggestion]
  }
}

