package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the USSD response codes for messages sent to the network. */
@JSGlobal("Windows.Networking.NetworkOperators.UssdResultCode")
@js.native
object UssdResultCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.NetworkOperators.UssdResultCode & Double] = js.native
  
  /* 1 */ val actionRequired: typings.winrtUwp.Windows.Networking.NetworkOperators.UssdResultCode.actionRequired & Double = js.native
  
  /* 5 */ val networkTimeout: typings.winrtUwp.Windows.Networking.NetworkOperators.UssdResultCode.networkTimeout & Double = js.native
  
  /* 0 */ val noActionRequired: typings.winrtUwp.Windows.Networking.NetworkOperators.UssdResultCode.noActionRequired & Double = js.native
  
  /* 4 */ val operationNotSupported: typings.winrtUwp.Windows.Networking.NetworkOperators.UssdResultCode.operationNotSupported & Double = js.native
  
  /* 3 */ val otherLocalClient: typings.winrtUwp.Windows.Networking.NetworkOperators.UssdResultCode.otherLocalClient & Double = js.native
  
  /* 2 */ val terminated: typings.winrtUwp.Windows.Networking.NetworkOperators.UssdResultCode.terminated & Double = js.native
}
