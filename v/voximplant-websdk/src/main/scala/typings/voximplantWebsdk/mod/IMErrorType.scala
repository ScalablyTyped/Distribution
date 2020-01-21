package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IMErrorType extends js.Object

@JSImport("voximplant-websdk", "IMErrorType")
@js.native
object IMErrorType extends js.Object {
  @js.native
  sealed trait Error extends IMErrorType
  
  @js.native
  sealed trait RemoteFunctionError extends IMErrorType
  
  @js.native
  sealed trait RosterError extends IMErrorType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IMErrorType with Double] = js.native
  /* 1 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 0 */ @js.native
  object RemoteFunctionError extends TopLevel[RemoteFunctionError with Double]
  
  /* 2 */ @js.native
  object RosterError extends TopLevel[RosterError with Double]
  
}

