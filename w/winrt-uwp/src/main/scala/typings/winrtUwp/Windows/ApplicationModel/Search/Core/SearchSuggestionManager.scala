package typings.winrtUwp.Windows.ApplicationModel.Search.Core

import typings.winrtUwp.Windows.ApplicationModel.Search.LocalContentSuggestionSettings
import typings.winrtUwp.Windows.ApplicationModel.Search.SearchQueryLinguisticDetails
import typings.winrtUwp.Windows.Foundation.Collections.IObservableVector
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.requestingfocusonkeyboardinput
import typings.winrtUwp.winrtUwpStrings.suggestionsrequested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages access to search suggestions for the in-app SearchBox control. */
@js.native
trait SearchSuggestionManager extends js.Object {
  /** Raised when the user presses a key that initiates type-to-search. */
  @JSName("onrequestingfocusonkeyboardinput")
  var onrequestingfocusonkeyboardinput_Original: TypedEventHandler[SearchSuggestionManager, RequestingFocusOnKeyboardInputEventArgs] = js.native
  /** Raised when the user's query text changes and the app needs to provide new suggestions to display in the search box. */
  @JSName("onsuggestionsrequested")
  var onsuggestionsrequested_Original: TypedEventHandler[SearchSuggestionManager, SearchSuggestionsRequestedEventArgs] = js.native
  /** Identifies the context of the search and is used to store the user's search history with the app. */
  var searchHistoryContext: String = js.native
  /** Indicates whether the user's previous searches with the app are automatically tracked and used to provide suggestions. */
  var searchHistoryEnabled: Boolean = js.native
  /** Gets the search suggestions for the current search query. */
  var suggestions: IObservableVector[SearchSuggestion] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_requestingfocusonkeyboardinput(
    `type`: requestingfocusonkeyboardinput,
    listener: TypedEventHandler[SearchSuggestionManager, RequestingFocusOnKeyboardInputEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suggestionsrequested(
    `type`: suggestionsrequested,
    listener: TypedEventHandler[SearchSuggestionManager, SearchSuggestionsRequestedEventArgs]
  ): Unit = js.native
  /**
    * Stores the specified query in the search history.
    * @param queryText The query.
    */
  def addToHistory(queryText: String): Unit = js.native
  /**
    * Stores the specified query and input language in the search history.
    * @param queryText The query.
    * @param language The input language. The input language ensures that the query string is displayed in the search history for the correct language.
    */
  def addToHistory(queryText: String, language: String): Unit = js.native
  /** Clears all search history contexts for the current app. */
  def clearHistory(): Unit = js.native
  /** Raised when the user presses a key that initiates type-to-search. */
  def onrequestingfocusonkeyboardinput(ev: RequestingFocusOnKeyboardInputEventArgs with WinRTEvent[SearchSuggestionManager]): Unit = js.native
  /** Raised when the user's query text changes and the app needs to provide new suggestions to display in the search box. */
  def onsuggestionsrequested(ev: SearchSuggestionsRequestedEventArgs with WinRTEvent[SearchSuggestionManager]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_requestingfocusonkeyboardinput(
    `type`: requestingfocusonkeyboardinput,
    listener: TypedEventHandler[SearchSuggestionManager, RequestingFocusOnKeyboardInputEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suggestionsrequested(
    `type`: suggestionsrequested,
    listener: TypedEventHandler[SearchSuggestionManager, SearchSuggestionsRequestedEventArgs]
  ): Unit = js.native
  /**
    * Specifies whether suggestions based on local files are added automatically to the Suggestions collection, and defines the criteria that Windows uses to locate and filter these suggestions.
    * @param settings The new settings for local content suggestions.
    */
  def setLocalContentSuggestionSettings(settings: LocalContentSuggestionSettings): Unit = js.native
  /**
    * Assigns the current search query.
    * @param queryText The query.
    */
  def setQuery(queryText: String): Unit = js.native
  /**
    * Assigns the current search query with the specified input language.
    * @param queryText The query.
    * @param language The input language.
    */
  def setQuery(queryText: String, language: String): Unit = js.native
  /**
    * Assigns the current search query with the specified input language and Input Method Editor (IME) info.
    * @param queryText The query.
    * @param language The input language.
    * @param linguisticDetails Info about the query text that the user enters through an IME.
    */
  def setQuery(queryText: String, language: String, linguisticDetails: SearchQueryLinguisticDetails): Unit = js.native
}

