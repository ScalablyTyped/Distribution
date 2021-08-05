package typings.winrtUwp.global.Windows.ApplicationModel

import typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionKind
import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Storage.StorageFolder
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for the search pane in apps that participate in the Search contract. The search pane opens when users activate the Search charm and provides a consistent, touch-friendly search box and optional search suggestions. */
object Search {
  
  /** Provides access to search suggestions for the in-app SearchBox control and the search pane. */
  object Core {
    
    /** Provides data for the RequestingFocusOnKeyboardInput event. */
    @JSGlobal("Windows.ApplicationModel.Search.Core.RequestingFocusOnKeyboardInputEventArgs")
    @js.native
    abstract class RequestingFocusOnKeyboardInputEventArgs ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.Search.Core.RequestingFocusOnKeyboardInputEventArgs
    
    /** Enables access to the search suggestions that the SearchSuggestionManager provides. */
    @JSGlobal("Windows.ApplicationModel.Search.Core.SearchSuggestion")
    @js.native
    abstract class SearchSuggestion ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestion {
      
      /** Gets the value that was passed to the detailText parameter of the AppendResultSuggestion method. */
      /* CompleteClass */
      var detailText: String = js.native
      
      /** Gets the value that was passed to the image parameter of the AppendResultSuggestion method. */
      /* CompleteClass */
      var image: IRandomAccessStreamReference = js.native
      
      /** Gets the value that was passed to the imageAlternateText parameter of the AppendResultSuggestion method. */
      /* CompleteClass */
      var imageAlternateText: String = js.native
      
      /** Gets the type of suggestion. */
      /* CompleteClass */
      var kind: SearchSuggestionKind = js.native
      
      /** Gets the value that was passed to the tag parameter of the AppendResultSuggestion method. */
      /* CompleteClass */
      var tag: String = js.native
      
      /** Gets the localized text of the suggestion for display in the search suggestions UI. */
      /* CompleteClass */
      var text: String = js.native
    }
    
    /** Specifies the type of a SearchSuggestion . */
    @JSGlobal("Windows.ApplicationModel.Search.Core.SearchSuggestionKind")
    @js.native
    object SearchSuggestionKind extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionKind & Double
          ] = js.native
      
      /* 0 */ val query: typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionKind.query & Double = js.native
      
      /* 1 */ val result: typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionKind.result & Double = js.native
      
