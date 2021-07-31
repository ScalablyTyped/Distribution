package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IMErrorType extends StObject
@JSImport("voximplant-websdk", "IMErrorType")
@js.native
object IMErrorType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IMErrorType & Double] = js.native
  
  @js.native
  sealed trait Error
    extends StObject
       with IMErrorType
  /* 1 */ val Error: typings.voximplantWebsdk.mod.IMErrorType.Error & Double = js.native
  
  @js.native
  sealed trait RemoteFunctionError
    extends StObject
       with IMErrorType
  /* 0 */ val RemoteFunctionError: typings.voximplantWebsdk.mod.IMErrorType.RemoteFunctionError & Double = js.native
  
  @js.native
  sealed trait RosterError
    extends StObject
       with IMErrorType
  /* 2 */ val RosterError: typings.voximplantWebsdk.mod.IMErrorType.RosterError & Double = js.native
}
