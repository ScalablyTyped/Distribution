package typings.winrtUwp.global.Windows.ApplicationModel.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to search suggestions for the in-app SearchBox control and the search pane. */
@JSGlobal("Windows.ApplicationModel.Search.Core")
@js.native
object Core extends js.Object {
  
  /** Provides data for the RequestingFocusOnKeyboardInput event. */
  @js.native
  abstract class RequestingFocusOnKeyboardInputEventArgs ()
    extends typings.winrtUwp.Windows.ApplicationModel.Search.Core.RequestingFocusOnKeyboardInputEventArgs
  
  /** Enables access to the search suggestions that the SearchSuggestionManager provides. */
  @js.native
  abstract class SearchSuggestion ()
    extends typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestion
  
  /** Specifies the type of a SearchSuggestion . */
  @js.native
  object SearchSuggestionKind extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionKind with Double
      ] = js.native
    
    /* 0 */ val query: typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionKind.query with Double = js.native
    
    /* 1 */ val result: typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionKind.result with Double = js.native
    
    /* 2 */ val separator: typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionKind.separator with Double = js.native
  }
  
  /** Manages access to search suggestions for the in-app SearchBox control. */
  @js.native
  /** Initializes a new instance of the SearchSuggestionManager class. */
  class SearchSuggestionManager ()
    extends typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionManager
  
  /** Provides data for the SuggestionsRequested event. */
  @js.native
  abstract class SearchSuggestionsRequestedEventArgs ()
    extends typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionsRequestedEventArgs
}
