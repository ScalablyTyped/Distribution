package typings.twilio.libJwtAccessTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/jwt/AccessToken", JSImport.Namespace)
@js.native
open class ^ protected ()
  extends StObject
     with AccessToken {
  /**
    * @param accountSid - The account's unique ID to which access is scoped
    * @param keySid - The signing key's unique ID
    * @param secret - The secret to sign the token with
    * @param options - ...
    * @param options.ttl - Time to live in seconds (default 3600)
    * @param options.identity - The identity of the first person. Required.
    * @param options.nbf - Time from epoch in seconds for not before value
    * @param options.region - The region value associated with this account
    */
  def this(accountSid: String, keySid: String, secret: String, options: AccessTokenOptions) = this()
  
  /**
    * The identity of the first person. Required.
    */
  /* CompleteClass */
  var identity: String = js.native
}
@JSImport("twilio/lib/jwt/AccessToken", JSImport.Namespace)
@js.native
object ^ extends StObject
