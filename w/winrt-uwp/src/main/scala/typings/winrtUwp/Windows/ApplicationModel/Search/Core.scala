package typings.winrtUwp.Windows.ApplicationModel.Search

import typings.winrtUwp.Windows.Foundation.Collections.IObservableVector
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.requestingfocusonkeyboardinput
import typings.winrtUwp.winrtUwpStrings.suggestionsrequested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to search suggestions for the in-app SearchBox control and the search pane. */
object Core {
  
  @js.native
  sealed trait SearchSuggestionKind extends StObject
  /** Specifies the type of a SearchSuggestion . */
  @JSGlobal("Windows.ApplicationModel.Search.Core.SearchSuggestionKind")
  @js.native
  object SearchSuggestionKind extends StObject {
    
    /** The suggestion is a query suggestion. */
    @js.native
    sealed trait query
      extends StObject
         with SearchSuggestionKind
    
    /** The suggestion is a result suggestion. */
    @js.native
    sealed trait result
      extends StObject
         with SearchSuggestionKind
    
    /** Represents a separator between search suggestions that's useful for grouping. */
    @js.native
    sealed trait separator
      extends StObject
         with SearchSuggestionKind
  }
  
  /** Provides data for the RequestingFocusOnKeyboardInput event. */
  trait RequestingFocusOnKeyboardInputEventArgs extends StObject
  
  /** Enables access to the search suggestions that the SearchSuggestionManager provides. */
  trait SearchSuggestion extends StObject {
    
    /** Gets the value that was passed to the detailText parameter of the AppendResultSuggestion method. */
    var detailText: String
    
    /** Gets the value that was passed to the image parameter of the AppendResultSuggestion method. */
    var image: IRandomAccessStreamReference
    
    /** Gets the value that was passed to the imageAlternateText parameter of the AppendResultSuggestion method. */
    var imageAlternateText: String
    
    /** Gets the type of suggestion. */
    var kind: SearchSuggestionKind
    
    /** Gets the value that was passed to the tag parameter of the AppendResultSuggestion method. */
    var tag: String
    
    /** Gets the localized text of the suggestion for display in the search suggestions UI. */
    var text: String
  }
  object SearchSuggestion {
    
    inline def apply(
      detailText: String,
      image: IRandomAccessStreamReference,
      imageAlternateText: String,
      kind: SearchSuggestionKind,
      tag: String,
      text: String
    ): SearchSuggestion = {
      val __obj = js.Dynamic.literal(detailText = detailText.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imageAlternateText = imageAlternateText.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchSuggestion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchSuggestion] (val x: Self) extends AnyVal {
      
      inline def setDetailText(value: String): Self = StObject.set(x, "detailText", value.asInstanceOf[js.Any])
      
      inline def setImage(value: IRandomAccessStreamReference): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageAlternateText(value: String): Self = StObject.set(x, "imageAlternateText", value.asInstanceOf[js.Any])
      
      inline def setKind(value: SearchSuggestionKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /** Manages access to search suggestions for the in-app SearchBox control. */
  @js.native
  trait SearchSuggestionManager extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
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
    def onrequestingfocusonkeyboardinput(ev: RequestingFocusOnKeyboardInputEventArgs & WinRTEvent[SearchSuggestionManager]): Unit = js.native
    /** Raised when the user presses a key that initiates type-to-search. */
    @JSName("onrequestingfocusonkeyboardinput")
    var onrequestingfocusonkeyboardinput_Original: TypedEventHandler[SearchSuggestionManager, RequestingFocusOnKeyboardInputEventArgs] = js.native
    
    /** Raised when the user's query text changes and the app needs to provide new suggestions to display in the search box. */
    def onsuggestionsrequested(ev: SearchSuggestionsRequestedEventArgs & WinRTEvent[SearchSuggestionManager]): Unit = js.native
    /** Raised when the user's query text changes and the app needs to provide new suggestions to display in the search box. */
    @JSName("onsuggestionsrequested")
    var onsuggestionsrequested_Original: TypedEventHandler[SearchSuggestionManager, SearchSuggestionsRequestedEventArgs] = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
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
    
    /** Identifies the context of the search and is used to store the user's search history with the app. */
    var searchHistoryContext: String = js.native
    
    /** Indicates whether the user's previous searches with the app are automatically tracked and used to provide suggestions. */
    var searchHistoryEnabled: Boolean = js.native
    
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
    
    /** Gets the search suggestions for the current search query. */
    var suggestions: IObservableVector[SearchSuggestion] = js.native
  }
  
  /** Provides data for the SuggestionsRequested event. */
  trait SearchSuggestionsRequestedEventArgs extends StObject {
    
    /** Gets the Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
    var language: String
    
    /** Gets an object that provides linguistic information about query text that the user is entering through an Input Method Editor (IME). */
    var linguisticDetails: SearchQueryLinguisticDetails
    
    /** The text that the app should provide suggestions for and that was in the search box when the SuggestionsRequested event was raised. */
    var queryText: String
    
    /** Gets an object that stores suggestions and information about the request. */
    var request: SearchSuggestionsRequest
  }
  object SearchSuggestionsRequestedEventArgs {
    
    inline def apply(
      language: String,
      linguisticDetails: SearchQueryLinguisticDetails,
      queryText: String,
      request: SearchSuggestionsRequest
    ): SearchSuggestionsRequestedEventArgs = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], linguisticDetails = linguisticDetails.asInstanceOf[js.Any], queryText = queryText.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchSuggestionsRequestedEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchSuggestionsRequestedEventArgs] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLinguisticDetails(value: SearchQueryLinguisticDetails): Self = StObject.set(x, "linguisticDetails", value.asInstanceOf[js.Any])
      
      inline def setQueryText(value: String): Self = StObject.set(x, "queryText", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: SearchSuggestionsRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
}
