package typings
package winjsLib.WinJSNs.UINs

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
  sealed trait unknown
    extends winjsLib.WinJSNs.UINs.CountResult
  
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.CountResult with scala.Double] = js.native
}

