package typings.winrt.WindowsNs.ApplicationModelNs.SearchNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Search.SearchSuggestionCollection")
@js.native
class SearchSuggestionCollection () extends ISearchSuggestionCollection {
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override def appendQuerySuggestion(text: String): Unit = js.native
  /* CompleteClass */
  override def appendQuerySuggestions(suggestions: IIterable[String]): Unit = js.native
  /* CompleteClass */
  override def appendResultSuggestion(
    text: String,
    detailText: String,
    tag: String,
    image: IRandomAccessStreamReference,
    imageAlternateText: String
  ): Unit = js.native
  /* CompleteClass */
  override def appendSearchSeparator(label: String): Unit = js.native
}

