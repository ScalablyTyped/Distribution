package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Stronghold.Client")
@js.native
class Client protected () extends StObject {
  def this(options: ClientOptions) = this()
  
  /* private */ var _currentFrame: js.Any = js.native
  
  /* private */ var _customerToken: js.Any = js.native
  
  var _environment: ENVIRONMENT = js.native
  
  var _host: String = js.native
  
  /* private */ var _onError: js.Any = js.native
  
  /* private */ var _onEvent: js.Any = js.native
  
  /* private */ var _onExit: js.Any = js.native
  
  /* private */ var _onReady: js.Any = js.native
  
  /* private */ var _publishableKey: js.Any = js.native
  
  /* private */ var addEventListener: js.Any = js.native
  
  def addPaymentSource(customerToken: String, options: AddPaymentSourceOptions): Unit = js.native
  
  /* private */ var buildFrame: js.Any = js.native
  
  def charge(customerToken: String, options: ChargeOptions): Unit = js.native
  
  /* private */ var cleanFrame: js.Any = js.native
  
  /* private */ var error: js.Any = js.native
  
  /* private */ var exit: js.Any = js.native
  
  /* private */ var isValidEvent: js.Any = js.native
  
  /* private */ var ready: js.Any = js.native
  
  /* private */ var setCustomerToken: js.Any = js.native
  
  /* private */ var setOptions: js.Any = js.native
  
  def tip(customerToken: String, options: TipOptions): Unit = js.native
  
  def updatePaymentSource(customerToken: String, options: UpdatePaymentSourceOptions): Unit = js.native
}
