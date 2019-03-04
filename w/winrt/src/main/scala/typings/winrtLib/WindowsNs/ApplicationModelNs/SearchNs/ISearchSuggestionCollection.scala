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

object ISearchSuggestionCollection {
  @scala.inline
  def apply(
    appendQuerySuggestion: js.Function1[java.lang.String, scala.Unit],
    appendQuerySuggestions: js.Function1[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], 
      scala.Unit
    ],
    appendResultSuggestion: js.Function5[
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference, 
      java.lang.String, 
      scala.Unit
    ],
    appendSearchSeparator: js.Function1[java.lang.String, scala.Unit],
    size: scala.Double
  ): ISearchSuggestionCollection = {
    val __obj = js.Dynamic.literal(appendQuerySuggestion = appendQuerySuggestion, appendQuerySuggestions = appendQuerySuggestions, appendResultSuggestion = appendResultSuggestion, appendSearchSeparator = appendSearchSeparator, size = size)
  
    __obj.asInstanceOf[ISearchSuggestionCollection]
  }
}

