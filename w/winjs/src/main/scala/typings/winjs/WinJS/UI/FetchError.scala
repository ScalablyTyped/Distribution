package typings.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FetchError extends js.Object

/**
  * Specifies the type of error encountered when retrieving items from an IListDataAdapter.
  **/
@JSGlobal("WinJS.UI.FetchError")
@js.native
object FetchError extends js.Object {
  /**
    * The specified item could not be located.
    **/
  @js.native
  sealed trait doesNotExist extends FetchError
  
  /**
    * The fetch operation timed out.
    **/
  @js.native
  sealed trait noResponse extends FetchError
  
  /* 1 */ val doesNotExist: typings.winjs.WinJS.UI.FetchError.doesNotExist with Double = js.native
  /* 0 */ val noResponse: typings.winjs.WinJS.UI.FetchError.noResponse with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FetchError with Double] = js.native
}

