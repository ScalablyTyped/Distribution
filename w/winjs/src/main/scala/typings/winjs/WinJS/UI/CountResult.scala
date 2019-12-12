package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.TopLevel
import typings.winjs.WinJS.UI.CountResult.unknown
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CountResult with Double] = js.native
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

