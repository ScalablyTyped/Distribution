package typings.winrtUwp.Windows.ApplicationModel.Search

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of search suggestions to be displayed in the search pane in response to a suggestionsrequested event. */
trait SearchSuggestionCollection extends js.Object {
  /** The number of suggestions in the collection. */
  var size: Double
  /**
    * Appends a query suggestion to the list of search suggestions for the search pane.
    * @param text The text of the query suggestion.
    */
  def appendQuerySuggestion(text: String): Unit
  /**
    * Appends a list of query suggestions to the list of search suggestions for the search pane.
    * @param suggestions The list of query suggestions.
    */
  def appendQuerySuggestions(suggestions: IIterable[String]): Unit
  /**
    * Appends a suggested search result to the list of suggestions to display in the search pane.
    * @param text The text of the suggested result.
    * @param detailText The detail text for the suggested result.
    * @param tag The unique tag that identifies this suggested result.
    * @param image The image to accompany the results suggestion.
    * @param imageAlternateText The alternate text for the image.
    */
  def appendResultSuggestion(
    text: String,
    detailText: String,
    tag: String,
    image: IRandomAccessStreamReference,
    imageAlternateText: String
  ): Unit
  /**
    * Appends a text label that is used to separate groups of suggestions in the search pane.
    * @param label The text to use as a separator. This text should be descriptive of any suggestions that are appended after it.
    */
  def appendSearchSeparator(label: String): Unit
}

object SearchSuggestionCollection {
  @scala.inline
  def apply(
    appendQuerySuggestion: String => Unit,
    appendQuerySuggestions: IIterable[String] => Unit,
    appendResultSuggestion: (String, String, String, IRandomAccessStreamReference, String) => Unit,
    appendSearchSeparator: String => Unit,
    size: Double
  ): SearchSuggestionCollection = {
    val __obj = js.Dynamic.literal(appendQuerySuggestion = js.Any.fromFunction1(appendQuerySuggestion), appendQuerySuggestions = js.Any.fromFunction1(appendQuerySuggestions), appendResultSuggestion = js.Any.fromFunction5(appendResultSuggestion), appendSearchSeparator = js.Any.fromFunction1(appendSearchSeparator), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSuggestionCollection]
  }
}

