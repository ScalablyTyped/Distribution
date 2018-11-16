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
  
  val actionRequired: actionRequired with java.lang.String = js.native
  val networkTimeout: networkTimeout with java.lang.String = js.native
  val noActionRequired: noActionRequired with java.lang.String = js.native
  val operationNotSupported: operationNotSupported with java.lang.String = js.native
  val otherLocalClient: otherLocalClient with java.lang.String = js.native
  val terminated: terminated with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.NetworkingNs.NetworkOperatorsNs.UssdResultCode with java.lang.String
  ] = js.native
}

