package typings.winrt.WindowsNs.ApplicationModelNs.SearchNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchSuggestionCollection extends js.Object {
  var size: Double
  def appendQuerySuggestion(text: String): Unit
  def appendQuerySuggestions(suggestions: IIterable[String]): Unit
  def appendResultSuggestion(
    text: String,
    detailText: String,
    tag: String,
    image: IRandomAccessStreamReference,
    imageAlternateText: String
  ): Unit
  def appendSearchSeparator(label: String): Unit
}

object ISearchSuggestionCollection {
  @scala.inline
  def apply(
    appendQuerySuggestion: String => Unit,
    appendQuerySuggestions: IIterable[String] => Unit,
    appendResultSuggestion: (String, String, String, IRandomAccessStreamReference, String) => Unit,
    appendSearchSeparator: String => Unit,
    size: Double
  ): ISearchSuggestionCollection = {
    val __obj = js.Dynamic.literal(appendQuerySuggestion = js.Any.fromFunction1(appendQuerySuggestion), appendQuerySuggestions = js.Any.fromFunction1(appendQuerySuggestions), appendResultSuggestion = js.Any.fromFunction5(appendResultSuggestion), appendSearchSeparator = js.Any.fromFunction1(appendSearchSeparator), size = size)
  
    __obj.asInstanceOf[ISearchSuggestionCollection]
  }
}

