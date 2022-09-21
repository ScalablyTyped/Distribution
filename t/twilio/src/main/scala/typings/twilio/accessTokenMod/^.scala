package typings.twilio.accessTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio/lib/jwt/AccessToken", JSImport.Namespace)
@js.native
open class ^ protected ()
  extends StObject
     with AccessToken {
  /**
    * Creates new AccessToken instance
    *
    * @param accountSid - The account's unique ID to which access is scoped
    * @param keySid - The signing key's unique ID
    * @param secret - The secret to sign the token with
    * @param options - Options
    */
  def this(accountSid: String, keySid: String, secret: String) = this()
  def this(accountSid: String, keySid: String, secret: String, options: AccessTokenOptions) = this()
}
@JSImport("twilio/lib/jwt/AccessToken", JSImport.Namespace)
@js.native
object ^ extends StObject
