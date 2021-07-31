package typings.twilio.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio", "Client")
@js.native
class Client () extends StObject {
  def this(sid: String) = this()
  def this(sid: String, tkn: String) = this()
  def this(sid: Unit, tkn: String) = this()
  def this(sid: String, tkn: String, host: String) = this()
  def this(sid: String, tkn: Unit, host: String) = this()
  def this(sid: Unit, tkn: String, host: String) = this()
  def this(sid: Unit, tkn: Unit, host: String) = this()
  def this(sid: String, tkn: String, host: String, api_version: String) = this()
  def this(sid: String, tkn: String, host: Unit, api_version: String) = this()
  def this(sid: String, tkn: Unit, host: String, api_version: String) = this()
  def this(sid: String, tkn: Unit, host: Unit, api_version: String) = this()
  def this(sid: Unit, tkn: String, host: String, api_version: String) = this()
  def this(sid: Unit, tkn: String, host: Unit, api_version: String) = this()
  def this(sid: Unit, tkn: Unit, host: String, api_version: String) = this()
  def this(sid: Unit, tkn: Unit, host: Unit, api_version: String) = this()
  def this(sid: String, tkn: String, host: String, api_version: String, timeout: Double) = this()
  def this(sid: String, tkn: String, host: String, api_version: Unit, timeout: Double) = this()
  def this(sid: String, tkn: String, host: Unit, api_version: String, timeout: Double) = this()
  def this(sid: String, tkn: String, host: Unit, api_version: Unit, timeout: Double) = this()
  def this(sid: String, tkn: Unit, host: String, api_version: String, timeout: Double) = this()
  def this(sid: String, tkn: Unit, host: String, api_version: Unit, timeout: Double) = this()
  def this(sid: String, tkn: Unit, host: Unit, api_version: String, timeout: Double) = this()
  def this(sid: String, tkn: Unit, host: Unit, api_version: Unit, timeout: Double) = this()
  def this(sid: Unit, tkn: String, host: String, api_version: String, timeout: Double) = this()
  def this(sid: Unit, tkn: String, host: String, api_version: Unit, timeout: Double) = this()
  def this(sid: Unit, tkn: String, host: Unit, api_version: String, timeout: Double) = this()
  def this(sid: Unit, tkn: String, host: Unit, api_version: Unit, timeout: Double) = this()
  def this(sid: Unit, tkn: Unit, host: String, api_version: String, timeout: Double) = this()
  def this(sid: Unit, tkn: Unit, host: String, api_version: Unit, timeout: Double) = this()
  def this(sid: Unit, tkn: Unit, host: Unit, api_version: String, timeout: Double) = this()
  def this(sid: Unit, tkn: Unit, host: Unit, api_version: Unit, timeout: Double) = this()
  
  var accountSid: String = js.native
  
  var apiVersion: String = js.native
  
  var authToken: String = js.native
  
  def getBaseUrl(): String = js.native
  
  var host: String = js.native
  
  def request(options: ClientRequestOptions): Promise[js.Any] = js.native
  def request(options: ClientRequestOptions, callback: RequestCallback): Promise[js.Any] = js.native
  
  var timeout: Double = js.native
}
