package typings.winrt.global.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.ApplicationModel.Search")
@js.native
object Search extends js.Object {
  
  @js.native
  class LocalContentSuggestionSettings ()
    extends typings.winrt.Windows.ApplicationModel.Search.LocalContentSuggestionSettings
  
  @js.native
  class SearchPane ()
    extends typings.winrt.Windows.ApplicationModel.Search.SearchPane
  /* static members */
  @js.native
  object SearchPane extends js.Object {
    
    def getForCurrentView(): typings.winrt.Windows.ApplicationModel.Search.SearchPane = js.native
  }
  
  @js.native
  class SearchPaneQueryChangedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Search.SearchPaneQueryChangedEventArgs
  
  @js.native
  class SearchPaneQueryLinguisticDetails ()
    extends typings.winrt.Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails
  
  @js.native
  class SearchPaneQuerySubmittedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Search.SearchPaneQuerySubmittedEventArgs
  
  @js.native
  class SearchPaneResultSuggestionChosenEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Search.SearchPaneResultSuggestionChosenEventArgs
  
  @js.native
  class SearchPaneSuggestionsRequest ()
    extends typings.winrt.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequest
  
  @js.native
  class SearchPaneSuggestionsRequestDeferral ()
    extends typings.winrt.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestDeferral
  
  @js.native
  class SearchPaneSuggestionsRequestedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Search.SearchPaneSuggestionsRequestedEventArgs
  
  @js.native
  class SearchPaneVisibilityChangedEventArgs ()
    extends typings.winrt.Windows.ApplicationModel.Search.SearchPaneVisibilityChangedEventArgs
  
  @js.native
  class SearchSuggestionCollection ()
    extends typings.winrt.Windows.ApplicationModel.Search.SearchSuggestionCollection
}
