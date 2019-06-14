package typings
package winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UssdResultCode extends js.Object

@JSGlobal("Windows.Networking.NetworkOperators.UssdResultCode")
@js.native
object UssdResultCode extends js.Object {
  @js.native
  sealed trait actionRequired
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UssdResultCode
  
  @js.native
  sealed trait networkTimeout
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UssdResultCode
  
  @js.native
  sealed trait noActionRequired
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UssdResultCode
  
  @js.native
  sealed trait operationNotSupported
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UssdResultCode
  
  @js.native
  sealed trait otherLocalClient
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UssdResultCode
  
  @js.native
  sealed trait terminated
    extends winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UssdResultCode
  
  /* 1 */ val actionRequired: actionRequired with scala.Double = js.native
  /* 5 */ val networkTimeout: networkTimeout with scala.Double = js.native
  /* 0 */ val noActionRequired: noActionRequired with scala.Double = js.native
  /* 4 */ val operationNotSupported: operationNotSupported with scala.Double = js.native
  /* 3 */ val otherLocalClient: otherLocalClient with scala.Double = js.native
  /* 2 */ val terminated: terminated with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UssdResultCode with scala.Double
  ] = js.native
}

