package typings.winrtUwp.Windows.ApplicationModel.Search

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.querychanged
import typings.winrtUwp.winrtUwpStrings.querysubmitted
import typings.winrtUwp.winrtUwpStrings.resultsuggestionchosen
import typings.winrtUwp.winrtUwpStrings.suggestionsrequested
import typings.winrtUwp.winrtUwpStrings.visibilitychanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents and manages the search pane that opens when a user activates the Search charm. The search pane provides a consistent, touch-friendly search box and optional search suggestions. */
@js.native
trait SearchPane extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_querychanged(`type`: querychanged, listener: TypedEventHandler[SearchPane, SearchPaneQueryChangedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_querysubmitted(`type`: querysubmitted, listener: TypedEventHandler[SearchPane, SearchPaneQuerySubmittedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resultsuggestionchosen(
    `type`: resultsuggestionchosen,
    listener: TypedEventHandler[SearchPane, SearchPaneResultSuggestionChosenEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suggestionsrequested(
    `type`: suggestionsrequested,
    listener: TypedEventHandler[SearchPane, SearchPaneSuggestionsRequestedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_visibilitychanged(
    `type`: visibilitychanged,
    listener: TypedEventHandler[SearchPane, SearchPaneVisibilityChangedEventArgs]
  ): Unit = js.native
  
  /** The Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
  var language: String = js.native
  
  /** Fires when the user changes the text in the search box. */
  def onquerychanged(ev: SearchPaneQueryChangedEventArgs with WinRTEvent[SearchPane]): Unit = js.native
  /** Fires when the user changes the text in the search box. */
  @JSName("onquerychanged")
  var onquerychanged_Original: TypedEventHandler[SearchPane, SearchPaneQueryChangedEventArgs] = js.native
  
  /** Fires when the user submits the text in the search box and the app needs to display search results. */
  def onquerysubmitted(ev: SearchPaneQuerySubmittedEventArgs with WinRTEvent[SearchPane]): Unit = js.native
  /** Fires when the user submits the text in the search box and the app needs to display search results. */
  @JSName("onquerysubmitted")
  var onquerysubmitted_Original: TypedEventHandler[SearchPane, SearchPaneQuerySubmittedEventArgs] = js.native
  
  /** Fires when the user selects one of the suggested results that was provided by the app and displayed in the search pane. */
  def onresultsuggestionchosen(ev: SearchPaneResultSuggestionChosenEventArgs with WinRTEvent[SearchPane]): Unit = js.native
  /** Fires when the user selects one of the suggested results that was provided by the app and displayed in the search pane. */
  @JSName("onresultsuggestionchosen")
  var onresultsuggestionchosen_Original: TypedEventHandler[SearchPane, SearchPaneResultSuggestionChosenEventArgs] = js.native
  
  /** Fires when the user's query text changes and the app needs to provide new suggestions to display in the search pane. */
  def onsuggestionsrequested(ev: SearchPaneSuggestionsRequestedEventArgs with WinRTEvent[SearchPane]): Unit = js.native
  /** Fires when the user's query text changes and the app needs to provide new suggestions to display in the search pane. */
  @JSName("onsuggestionsrequested")
  var onsuggestionsrequested_Original: TypedEventHandler[SearchPane, SearchPaneSuggestionsRequestedEventArgs] = js.native
  
  /** Fires when the user opens or closes the search pane. */
  def onvisibilitychanged(ev: SearchPaneVisibilityChangedEventArgs with WinRTEvent[SearchPane]): Unit = js.native
  /** Fires when the user opens or closes the search pane. */
  @JSName("onvisibilitychanged")
  var onvisibilitychanged_Original: TypedEventHandler[SearchPane, SearchPaneVisibilityChangedEventArgs] = js.native
  
  /** The placeholder text in the search box when the user hasn't entered any characters. */
  var placeholderText: String = js.native
  
  /** The current text in the search box of the search pane. */
  var queryText: String = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_querychanged(`type`: querychanged, listener: TypedEventHandler[SearchPane, SearchPaneQueryChangedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_querysubmitted(`type`: querysubmitted, listener: TypedEventHandler[SearchPane, SearchPaneQuerySubmittedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resultsuggestionchosen(
    `type`: resultsuggestionchosen,
    listener: TypedEventHandler[SearchPane, SearchPaneResultSuggestionChosenEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suggestionsrequested(
    `type`: suggestionsrequested,
    listener: TypedEventHandler[SearchPane, SearchPaneSuggestionsRequestedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_visibilitychanged(
    `type`: visibilitychanged,
    listener: TypedEventHandler[SearchPane, SearchPaneVisibilityChangedEventArgs]
  ): Unit = js.native
  
  /** A string that identifies the context of the search and is used to store the user's search history with the app. */
  var searchHistoryContext: String = js.native
  
  /** Indicates whether the user's previous searches with the app are automatically tracked and used to provide suggestions. */
  var searchHistoryEnabled: Boolean = js.native
  
  /**
    * Specifies whether suggestions based on local files are automatically displayed in the search pane, and defines the criteria that Windows uses to locate and filter these suggestions.
    * @param settings The new settings for local content suggestions.
    */
  def setLocalContentSuggestionSettings(settings: LocalContentSuggestionSettings): Unit = js.native
  
  /** Shows the search pane. */
  def show(): Unit = js.native
  /**
    * Shows the search pane with the specified initial query string.
    * @param query The initial query string.
    */
  def show(query: String): Unit = js.native
  
  /** Gets or sets whether the user can open the search pane by typing. */
  var showOnKeyboardInput: Boolean = js.native
  
  /**
    * Attempts to set the text in the search box of the search pane.
    * @param query The query text to show in the search pane's search box.
    * @return True if the search box text was set successfully. Otherwise, false.
    */
  def trySetQueryText(query: String): Boolean = js.native
  
  /** Indicates whether the search pane is open. */
  var visible: Boolean = js.native
}
