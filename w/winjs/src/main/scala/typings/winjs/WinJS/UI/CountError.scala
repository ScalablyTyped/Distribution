package typings.winjs.WinJS.UI

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
  
}

