package typings.winrtUwp.Windows.ApplicationModel.Search.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SearchSuggestionKind extends js.Object

/** Specifies the type of a SearchSuggestion . */
@JSGlobal("Windows.ApplicationModel.Search.Core.SearchSuggestionKind")
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
  
}

