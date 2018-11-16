package typings
package winrtLib.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Search.SearchSuggestionCollection")
@js.native
class SearchSuggestionCollection () extends ISearchSuggestionCollection {
  /* CompleteClass */
  override var size: scala.Double = js.native
  /* CompleteClass */
  override def appendQuerySuggestion(text: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def appendQuerySuggestions(suggestions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]): scala.Unit = js.native
  /* CompleteClass */
  override def appendResultSuggestion(
    text: java.lang.String,
    detailText: java.lang.String,
    tag: java.lang.String,
    image: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference,
    imageAlternateText: java.lang.String
  ): scala.Unit = js.native
  /* CompleteClass */
  override def appendSearchSeparator(label: java.lang.String): scala.Unit = js.native
}

