package typings.winrt.global.Windows.ApplicationModel

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Storage.StorageFolder
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Search")
@js.native
object Search extends js.Object {
  @js.native
  class LocalContentSuggestionSettings ()
    extends typings.winrt.Windows.ApplicationModel.Search.LocalContentSuggestionSettings {
    /* CompleteClass */
    override var aqsFilter: String = js.native
    /* CompleteClass */
    override var enabled: Boolean = js.native
    /* CompleteClass */
    override var locations: IVector[StorageFolder] = js.native
    /* CompleteClass */
    override var propertiesToMatch: IVector[String] = js.native
  }
  
  @js.native
  class SearchPane ()
    extends typings.winrt.Windows.ApplicationModel.Search.SearchPane
  
  @js.native
  class SearchPaneQueryChangedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Search.SearchPaneQueryChangedEventArgs {
    /* CompleteClass */
    override var language: String = js.native
    /* CompleteClass */
    override var linguisticDetails: typings.winrt.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails = js.native
    /* CompleteClass */
    override var queryText: String = js.native
  }
  
  @js.native
  class SearchPaneQueryLinguisticDetails ()
    extends typings.winrt.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails {
    /* CompleteClass */
    override var queryTextAlternatives: IVectorView[String] = js.native
    /* CompleteClass */
    override var queryTextCompositionLength: Double = js.native
    /* CompleteClass */
    override var queryTextCompositionStart: Double = js.native
  }
  
  @js.native
  class SearchPaneQuerySubmittedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Search.SearchPaneQuerySubmittedEventArgs {
    /* CompleteClass */
    override var language: String = js.native
    /* CompleteClass */
    override var queryText: String = js.native
  }
  
  @js.native
  class SearchPaneResultSuggestionChosenEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Search.SearchPaneResultSuggestionChosenEventArgs {
    /* CompleteClass */
    override var tag: String = js.native
  }
  
  @js.native
  class SearchPaneSuggestionsRequest ()
    extends typings.winrt.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequest {
    /* CompleteClass */
    override var isCanceled: Boolean = js.native
    /* CompleteClass */
    override var searchSuggestionCollection: typings.winrt.Windows.ApplicationModel.Search.SearchSuggestionCollection = js.native
    /* CompleteClass */
    override def getDeferral(): typings.winrt.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestDeferral = js.native
  }
  
  @js.native
  class SearchPaneSuggestionsRequestDeferral ()
    extends typings.winrt.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestDeferral {
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  @js.native
  class SearchPaneSuggestionsRequestedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestedEventArgs {
    /* CompleteClass */
    override var language: String = js.native
    /* CompleteClass */
    override var linguisticDetails: typings.winrt.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails = js.native
    /* CompleteClass */
    override var queryText: String = js.native
    /* CompleteClass */
    override var request: typings.winrt.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequest = js.native
  }
  
  @js.native
  class SearchPaneVisibilityChangedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Search.SearchPaneVisibilityChangedEventArgs {
    /* CompleteClass */
    override var visible: Boolean = js.native
  }
  
  @js.native
  class SearchSuggestionCollection ()
    extends typings.winrt.Windows.ApplicationModel.Search.SearchSuggestionCollection {
    /* CompleteClass */
    override var size: Double = js.native
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
  }
  
  /* static members */
  @js.native
  object SearchPane extends js.Object {
    def getForCurrentView(): typings.winrt.Windows.ApplicationModel.Search.SearchPane = js.native
  }
  
}

