package typings
package winrtLib.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchPane extends js.Object {
  var language: java.lang.String = js.native
  var onquerychanged: js.Any = js.native
  var onquerysubmitted: js.Any = js.native
  var onresultsuggestionchosen: js.Any = js.native
  var onsuggestionsrequested: js.Any = js.native
  var onvisibilitychanged: js.Any = js.native
  var placeholderText: java.lang.String = js.native
  var queryText: java.lang.String = js.native
  var searchHistoryContext: java.lang.String = js.native
  var searchHistoryEnabled: scala.Boolean = js.native
  var showOnKeyboardInput: scala.Boolean = js.native
  var visible: scala.Boolean = js.native
  def setLocalContentSuggestionSettings(settings: LocalContentSuggestionSettings): scala.Unit = js.native
  def show(): scala.Unit = js.native
  def show(query: java.lang.String): scala.Unit = js.native
  def trySetQueryText(query: java.lang.String): scala.Boolean = js.native
}

