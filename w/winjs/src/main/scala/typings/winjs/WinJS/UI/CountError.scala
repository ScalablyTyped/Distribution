package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CountError with Double] = js.native
  /* 0 */ @js.native
  object noResponse extends TopLevel[noResponse with Double]
  
}

