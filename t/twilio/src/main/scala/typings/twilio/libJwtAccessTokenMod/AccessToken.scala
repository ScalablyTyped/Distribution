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
  
  /**
    * Adds a grant for a respective Twilio service to the access token
    * @param grant The grant to add
    */
  def addGrant[T /* <: Grant[Any, Any, Any] */](grant: T): Unit = js.native
  
  /**
    * Turns the access token instance into a JWT that can be used in the front-end
    * @param algorithm The algorithm to sign the JWT
    */
  def toJwt(): String = js.native
  def toJwt(algorithm: HS256 | HS384 | HS512): String = js.native
  
  @JSName("ttl")
  var ttl_AccessToken: Double = js.native
}
