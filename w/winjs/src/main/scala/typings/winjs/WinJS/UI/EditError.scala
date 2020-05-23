package typings.winjs.WinJS.UI

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
  
}

