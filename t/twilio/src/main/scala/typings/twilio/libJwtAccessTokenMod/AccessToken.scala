package typings.twilio.libJwtAccessTokenMod

import typings.twilio.twilioStrings.HS256
import typings.twilio.twilioStrings.HS384
import typings.twilio.twilioStrings.HS512
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessToken
  extends StObject
     with AccessTokenOptions {
  
  var accountSid: String = js.native
  
  def addGrant[T /* <: Grant[Any, Any, Any] */](grant: T): Unit = js.native
  
  var grants: js.Array[Grant[Any, Any, Any]] = js.native
  
  var keySid: String = js.native
  
  var secret: String = js.native
  
  def toJwt(): String = js.native
  def toJwt(algorithm: HS256 | HS384 | HS512): String = js.native
  
  @JSName("ttl")
  var ttl_AccessToken: Double = js.native
}
