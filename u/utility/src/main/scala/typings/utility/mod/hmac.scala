package typings.utility.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("utility", "hmac")
@js.native
object hmac extends js.Object {
  
  /**
    * HMAC algorithm.
    *
    * Equal bash:
    *
    * ```bash
    * $ echo -n "$data" | openssl dgst -binary -$algorithm -hmac "$key" | openssl $encoding
    * ```
    *
    * @param {String} algorithm, dependent on the available algorithms supported by the version of OpenSSL on the platform.
    *   Examples are 'sha1', 'md5', 'sha256', 'sha512', etc.
    *   On recent releases, `openssl list-message-digest-algorithms` will display the available digest algorithms.
    * @param {String} key, the hmac key to be used.
    * @param {String|Buffer} data, content string.
    * @param {String} [encoding='base64']
    * @return {String} digest string.
    */
  def apply(algorithm: String, key: String, data: String): String = js.native
  def apply(algorithm: String, key: String, data: String, encoding: String): String = js.native
  def apply(algorithm: String, key: String, data: Buffer): String = js.native
  def apply(algorithm: String, key: String, data: Buffer, encoding: String): String = js.native
}
