package typings.winrt.global.Windows.ApplicationModel

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Storage.StorageFolder
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Search {
  
  @JSGlobal("Windows.ApplicationModel.Search.LocalContentSuggestionSettings")
  @js.native
  class LocalContentSuggestionSettings ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Search.LocalContentSuggestionSettings {
    
    /* CompleteClass */
    var aqsFilter: String = js.native
    
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /* CompleteClass */
    var locations: IVector[StorageFolder] = js.native
    
    /* CompleteClass */
    var propertiesToMatch: IVector[String] = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Search.SearchPane")
  @js.native
  class SearchPane ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Search.SearchPane
  /* static members */
  object SearchPane {
    
    @JSGlobal("Windows.ApplicationModel.Search.SearchPane")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getForCurrentView(): typings.winrt.Windows.ApplicationModel.Search.SearchPane = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrt.Windows.ApplicationModel.Search.SearchPane]
  }
  
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneQueryChangedEventArgs")
  @js.native
  class SearchPaneQueryChangedEventArgs ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Search.SearchPaneQueryChangedEventArgs {
    
    /* CompleteClass */
    var language: String = js.native
    
    /* CompleteClass */
    var linguisticDetails: typings.winrt.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails = js.native
    
    /* CompleteClass */
    var queryText: String = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails")
  @js.native
  class SearchPaneQueryLinguisticDetails ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails {
    
    /* CompleteClass */
    var queryTextAlternatives: IVectorView[String] = js.native
    
    /* CompleteClass */
    var queryTextCompositionLength: Double = js.native
    
    /* CompleteClass */
    var queryTextCompositionStart: Double = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneQuerySubmittedEventArgs")
  @js.native
  class SearchPaneQuerySubmittedEventArgs ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Search.SearchPaneQuerySubmittedEventArgs {
    
    /* CompleteClass */
    var language: String = js.native
    
    /* CompleteClass */
    var queryText: String = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneResultSuggestionChosenEventArgs")
  @js.native
  class SearchPaneResultSuggestionChosenEventArgs ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Search.SearchPaneResultSuggestionChosenEventArgs {
    
    /* CompleteClass */
    var tag: String = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneSuggestionsRequest")
  @js.native
  class SearchPaneSuggestionsRequest ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequest {
    
    /* CompleteClass */
    override def getDeferral(): typings.winrt.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestDeferral = js.native
    
    /* CompleteClass */
    var isCanceled: Boolean = js.native
    
    /* CompleteClass */
    var searchSuggestionCollection: typings.winrt.Windows.ApplicationModel.Search.SearchSuggestionCollection = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestDeferral")
  @js.native
  class SearchPaneSuggestionsRequestDeferral ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestDeferral {
    
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestedEventArgs")
  @js.native
  class SearchPaneSuggestionsRequestedEventArgs ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestedEventArgs {
    
    /* CompleteClass */
    var language: String = js.native
    
    /* CompleteClass */
    var linguisticDetails: typings.winrt.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails = js.native
    
    /* CompleteClass */
    var queryText: String = js.native
    
    /* CompleteClass */
    var request: typings.winrt.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequest = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Search.SearchPaneVisibilityChangedEventArgs")
  @js.native
  class SearchPaneVisibilityChangedEventArgs ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Search.SearchPaneVisibilityChangedEventArgs {
    
    /* CompleteClass */
    var visible: Boolean = js.native
  }
  
  @JSGlobal("Windows.ApplicationModel.Search.SearchSuggestionCollection")
  @js.native
  class SearchSuggestionCollection ()
    extends StObject
       with typings.winrt.Windows.ApplicationModel.Search.SearchSuggestionCollection {
    
    /* CompleteClass */
    override def appendQuerySuggestion(text: String): Unit = js.native
    
    /* CompleteClass */
    override def appendQuerySuggestions(suggestions: IIterable[String]): Unit = js.native
    
    /* CompleteClass */
    override def appendResultSuggestion(
      text: String,
      detailText: String,
      tag: String,
      image: IRandomAccessStreamReference,
      imageAlternateText: String
    ): Unit = js.native
    
    /* CompleteClass */
    override def appendSearchSeparator(label: String): Unit = js.native
    
    /* CompleteClass */
    var size: Double = js.native
  }
}
