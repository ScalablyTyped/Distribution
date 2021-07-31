package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio", "MonitorClient")
@js.native
class MonitorClient () extends Client {
  def this(sid: String) = this()
  def this(sid: String, tkn: String) = this()
  def this(sid: Unit, tkn: String) = this()
  def this(sid: String, tkn: String, options: ClientOptions) = this()
  def this(sid: String, tkn: Unit, options: ClientOptions) = this()
  def this(sid: Unit, tkn: String, options: ClientOptions) = this()
  def this(sid: Unit, tkn: Unit, options: ClientOptions) = this()
  
  var alerts: AlertResource = js.native
  
  var events: EventResource = js.native
}
