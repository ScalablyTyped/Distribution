package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.TopLevel
import typings.winjs.WinJS.UI.EditError.canceled
import typings.winjs.WinJS.UI.EditError.noLongerMeaningful
import typings.winjs.WinJS.UI.EditError.noResponse
import typings.winjs.WinJS.UI.EditError.notPermitted
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EditError with Double] = js.native
  /* 1 */ @js.native
  object canceled extends TopLevel[canceled with Double]
  
  /* 3 */ @js.native
  object noLongerMeaningful extends TopLevel[noLongerMeaningful with Double]
  
  /* 0 */ @js.native
  object noResponse extends TopLevel[noResponse with Double]
  
  /* 2 */ @js.native
  object notPermitted extends TopLevel[notPermitted with Double]
  
}

