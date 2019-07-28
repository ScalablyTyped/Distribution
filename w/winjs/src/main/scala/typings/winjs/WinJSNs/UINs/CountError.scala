package typings.winjs.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CountError extends js.Object

/**
  * Indicates that the IListDataAdapter was unable to provide a count.
  **/
@JSGlobal("WinJS.UI.CountError")
@js.native
object CountError extends js.Object {
  /**
    * An attempt to count items timed out.
    **/
  @js.native
  sealed trait noResponse extends CountError
  
  /* 0 */ val noResponse: typings.winjs.WinJSNs.UINs.CountError.noResponse with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CountError with Double] = js.native
}

