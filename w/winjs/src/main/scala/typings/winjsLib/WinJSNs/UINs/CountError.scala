package typings
package winjsLib.WinJSNs.UINs

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
  sealed trait noResponse
    extends winjsLib.WinJSNs.UINs.CountError
  
  val noResponse: noResponse with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winjsLib.WinJSNs.UINs.CountError with java.lang.String] = js.native
}

