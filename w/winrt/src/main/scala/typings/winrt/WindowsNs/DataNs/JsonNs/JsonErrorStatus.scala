package typings.winrt.WindowsNs.DataNs.JsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JsonErrorStatus extends js.Object

@JSGlobal("Windows.Data.Json.JsonErrorStatus")
@js.native
object JsonErrorStatus extends js.Object {
  @js.native
  sealed trait implementationLimit extends JsonErrorStatus
  
  @js.native
  sealed trait invalidJsonNumber extends JsonErrorStatus
  
  @js.native
  sealed trait invalidJsonString extends JsonErrorStatus
  
  @js.native
  sealed trait jsonValueNotFound extends JsonErrorStatus
  
  @js.native
  sealed trait unknown extends JsonErrorStatus
  
  /* 4 */ val implementationLimit: typings.winrt.WindowsNs.DataNs.JsonNs.JsonErrorStatus.implementationLimit with Double = js.native
  /* 2 */ val invalidJsonNumber: typings.winrt.WindowsNs.DataNs.JsonNs.JsonErrorStatus.invalidJsonNumber with Double = js.native
  /* 1 */ val invalidJsonString: typings.winrt.WindowsNs.DataNs.JsonNs.JsonErrorStatus.invalidJsonString with Double = js.native
  /* 3 */ val jsonValueNotFound: typings.winrt.WindowsNs.DataNs.JsonNs.JsonErrorStatus.jsonValueNotFound with Double = js.native
  /* 0 */ val unknown: typings.winrt.WindowsNs.DataNs.JsonNs.JsonErrorStatus.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JsonErrorStatus with Double] = js.native
}

