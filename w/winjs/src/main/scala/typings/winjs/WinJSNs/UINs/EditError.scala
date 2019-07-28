package typings.winjs.WinJSNs.UINs

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
  sealed trait canceled extends EditError
  
  /**
    * The item has changed.
    **/
  @js.native
  sealed trait noLongerMeaningful extends EditError
  
  /**
    * The edit operation timed out.
    **/
  @js.native
  sealed trait noResponse extends EditError
  
  /**
    * The data source cannot be written to.
    **/
  @js.native
  sealed trait notPermitted extends EditError
  
  /* 1 */ val canceled: typings.winjs.WinJSNs.UINs.EditError.canceled with Double = js.native
  /* 3 */ val noLongerMeaningful: typings.winjs.WinJSNs.UINs.EditError.noLongerMeaningful with Double = js.native
  /* 0 */ val noResponse: typings.winjs.WinJSNs.UINs.EditError.noResponse with Double = js.native
  /* 2 */ val notPermitted: typings.winjs.WinJSNs.UINs.EditError.notPermitted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditError with Double] = js.native
}

