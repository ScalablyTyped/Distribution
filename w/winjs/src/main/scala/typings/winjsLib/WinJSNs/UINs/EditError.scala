package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditError extends js.Object

/**
  * Specifies the type of error that occurred during an edit operation on a IListDataSource or an IListDataAdapter.
  **/
@JSGlobal("WinJS.UI.EditError")
@js.native
object EditError extends js.Object {
  /**
    * The edit operation was canceled.
    **/
  @js.native
  sealed trait canceled
    extends winjsLib.WinJSNs.UINs.EditError
  
  /**
    * The item has changed.
    **/
  @js.native
  sealed trait noLongerMeaningful
    extends winjsLib.WinJSNs.UINs.EditError
  
  /**
    * The edit operation timed out.
    **/
  @js.native
  sealed trait noResponse
    extends winjsLib.WinJSNs.UINs.EditError
  
  /**
    * The data source cannot be written to.
    **/
  @js.native
  sealed trait notPermitted
    extends winjsLib.WinJSNs.UINs.EditError
  
  /* 1 */ val canceled: canceled with scala.Double = js.native
  /* 3 */ val noLongerMeaningful: noLongerMeaningful with scala.Double = js.native
  /* 0 */ val noResponse: noResponse with scala.Double = js.native
  /* 2 */ val notPermitted: notPermitted with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.EditError with scala.Double] = js.native
}

