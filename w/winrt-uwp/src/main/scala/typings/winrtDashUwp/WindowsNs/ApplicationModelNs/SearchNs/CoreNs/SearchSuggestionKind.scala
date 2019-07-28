package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.SearchNs.CoreNs

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
  
  /* 0 */ val query: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.SearchNs.CoreNs.SearchSuggestionKind.query with Double = js.native
  /* 1 */ val result: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.SearchNs.CoreNs.SearchSuggestionKind.result with Double = js.native
  /* 2 */ val separator: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.SearchNs.CoreNs.SearchSuggestionKind.separator with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SearchSuggestionKind with Double] = js.native
}

