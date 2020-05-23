package typings.winrtUwp.global.Windows.ApplicationModel.Search

import typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionKind
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    extends typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestion {
    /** Gets the value that was passed to the detailText parameter of the AppendResultSuggestion method. */
    /* CompleteClass */
    override var detailText: String = js.native
    /** Gets the value that was passed to the image parameter of the AppendResultSuggestion method. */
    /* CompleteClass */
    override var image: IRandomAccessStreamReference = js.native
    /** Gets the value that was passed to the imageAlternateText parameter of the AppendResultSuggestion method. */
    /* CompleteClass */
    override var imageAlternateText: String = js.native
    /** Gets the type of suggestion. */
    /* CompleteClass */
    override var kind: SearchSuggestionKind = js.native
    /** Gets the value that was passed to the tag parameter of the AppendResultSuggestion method. */
    /* CompleteClass */
    override var tag: String = js.native
    /** Gets the localized text of the suggestion for display in the search suggestions UI. */
    /* CompleteClass */
    override var text: String = js.native
  }
  
  /** Manages access to search suggestions for the in-app SearchBox control. */
  @js.native
  /** Initializes a new instance of the SearchSuggestionManager class. */
  class SearchSuggestionManager ()
    extends typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionManager
  
  /** Provides data for the SuggestionsRequested event. */
  @js.native
  abstract class SearchSuggestionsRequestedEventArgs ()
    extends typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionsRequestedEventArgs {
    /** Gets the Internet Engineering Task Force (IETF) language tag (BCP 47 standard) that identifies the language currently associated with the user's text input device. */
    /* CompleteClass */
    override var language: String = js.native
    /** Gets an object that provides linguistic information about query text that the user is entering through an Input Method Editor (IME). */
    /* CompleteClass */
    override var linguisticDetails: typings.winrtUwp.Windows.ApplicationModel.Search.SearchQueryLinguisticDetails = js.native
    /** The text that the app should provide suggestions for and that was in the search box when the SuggestionsRequested event was raised. */
    /* CompleteClass */
    override var queryText: String = js.native
    /** Gets an object that stores suggestions and information about the request. */
    /* CompleteClass */
    override var request: typings.winrtUwp.Windows.ApplicationModel.Search.SearchSuggestionsRequest = js.native
  }
  
  /** Specifies the type of a SearchSuggestion . */
  @js.native
  object SearchSuggestionKind extends js.Object {
    /* 0 */ val query: typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionKind.query with Double = js.native
    /* 1 */ val result: typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionKind.result with Double = js.native
    /* 2 */ val separator: typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionKind.separator with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.ApplicationModel.Search.Core.SearchSuggestionKind with Double
      ] = js.native
  }
  
}

