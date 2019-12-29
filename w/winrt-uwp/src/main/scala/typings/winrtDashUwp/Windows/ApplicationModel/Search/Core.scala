package typings.winrtDashUwp.Windows.ApplicationModel.Search

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Foundation.Collections.IObservableVector
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.requestingfocusonkeyboardinput
import typings.winrtDashUwp.winrtDashUwpStrings.suggestionsrequested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to search suggestions for the in-app SearchBox control and the search pane. */
@JSGlobal("Windows.ApplicationModel.Search.Core")
@js.native
object Core extends js.Object {
  /** Provides data for the RequestingFocusOnKeyboardInput event. */
  @js.native
  abstract class RequestingFocusOnKeyboardInputEventArgs () extends js.Object
  
  /** Enables access to the search suggestions that the SearchSuggestionManager provides. */
  @js.native
  abstract class SearchSuggestion () extends js.Object {
    /** Gets the value that was passed to the detailText parameter of the AppendResultSuggestion method. */
    var detailText: String = js.native
    /** Gets the value that was passed to the image parameter of the AppendResultSuggestion method. */
    var image: IRandomAccessStreamReference = js.native
    /** Gets the value that was passed to the imageAlternateText parameter of the AppendResultSuggestion method. */
    var imageAlternateText: String = js.native
    /** Gets the type of suggestion. */
    var kind: SearchSuggestionKind = js.native
    /** Gets the value that was passed to the tag parameter of the AppendResultSuggestion method. */
    var tag: String = js.native
    /** Gets the localized text of the suggestion for display in the search suggestions UI. */
    var text: String = js.native
  }
  
  @js.native
  sealed trait SearchSuggestionKind extends js.Object
  
  /** Manages access to search suggestions for the in-app SearchBox control. */
  @js.native
  /** Initializes a new instance of the SearchSuggestionManager class. */
  class SearchSuggestionManager () extends js.Object {
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
  
  /** Provides data for the SuggestionsRequested event. */
  @js.native
  abstract class SearchSuggestionsRequestedEventArgs () extends js.Object {
    /** Gets the Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
    var language: String = js.native
    /** Gets an object that provides linguistic information about query text that the user is entering through an Input Method Editor (IME). */
    var linguisticDetails: SearchQueryLinguisticDetails = js.native
    /** The text that the app should provide suggestions for and that was in the search box when the SuggestionsRequested event was raised. */
    var queryText: String = js.native
    /** Gets an object that stores suggestions and information about the request. */
    var request: SearchSuggestionsRequest = js.native
  }
  
  /** Specifies the type of a SearchSuggestion . */
  @js.native
  object SearchSuggestionKind extends js.Object {
    /** The suggestion is a query suggestion. */
    @js.native
    sealed trait query extends SearchSuggestionKind
    
    /** The suggestion is a result suggestion. */
    @js.native
    sealed trait result extends SearchSuggestionKind
    
    /** Represents a separator between search suggestions that's useful for grouping. */
    @js.native
    sealed trait separator extends SearchSuggestionKind
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SearchSuggestionKind with Double] = js.native
    /* 0 */ @js.native
    object query extends TopLevel[query with Double]
    
    /* 1 */ @js.native
    object result extends TopLevel[result with Double]
    
    /* 2 */ @js.native
    object separator extends TopLevel[separator with Double]
    
  }
  
}

