package typings.winrt.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISearchPane extends js.Object {
  
  var language: String = js.native
  
  var onquerychanged: js.Any = js.native
  
  var onquerysubmitted: js.Any = js.native
  
  var onresultsuggestionchosen: js.Any = js.native
  
  var onsuggestionsrequested: js.Any = js.native
  
  var onvisibilitychanged: js.Any = js.native
  
  var placeholderText: String = js.native
  
  var queryText: String = js.native
  
  var searchHistoryContext: String = js.native
  
  var searchHistoryEnabled: Boolean = js.native
  
  def setLocalContentSuggestionSettings(settings: LocalContentSuggestionSettings): Unit = js.native
  
  def show(): Unit = js.native
  def show(query: String): Unit = js.native
  
  var showOnKeyboardInput: Boolean = js.native
  
  def trySetQueryText(query: String): Boolean = js.native
  
  var visible: Boolean = js.native
}
