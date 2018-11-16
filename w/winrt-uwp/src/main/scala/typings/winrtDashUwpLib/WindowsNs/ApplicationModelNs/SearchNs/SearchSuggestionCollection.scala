package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of search suggestions to be displayed in the search pane in response to a suggestionsrequested event. */
@JSGlobal("Windows.ApplicationModel.Search.SearchSuggestionCollection")
@js.native
abstract class SearchSuggestionCollection () extends js.Object {
  /** The number of suggestions in the collection. */
  var size: scala.Double = js.native
  /**
                   * Appends a query suggestion to the list of search suggestions for the search pane.
                   * @param text The text of the query suggestion.
                   */
  def appendQuerySuggestion(text: java.lang.String): scala.Unit = js.native
  /**
                   * Appends a list of query suggestions to the list of search suggestions for the search pane.
                   * @param suggestions The list of query suggestions.
                   */
  def appendQuerySuggestions(suggestions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]): scala.Unit = js.native
  /**
                   * Appends a suggested search result to the list of suggestions to display in the search pane.
                   * @param text The text of the suggested result.
                   * @param detailText The detail text for the suggested result.
                   * @param tag The unique tag that identifies this suggested result.
                   * @param image The image to accompany the results suggestion.
                   * @param imageAlternateText The alternate text for the image.
                   */
  def appendResultSuggestion(
    text: java.lang.String,
    detailText: java.lang.String,
    tag: java.lang.String,
    image: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference,
    imageAlternateText: java.lang.String
  ): scala.Unit = js.native
  /**
                   * Appends a text label that is used to separate groups of suggestions in the search pane.
                   * @param label The text to use as a separator. This text should be descriptive of any suggestions that are appended after it.
                   */
  def appendSearchSeparator(label: java.lang.String): scala.Unit = js.native
}

