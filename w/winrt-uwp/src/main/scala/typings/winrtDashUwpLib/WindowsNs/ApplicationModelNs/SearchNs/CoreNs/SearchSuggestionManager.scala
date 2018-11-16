package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.SearchNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages access to search suggestions for the in-app SearchBox control. */
@JSGlobal("Windows.ApplicationModel.Search.Core.SearchSuggestionManager")
@js.native
class SearchSuggestionManager () extends js.Object {
  /** Raised when the user presses a key that initiates type-to-search. */
  @JSName("onrequestingfocusonkeyboardinput")
  var onrequestingfocusonkeyboardinput_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SearchSuggestionManager, RequestingFocusOnKeyboardInputEventArgs] = js.native
  /** Raised when the user's query text changes and the app needs to provide new suggestions to display in the search box. */
  @JSName("onsuggestionsrequested")
  var onsuggestionsrequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SearchSuggestionManager, SearchSuggestionsRequestedEventArgs] = js.native
  /** Identifies the context of the search and is used to store the user's search history with the app. */
  var searchHistoryContext: java.lang.String = js.native
  /** Indicates whether the user's previous searches with the app are automatically tracked and used to provide suggestions. */
  var searchHistoryEnabled: scala.Boolean = js.native
  /** Gets the search suggestions for the current search query. */
  var suggestions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IObservableVector[SearchSuggestion] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_requestingfocusonkeyboardinput(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.requestingfocusonkeyboardinput,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SearchSuggestionManager, RequestingFocusOnKeyboardInputEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suggestionsrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.suggestionsrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SearchSuggestionManager, SearchSuggestionsRequestedEventArgs]
  ): scala.Unit = js.native
  /**
                       * Stores the specified query in the search history.
                       * @param queryText The query.
                       */
  def addToHistory(queryText: java.lang.String): scala.Unit = js.native
  /**
                       * Stores the specified query and input language in the search history.
                       * @param queryText The query.
                       * @param language The input language. The input language ensures that the query string is displayed in the search history for the correct language.
                       */
  def addToHistory(queryText: java.lang.String, language: java.lang.String): scala.Unit = js.native
  /** Clears all search history contexts for the current app. */
  def clearHistory(): scala.Unit = js.native
  /** Raised when the user presses a key that initiates type-to-search. */
  def onrequestingfocusonkeyboardinput(
    ev: RequestingFocusOnKeyboardInputEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[SearchSuggestionManager]
  ): scala.Unit = js.native
  /** Raised when the user's query text changes and the app needs to provide new suggestions to display in the search box. */
  def onsuggestionsrequested(
    ev: SearchSuggestionsRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[SearchSuggestionManager]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_requestingfocusonkeyboardinput(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.requestingfocusonkeyboardinput,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SearchSuggestionManager, RequestingFocusOnKeyboardInputEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suggestionsrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.suggestionsrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SearchSuggestionManager, SearchSuggestionsRequestedEventArgs]
  ): scala.Unit = js.native
  /**
                       * Specifies whether suggestions based on local files are added automatically to the Suggestions collection, and defines the criteria that Windows uses to locate and filter these suggestions.
                       * @param settings The new settings for local content suggestions.
                       */
  def setLocalContentSuggestionSettings(settings: winrtDashUwpLib.WindowsNs.ApplicationModelNs.SearchNs.LocalContentSuggestionSettings): scala.Unit = js.native
  /**
                       * Assigns the current search query.
                       * @param queryText The query.
                       */
  def setQuery(queryText: java.lang.String): scala.Unit = js.native
  /**
                       * Assigns the current search query with the specified input language.
                       * @param queryText The query.
                       * @param language The input language.
                       */
  def setQuery(queryText: java.lang.String, language: java.lang.String): scala.Unit = js.native
  /**
                       * Assigns the current search query with the specified input language and Input Method Editor (IME) info.
                       * @param queryText The query.
                       * @param language The input language.
                       * @param linguisticDetails Info about the query text that the user enters through an IME.
                       */
  def setQuery(
    queryText: java.lang.String,
    language: java.lang.String,
    linguisticDetails: winrtDashUwpLib.WindowsNs.ApplicationModelNs.SearchNs.SearchQueryLinguisticDetails
  ): scala.Unit = js.native
}

