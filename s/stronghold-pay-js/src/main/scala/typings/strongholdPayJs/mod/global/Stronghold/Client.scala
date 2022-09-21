package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Stronghold.Client")
@js.native
open class Client protected () extends StObject {
  def this(options: ClientOptions) = this()
  
  /* private */ var _currentFrame: Any = js.native
  
  /* private */ var _customerToken: Any = js.native
  
  var _environment: ENVIRONMENT = js.native
  
  var _host: String = js.native
  
  /* private */ var _onError: Any = js.native
  
  /* private */ var _onEvent: Any = js.native
  
  /* private */ var _onExit: Any = js.native
  
  /* private */ var _onReady: Any = js.native
  
  /* private */ var _publishableKey: Any = js.native
  
  /* private */ var addEventListener: Any = js.native
  
  def addPaymentSource(customerToken: String, options: AddPaymentSourceOptions): Unit = js.native
  
  /* private */ var buildFrame: Any = js.native
  
  def charge(customerToken: String, options: ChargeOptions): Unit = js.native
  
  /* private */ var cleanFrame: Any = js.native
  
  /* private */ var error: Any = js.native
  
  /* private */ var exit: Any = js.native
  
  /* private */ var isValidEvent: Any = js.native
  
  /* private */ var ready: Any = js.native
  
  /* private */ var setCustomerToken: Any = js.native
  
  /* private */ var setOptions: Any = js.native
  
  def tip(customerToken: String, options: TipOptions): Unit = js.native
  
  def updatePaymentSource(customerToken: String, options: UpdatePaymentSourceOptions): Unit = js.native
}
