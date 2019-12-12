package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.actionRequired
import typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.networkTimeout
import typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.noActionRequired
import typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.operationNotSupported
import typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.otherLocalClient
import typings.winrt.Windows.Networking.NetworkOperators.UssdResultCode.terminated
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UssdResultCode with Double] = js.native
  /* 1 */ @js.native
  object actionRequired extends TopLevel[actionRequired with Double]
  
  /* 5 */ @js.native
  object networkTimeout extends TopLevel[networkTimeout with Double]
  
  /* 0 */ @js.native
  object noActionRequired extends TopLevel[noActionRequired with Double]
  
  /* 4 */ @js.native
  object operationNotSupported extends TopLevel[operationNotSupported with Double]
  
  /* 3 */ @js.native
  object otherLocalClient extends TopLevel[otherLocalClient with Double]
  
  /* 2 */ @js.native
  object terminated extends TopLevel[terminated with Double]
  
}

