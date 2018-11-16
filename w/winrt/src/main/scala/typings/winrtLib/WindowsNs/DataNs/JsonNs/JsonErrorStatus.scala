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
  
  val implementationLimit: implementationLimit with java.lang.String = js.native
  val invalidJsonNumber: invalidJsonNumber with java.lang.String = js.native
  val invalidJsonString: invalidJsonString with java.lang.String = js.native
  val jsonValueNotFound: jsonValueNotFound with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.DataNs.JsonNs.JsonErrorStatus with java.lang.String] = js.native
}

