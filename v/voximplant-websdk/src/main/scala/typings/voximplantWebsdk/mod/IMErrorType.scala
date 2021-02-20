package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IMErrorType extends StObject
@JSImport("voximplant-websdk", "IMErrorType")
@js.native
object IMErrorType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IMErrorType with Double] = js.native
  
  @js.native
  sealed trait Error extends IMErrorType
  /* 1 */ val Error: typings.voximplantWebsdk.mod.IMErrorType.Error with Double = js.native
  
  @js.native
  sealed trait RemoteFunctionError extends IMErrorType
  /* 0 */ val RemoteFunctionError: typings.voximplantWebsdk.mod.IMErrorType.RemoteFunctionError with Double = js.native
  
  @js.native
  sealed trait RosterError extends IMErrorType
  /* 2 */ val RosterError: typings.voximplantWebsdk.mod.IMErrorType.RosterError with Double = js.native
}
