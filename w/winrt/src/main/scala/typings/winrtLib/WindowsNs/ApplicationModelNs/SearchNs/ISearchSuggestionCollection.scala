package typings
package winrtLib.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISearchSuggestionCollection extends js.Object {
  var size: scala.Double
  def appendQuerySuggestion(text: java.lang.String): scala.Unit
  def appendQuerySuggestions(suggestions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]): scala.Unit
  def appendResultSuggestion(
    text: java.lang.String,
    detailText: java.lang.String,
    tag: java.lang.String,
    image: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference,
    imageAlternateText: java.lang.String
  ): scala.Unit
  def appendSearchSeparator(label: java.lang.String): scala.Unit
}

