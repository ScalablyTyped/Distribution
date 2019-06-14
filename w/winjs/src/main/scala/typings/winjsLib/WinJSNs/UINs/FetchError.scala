package typings
package winjsLib.WinJSNs.UINs

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
  sealed trait doesNotExist
    extends winjsLib.WinJSNs.UINs.FetchError
  
  /**
    * The fetch operation timed out.
    **/
  @js.native
  sealed trait noResponse
    extends winjsLib.WinJSNs.UINs.FetchError
  
  /* 1 */ val doesNotExist: doesNotExist with scala.Double = js.native
  /* 0 */ val noResponse: noResponse with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.FetchError with scala.Double] = js.native
}

