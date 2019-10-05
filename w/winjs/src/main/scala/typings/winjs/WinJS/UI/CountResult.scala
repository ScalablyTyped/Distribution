package typings.winjs.WinJS.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CountResult extends js.Object

/**
  * Indicates whether the IListDataAdapter was able to provide a count.
  **/
@JSGlobal("WinJS.UI.CountResult")
@js.native
object CountResult extends js.Object {
  /**
    * Indicates no count is available.
    **/
  @js.native
  sealed trait unknown extends CountResult
  
  /* 0 */ val unknown: typings.winjs.WinJS.UI.CountResult.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CountResult with Double] = js.native
}

