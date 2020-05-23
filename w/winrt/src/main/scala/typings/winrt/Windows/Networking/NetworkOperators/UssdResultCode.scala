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
  
}

