package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IMErrorType extends js.Object
@JSImport("voximplant-websdk", "IMErrorType")
@js.native
object IMErrorType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IMErrorType with Double] = js.native
  
  @js.native
  sealed trait Error extends IMErrorType
  /* 1 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  @js.native
  sealed trait RemoteFunctionError extends IMErrorType
  /* 0 */ @js.native
  object RemoteFunctionError extends TopLevel[RemoteFunctionError with Double]
  
  @js.native
  sealed trait RosterError extends IMErrorType
  /* 2 */ @js.native
  object RosterError extends TopLevel[RosterError with Double]
}
