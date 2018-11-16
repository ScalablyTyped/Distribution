package typings
package winrtLib.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISearchPaneSuggestionsRequest extends js.Object {
  var isCanceled: scala.Boolean
  var searchSuggestionCollection: SearchSuggestionCollection
  def getDeferral(): SearchPaneSuggestionsRequestDeferral
}

