package typings.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UssdResultCode extends js.Object

@JSGlobal("Windows.Networking.NetworkOperators.UssdResultCode")
@js.native
object UssdResultCode extends js.Object {
  @js.native
  sealed trait actionRequired extends UssdResultCode
  
  @js.native
  sealed trait networkTimeout extends UssdResultCode
  
  @js.native
  sealed trait noActionRequired extends UssdResultCode
  
  @js.native
  sealed trait operationNotSupported extends UssdResultCode
  
  @js.native
  sealed trait otherLocalClient extends UssdResultCode
  
  @js.native
  sealed trait terminated extends UssdResultCode
  
  /* 1 */ val actionRequired: typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.actionRequired with Double = js.native
  /* 5 */ val networkTimeout: typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.networkTimeout with Double = js.native
  /* 0 */ val noActionRequired: typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.noActionRequired with Double = js.native
  /* 4 */ val operationNotSupported: typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.operationNotSupported with Double = js.native
  /* 3 */ val otherLocalClient: typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.otherLocalClient with Double = js.native
  /* 2 */ val terminated: typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.terminated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UssdResultCode with Double] = js.native
}

