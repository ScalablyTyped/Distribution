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
  
  val canceled: canceled with java.lang.String = js.native
  val noLongerMeaningful: noLongerMeaningful with java.lang.String = js.native
  val noResponse: noResponse with java.lang.String = js.native
  val notPermitted: notPermitted with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winjsLib.WinJSNs.UINs.EditError with java.lang.String] = js.native
}

