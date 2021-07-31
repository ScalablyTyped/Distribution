package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio", "Capability")
@js.native
class Capability () extends StObject {
  def this(sid: String) = this()
  def this(sid: String, tkn: String) = this()
  def this(sid: Unit, tkn: String) = this()
  
  var accountSid: String = js.native
  
  def allowClientIncoming(clientName: String): Capability = js.native
  
  def allowClientOutgoing(appSid: String): Capability = js.native
  def allowClientOutgoing(appSid: String, params: js.Any): Capability = js.native
  
  def allowEventStream(): Capability = js.native
  def allowEventStream(filters: js.Any): Capability = js.native
  
  var authToken: String = js.native
  
  var capabilities: js.Array[String] = js.native
  
  var clientName: String = js.native
  
  def generate(): String = js.native
  def generate(timeout: Double): String = js.native
  
  var outgoingScopeParams: js.Any = js.native
  
  var scopeParams: js.Any = js.native
}
