package typings.watsonDeveloperCloud.sdkMod

import typings.watsonDeveloperCloud.authorizationV1Mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("watson-developer-cloud/sdk", "AuthorizationV1")
@js.native
open class AuthorizationV1 protected () extends ^ {
  /**
    * Authorization Service
    *
    * Generates temporary auth tokens for use in untrusted environments.
    * Tokens expire after one hour.
    *
    * @param {Object} options
    * @param {String} options.username
    * @param {String} options.password
    * @param {String} [options.url] url of the service for which auth tokens are being generated
    * @constructor
    */
  def this(options: Any) = this()
}
object AuthorizationV1 {
  
  @JSImport("watson-developer-cloud/sdk", "AuthorizationV1")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("watson-developer-cloud/sdk", "AuthorizationV1.URL")
  @js.native
  def URL: String = js.native
  inline def URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL")(x.asInstanceOf[js.Any])
}