      /* 2 */ val separator: typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionKind.separator & Double = js.native
    }
    
    /** Manages access to search suggestions for the in-app SearchBox control. */
    @JSGlobal("Windows.ApplicationModel.Search.Core.SearchSuggestionManager")
    @js.native
    /** Initializes a new instance of the SearchSuggestionManager class. */
    class SearchSuggestionManager ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionManager
    
    /** Provides data for the SuggestionsRequested event. */
    @JSGlobal("Windows.ApplicationModel.Search.Core.SearchSuggestionsRequestedEventArgs")
    @js.native
    abstract class SearchSuggestionsRequestedEventArgs ()
      extends StObject
         with typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionsRequestedEventArgs {
      
      /** Gets the Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
      /* CompleteClass */
      var language: String = js.native
      
      /** Gets an object that provides linguistic information about query text that the user is entering through an Input Method Editor (IME). */
      /* CompleteClass */
      var linguisticDetails: typings.winrtUwp.Windows.ApplicationModel.Search.SearchQueryLinguisticDetails = js.native
      
      /** The text that the app should provide suggestions for and that was in the search box when the SuggestionsRequested event was raised. */
      /* CompleteClass */
      var queryText: String = js.native
      
      /** Gets an object that stores suggestions and information about the request. */
      /* CompleteClass */
      var request: typings.winrtUwp.Windows.ApplicationModel.Search.SearchSuggestionsRequest = js.native
    }
  }
  
  /** Stores settings that determine whether the app provides suggestions based on local files, and that define the criteria used to locate and filter these suggestions. */
  @JSGlobal("Windows.ApplicationModel.Search.LocalContentSuggestionSettings")
  @js.native
  /** Creates a new instance of the localContentSuggestionSettings class. */
  class LocalContentSuggestionSettings ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Search.LocalContentSuggestionSettings {
    
    /** An Advanced Query Syntax (AQS) string that limits the types and kinds of files that are used to provide suggestions. If no AQS string is specified, suggestions are provided from all local files in locations specified by the locations property. */
    /* CompleteClass */
    var aqsFilter: String = js.native
    
    /** Indicates whether suggestions based on local files are displayed in the search pane. */
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /** A list of the storageFolder objects that contain files that are used to provide suggestions. If the list is empty, suggestions are provided from files in all of the local libraries for which the app declared capabilities. */
    /* CompleteClass */
    var locations: IVector[StorageFolder] = js.native
    
    /** A list of the file properties whose values are used to provide suggestions from local files. If the list is empty, all of the file properties that are available for suggestions are used. */
    /* CompleteClass */
    var propertiesToMatch: IVector[String] = js.native
  }
  
  /** Represents and manages the search pane that opens when a user activates the Search charm. The search pane provides a consistent, touch-friendly search box and optional search suggestions. */
  @JSGlobal("Windows.ApplicationModel.Search.SearchPane")
  @js.native
  abstract class SearchPane ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Search.SearchPane
  object SearchPane {
    
    @JSGlobal("Windows.ApplicationModel.Search.SearchPane")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Retrieves an instance of the search pane from which users can search within the app.
      * @return An instance of the search pane, which provides a consistent, touch-friendly search box and optional search suggestions for searching within the current application.
      */
    /* static member */
    inline def getForCurrentView(): typings.winrtUwp.Windows.ApplicationModel.Search.SearchPane = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrtUwp.Windows.ApplicationModel.Search.SearchPane]
    
    /** Hides the current app's UI. */
    /* static member */
    inline def hideThisApplication(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideThisApplication")().asInstanceOf[Unit]
  }
  
  /** Provides data for a querychanged event that is associated with a searchPane object. */
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneQueryChangedEventArgs")
  @js.native
  abstract class SearchPaneQueryChangedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneQueryChangedEventArgs {
    
    /** The Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
    /* CompleteClass */
    var language: String = js.native
    
    /** An object that provides linguistic information about query text that the user is entering through an Input Method Editor (IME). */
    /* CompleteClass */
    var linguisticDetails: typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails = js.native
    
    /** The text in the search box when the querychanged event fired. */
    /* CompleteClass */
    var queryText: String = js.native
  }
  
  /** Provides information about query text that the user enters through an Input Method Editor (IME). */
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails")
  @js.native
  abstract class SearchPaneQueryLinguisticDetails ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails {
    
    /** A list of the text alternatives for the current query text. These alternatives account for uncomposed text the user is entering in an IME. */
    /* CompleteClass */
    var queryTextAlternatives: IVectorView[String] = js.native
    
    /** The length of the portion of the query text that the user is composing with an Input Method Editor (IME). */
    /* CompleteClass */
    var queryTextCompositionLength: Double = js.native
    
    /** The starting location of the text that the user is composing with an Input Method Editor (IME). */
    /* CompleteClass */
    var queryTextCompositionStart: Double = js.native
  }
  
  /** Provides data for a querysubmitted event that is associated with a searchPane instance. */
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneQuerySubmittedEventArgs")
  @js.native
  abstract class SearchPaneQuerySubmittedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneQuerySubmittedEventArgs {
    
    /** The Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
    /* CompleteClass */
    var language: String = js.native
    
    /** An object that provides linguistic information about query text that the user is entering through an Input Method Editor (IME). */
    /* CompleteClass */
    var linguisticDetails: typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails = js.native
    
    /** The text that was submitted through the search pane. */
    /* CompleteClass */
    var queryText: String = js.native
  }
  
  /** Provides data for a resultsuggestionchosen event that is associated with a searchPane object. */
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneResultSuggestionChosenEventArgs")
  @js.native
  abstract class SearchPaneResultSuggestionChosenEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneResultSuggestionChosenEventArgs {
    
    /** The tag for the suggested result that the user selected. */
    /* CompleteClass */
    var tag: String = js.native
  }
  
  /** Stores suggestions and information about the request for suggestions. */
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneSuggestionsRequest")
  @js.native
  abstract class SearchPaneSuggestionsRequest ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequest {
    
    /**
      * Retrieves an object that lets an app respond to a request for suggestions asynchronously.
      * @return An object that lets an app signal when it has fulfilled the request for search suggestions.
      */
    /* CompleteClass */
    override def getDeferral(): typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestDeferral = js.native
    
    /** Indicates whether the request for suggestions to display is canceled. */
    /* CompleteClass */
    var isCanceled: Boolean = js.native
    
    /** The suggestions to display in the search pane for the current query. Apps provide suggestions to display by appending them to this searchSuggestionCollection object. */
    /* CompleteClass */
    var searchSuggestionCollection: typings.winrtUwp.Windows.ApplicationModel.Search.SearchSuggestionCollection = js.native
  }
  
  /** Enables the app to signal when it has finished populating a searchSuggestionCollection object while handling the suggestionsrequested event. Apps should use a deferral if and only if they need to respond to a request for suggestions asynchronously. */
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestDeferral")
  @js.native
  abstract class SearchPaneSuggestionsRequestDeferral ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestDeferral {
    
    /** Signals that the app has finished populating a searchSuggestionCollection object while handling the suggestionsrequested event. */
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  /** Provides data for a suggestionsrequested event that is associated with a searchPane object. */
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestedEventArgs")
  @js.native
  abstract class SearchPaneSuggestionsRequestedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestedEventArgs {
    
    /** The Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
    /* CompleteClass */
    var language: String = js.native
    
    /** An object that provides linguistic information about query text that the user is entering through an Input Method Editor (IME). */
    /* CompleteClass */
    var linguisticDetails: typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails = js.native
    
    /** The text that the app should provide suggestions for and that was in the search box when the suggestionsrequested event fired. */
    /* CompleteClass */
    var queryText: String = js.native
    
    /** An object that stores suggestions and information about the request. */
    /* CompleteClass */
    var request: typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequest = js.native
  }
  
  /** Provides data for a visibilitychanged event that is associated with a searchPane object. */
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneVisibilityChangedEventArgs")
  @js.native
  abstract class SearchPaneVisibilityChangedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Search.SearchPaneVisibilityChangedEventArgs {
    
    /** Indicates whether the search pane is open. */
    /* CompleteClass */
    var visible: Boolean = js.native
  }
  
  /** Provides information about query text that the user enters through an Input Method Editor (IME). */
  @JSGlobal("Windows.ApplicationModel.Search.SearchQueryLinguisticDetails")
  @js.native
  class SearchQueryLinguisticDetails protected ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Search.SearchQueryLinguisticDetails {
    /**
      * Initializes a new instance of the SearchQueryLinguisticDetails class.
      * @param queryTextAlternatives A list of the text alternatives for the current query text.
      * @param queryTextCompositionStart The starting location of the text that the user is composing with an IME.
      * @param queryTextCompositionLength The length of the portion of the query text that the user is composing with an IME.
      */
    def this(
      queryTextAlternatives: IIterable[String],
      queryTextCompositionStart: Double,
      queryTextCompositionLength: Double
    ) = this()
    
    /** A list of the text alternatives for the current query text. These alternatives account for uncomposed text the user is entering in an IME. */
    /* CompleteClass */
    var queryTextAlternatives: IVectorView[String] = js.native
    
    /** The length of the portion of the query text that the user is composing with an Input Method Editor (IME). */
    /* CompleteClass */
    var queryTextCompositionLength: Double = js.native
    
    /** The starting location of the text that the user is composing with an Input Method Editor (IME). */
    /* CompleteClass */
    var queryTextCompositionStart: Double = js.native
  }
  
  /** Represents a collection of search suggestions to be displayed in the search pane in response to a suggestionsrequested event. */
  @JSGlobal("Windows.ApplicationModel.Search.SearchSuggestionCollection")
  @js.native
  abstract class SearchSuggestionCollection ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Search.SearchSuggestionCollection {
    
    /**
      * Appends a query suggestion to the list of search suggestions for the search pane.
      * @param text The text of the query suggestion.
      */
    /* CompleteClass */
    override def appendQuerySuggestion(text: String): Unit = js.native
    
    /**
      * Appends a list of query suggestions to the list of search suggestions for the search pane.
      * @param suggestions The list of query suggestions.
      */
    /* CompleteClass */
    override def appendQuerySuggestions(suggestions: IIterable[String]): Unit = js.native
    
    /**
      * Appends a suggested search result to the list of suggestions to display in the search pane.
      * @param text The text of the suggested result.
      * @param detailText The detail text for the suggested result.
      * @param tag The unique tag that identifies this suggested result.
      * @param image The image to accompany the results suggestion.
      * @param imageAlternateText The alternate text for the image.
      */
    /* CompleteClass */
    override def appendResultSuggestion(
      text: String,
      detailText: String,
      tag: String,
      image: IRandomAccessStreamReference,
      imageAlternateText: String
    ): Unit = js.native
    
    /**
      * Appends a text label that is used to separate groups of suggestions in the search pane.
      * @param label The text to use as a separator. This text should be descriptive of any suggestions that are appended after it.
      */
    /* CompleteClass */
    override def appendSearchSeparator(label: String): Unit = js.native
    
    /** The number of suggestions in the collection. */
    /* CompleteClass */
    var size: Double = js.native
  }
  
  /** Stores suggestions and information about the request for suggestions. */
  @JSGlobal("Windows.ApplicationModel.Search.SearchSuggestionsRequest")
  @js.native
  abstract class SearchSuggestionsRequest ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Search.SearchSuggestionsRequest {
    
    /**
      * Gets an object that lets an app respond to a request for suggestions asynchronously.
      * @return An object that lets an app signal when it has fulfilled the request for search suggestions.
      */
    /* CompleteClass */
    override def getDeferral(): typings.winrtUwp.Windows.ApplicationModel.Search.SearchSuggestionsRequestDeferral = js.native
    
    /** Indicates whether the request for suggestions to display is canceled. */
    /* CompleteClass */
    var isCanceled: Boolean = js.native
    
    /** The suggestions to display in the search pane or in-app search box for the current query. Apps provide suggestions to display by appending them to this SearchSuggestionCollection object. */
    /* CompleteClass */
    var searchSuggestionCollection: typings.winrtUwp.Windows.ApplicationModel.Search.SearchSuggestionCollection = js.native
  }
  
  /** Enables the app to signal when it has finished populating a SearchSuggestionCollection object while handling the SuggestionsRequested event. Use a deferral if and only if your app needs to respond to a request for suggestions asynchronously. */
  @JSGlobal("Windows.ApplicationModel.Search.SearchSuggestionsRequestDeferral")
  @js.native
  abstract class SearchSuggestionsRequestDeferral ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Search.SearchSuggestionsRequestDeferral {
    
    /** Signals that the app has finished populating a SearchSuggestionCollection object while handling the SuggestionsRequested event. */
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
}
