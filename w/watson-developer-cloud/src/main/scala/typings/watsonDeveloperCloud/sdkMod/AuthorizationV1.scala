package typings.watsonDeveloperCloud.sdkMod

import typings.watsonDeveloperCloud.v1Mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("watson-developer-cloud/sdk", "AuthorizationV1")
@js.native
class AuthorizationV1 protected () extends ^ {
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
  def this(options: js.Any) = this()
}

/* static members */
@JSImport("watson-developer-cloud/sdk", "AuthorizationV1")
@js.native
object AuthorizationV1 extends js.Object {
  var URL: String = js.native
}

