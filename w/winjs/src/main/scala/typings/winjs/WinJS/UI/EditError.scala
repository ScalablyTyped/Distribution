package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EditError extends StObject
/**
  * Specifies the type of error that occurred during an edit operation on a IListDataSource or an IListDataAdapter.
  **/
@JSGlobal("WinJS.UI.EditError")
@js.native
object EditError extends StObject {
  
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
