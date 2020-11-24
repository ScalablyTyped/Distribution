package typings.winrtUwp.Windows.ApplicationModel.Search

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a collection of search suggestions to be displayed in the search pane in response to a suggestionsrequested event. */
@js.native
trait SearchSuggestionCollection extends js.Object {
  
  /**
    * Appends a query suggestion to the list of search suggestions for the search pane.
    * @param text The text of the query suggestion.
    */
  def appendQuerySuggestion(text: String): Unit = js.native
  
  /**
    * Appends a list of query suggestions to the list of search suggestions for the search pane.
    * @param suggestions The list of query suggestions.
    */
  def appendQuerySuggestions(suggestions: IIterable[String]): Unit = js.native
  
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
  ): Unit = js.native
  
  /**
    * Appends a text label that is used to separate groups of suggestions in the search pane.
    * @param label The text to use as a separator. This text should be descriptive of any suggestions that are appended after it.
    */
  def appendSearchSeparator(label: String): Unit = js.native
  
  /** The number of suggestions in the collection. */
  var size: Double = js.native
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
  
  @scala.inline
  implicit class SearchSuggestionCollectionOps[Self <: SearchSuggestionCollection] (val x: Self) extends AnyVal {
    
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
    def setAppendQuerySuggestion(value: String => Unit): Self = this.set("appendQuerySuggestion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAppendQuerySuggestions(value: IIterable[String] => Unit): Self = this.set("appendQuerySuggestions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAppendResultSuggestion(value: (String, String, String, IRandomAccessStreamReference, String) => Unit): Self = this.set("appendResultSuggestion", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAppendSearchSeparator(value: String => Unit): Self = this.set("appendSearchSeparator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
