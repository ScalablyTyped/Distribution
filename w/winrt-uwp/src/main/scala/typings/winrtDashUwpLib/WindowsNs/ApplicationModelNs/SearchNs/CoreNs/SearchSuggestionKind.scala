package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.SearchNs.CoreNs

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
  sealed trait query
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.SearchNs.CoreNs.SearchSuggestionKind
  
  /** The suggestion is a result suggestion. */
  @js.native
  sealed trait result
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.SearchNs.CoreNs.SearchSuggestionKind
  
  /** Represents a separator between search suggestions that's useful for grouping. */
  @js.native
  sealed trait separator
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.SearchNs.CoreNs.SearchSuggestionKind
  
  /* 0 */ val query: query with scala.Double = js.native
  /* 1 */ val result: result with scala.Double = js.native
  /* 2 */ val separator: separator with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.SearchNs.CoreNs.SearchSuggestionKind with scala.Double
  ] = js.native
}

