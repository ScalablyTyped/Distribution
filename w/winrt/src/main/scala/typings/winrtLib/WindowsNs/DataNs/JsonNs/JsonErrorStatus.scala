package typings
package winrtLib.WindowsNs.DataNs.JsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JsonErrorStatus extends js.Object

@JSGlobal("Windows.Data.Json.JsonErrorStatus")
@js.native
object JsonErrorStatus extends js.Object {
  @js.native
  sealed trait implementationLimit
    extends winrtLib.WindowsNs.DataNs.JsonNs.JsonErrorStatus
  
  @js.native
  sealed trait invalidJsonNumber
    extends winrtLib.WindowsNs.DataNs.JsonNs.JsonErrorStatus
  
  @js.native
  sealed trait invalidJsonString
    extends winrtLib.WindowsNs.DataNs.JsonNs.JsonErrorStatus
  
  @js.native
  sealed trait jsonValueNotFound
    extends winrtLib.WindowsNs.DataNs.JsonNs.JsonErrorStatus
  
  @js.native
  sealed trait unknown
    extends winrtLib.WindowsNs.DataNs.JsonNs.JsonErrorStatus
  
  /* 4 */ val implementationLimit: implementationLimit with scala.Double = js.native
  /* 2 */ val invalidJsonNumber: invalidJsonNumber with scala.Double = js.native
  /* 1 */ val invalidJsonString: invalidJsonString with scala.Double = js.native
  /* 3 */ val jsonValueNotFound: jsonValueNotFound with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.DataNs.JsonNs.JsonErrorStatus with scala.Double] = js.native
}

