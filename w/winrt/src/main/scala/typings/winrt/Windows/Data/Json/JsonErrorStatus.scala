package typings.winrt.Windows.Data.Json

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[JsonErrorStatus with Double] = js.native
  /* 4 */ @js.native
  object implementationLimit extends TopLevel[implementationLimit with Double]
  
  /* 2 */ @js.native
  object invalidJsonNumber extends TopLevel[invalidJsonNumber with Double]
  
  /* 1 */ @js.native
  object invalidJsonString extends TopLevel[invalidJsonString with Double]
  
  /* 3 */ @js.native
  object jsonValueNotFound extends TopLevel[jsonValueNotFound with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

