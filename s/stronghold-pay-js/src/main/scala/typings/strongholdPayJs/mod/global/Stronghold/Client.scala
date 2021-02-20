package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Stronghold.Client")
@js.native
class Client protected () extends StObject {
  def this(options: ClientOptions) = this()
  
  var _currentFrame: js.Any = js.native
  
  var _customerToken: js.Any = js.native
  
  var _environment: ENVIRONMENT = js.native
  
  var _host: String = js.native
  
  var _onError: js.Any = js.native
  
  var _onEvent: js.Any = js.native
  
  var _onExit: js.Any = js.native
  
  var _onReady: js.Any = js.native
  
  var _publishableKey: js.Any = js.native
  
  var addEventListener: js.Any = js.native
  
  def addPaymentSource(customerToken: String, options: AddPaymentSourceOptions): Unit = js.native
  
  var buildFrame: js.Any = js.native
  
  def charge(customerToken: String, options: ChargeOptions): Unit = js.native
  
  var cleanFrame: js.Any = js.native
  
  var error: js.Any = js.native
  
  var exit: js.Any = js.native
  
  var isValidEvent: js.Any = js.native
  
  var ready: js.Any = js.native
  
  var setCustomerToken: js.Any = js.native
  
  var setOptions: js.Any = js.native
  
  def tip(customerToken: String, options: TipOptions): Unit = js.native
  
  def updatePaymentSource(customerToken: String, options: UpdatePaymentSourceOptions): Unit = js.native
}
