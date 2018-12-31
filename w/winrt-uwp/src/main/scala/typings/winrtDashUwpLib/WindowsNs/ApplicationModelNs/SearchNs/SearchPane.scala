package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents and manages the search pane that opens when a user activates the Search charm. The search pane provides a consistent, touch-friendly search box and optional search suggestions. */
@JSGlobal("Windows.ApplicationModel.Search.SearchPane")
@js.native
abstract class SearchPane () extends js.Object {
  /** The Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
  var language: java.lang.String = js.native
  /** Fires when the user changes the text in the search box. */
  @JSName("onquerychanged")
  var onquerychanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SearchPane, SearchPaneQueryChangedEventArgs] = js.native
  /** Fires when the user submits the text in the search box and the app needs to display search results. */
  @JSName("onquerysubmitted")
  var onquerysubmitted_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SearchPane, SearchPaneQuerySubmittedEventArgs] = js.native
  /** Fires when the user selects one of the suggested results that was provided by the app and displayed in the search pane. */
  @JSName("onresultsuggestionchosen")
  var onresultsuggestionchosen_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SearchPane, SearchPaneResultSuggestionChosenEventArgs] = js.native
  /** Fires when the user's query text changes and the app needs to provide new suggestions to display in the search pane. */
  @JSName("onsuggestionsrequested")
  var onsuggestionsrequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SearchPane, SearchPaneSuggestionsRequestedEventArgs] = js.native
  /** Fires when the user opens or closes the search pane. */
  @JSName("onvisibilitychanged")
  var onvisibilitychanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SearchPane, SearchPaneVisibilityChangedEventArgs] = js.native
  /** The placeholder text in the search box when the user hasn't entered any characters. */
  var placeholderText: java.lang.String = js.native
  /** The current text in the search box of the search pane. */
  var queryText: java.lang.String = js.native
  /** A string that identifies the context of the search and is used to store the user's search history with the app. */
  var searchHistoryContext: java.lang.String = js.native
  /** Indicates whether the user's previous searches with the app are automatically tracked and used to provide suggestions. */
  var searchHistoryEnabled: scala.Boolean = js.native
  /** Gets or sets whether the user can open the search pane by typing. */
  var showOnKeyboardInput: scala.Boolean = js.native
  /** Indicates whether the search pane is open. */
  var visible: scala.Boolean = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_querychanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.querychanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SearchPane, SearchPaneQueryChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_querysubmitted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.querysubmitted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SearchPane, SearchPaneQuerySubmittedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resultsuggestionchosen(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.resultsuggestionchosen,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SearchPane, SearchPaneResultSuggestionChosenEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_suggestionsrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.suggestionsrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SearchPane, SearchPaneSuggestionsRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_visibilitychanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.visibilitychanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SearchPane, SearchPaneVisibilityChangedEventArgs]
  ): scala.Unit = js.native
  /** Fires when the user changes the text in the search box. */
  def onquerychanged(ev: SearchPaneQueryChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[SearchPane]): scala.Unit = js.native
  /** Fires when the user submits the text in the search box and the app needs to display search results. */
  def onquerysubmitted(ev: SearchPaneQuerySubmittedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[SearchPane]): scala.Unit = js.native
  /** Fires when the user selects one of the suggested results that was provided by the app and displayed in the search pane. */
  def onresultsuggestionchosen(
    ev: SearchPaneResultSuggestionChosenEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[SearchPane]
  ): scala.Unit = js.native
  /** Fires when the user's query text changes and the app needs to provide new suggestions to display in the search pane. */
  def onsuggestionsrequested(ev: SearchPaneSuggestionsRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[SearchPane]): scala.Unit = js.native
  /** Fires when the user opens or closes the search pane. */
  def onvisibilitychanged(ev: SearchPaneVisibilityChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[SearchPane]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_querychanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.querychanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SearchPane, SearchPaneQueryChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_querysubmitted(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.querysubmitted,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SearchPane, SearchPaneQuerySubmittedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resultsuggestionchosen(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.resultsuggestionchosen,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SearchPane, SearchPaneResultSuggestionChosenEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_suggestionsrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.suggestionsrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SearchPane, SearchPaneSuggestionsRequestedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_visibilitychanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.visibilitychanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SearchPane, SearchPaneVisibilityChangedEventArgs]
  ): scala.Unit = js.native
  /**
    * Specifies whether suggestions based on local files are automatically displayed in the search pane, and defines the criteria that Windows uses to locate and filter these suggestions.
    * @param settings The new settings for local content suggestions.
    */
  def setLocalContentSuggestionSettings(settings: LocalContentSuggestionSettings): scala.Unit = js.native
  /** Shows the search pane. */
  def show(): scala.Unit = js.native
  /**
    * Shows the search pane with the specified initial query string.
    * @param query The initial query string.
    */
  def show(query: java.lang.String): scala.Unit = js.native
  /**
    * Attempts to set the text in the search box of the search pane.
    * @param query The query text to show in the search pane's search box.
    * @return True if the search box text was set successfully. Otherwise, false.
    */
  def trySetQueryText(query: java.lang.String): scala.Boolean = js.native
}

/** Represents and manages the search pane that opens when a user activates the Search charm. The search pane provides a consistent, touch-friendly search box and optional search suggestions. */
@JSGlobal("Windows.ApplicationModel.Search.SearchPane")
@js.native
object SearchPane extends js.Object {
  /**
    * Retrieves an instance of the search pane from which users can search within the app.
    * @return An instance of the search pane, which provides a consistent, touch-friendly search box and optional search suggestions for searching within the current application.
    */
  def getForCurrentView(): winrtDashUwpLib.WindowsNs.ApplicationModelNs.SearchNs.SearchPane = js.native
  /** Hides the current app's UI. */
  def hideThisApplication(): scala.Unit = js.native
}

