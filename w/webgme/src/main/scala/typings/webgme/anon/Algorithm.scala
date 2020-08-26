package typings.webgme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Algorithm extends js.Object {
  /**
    * The algorithm used for encryption (should not be edited w/o chaning keys appropriately).
    *   config.authentication.jwt.algorithm = 'RS256';
    */
  var algorithm: String = js.native
  /**
    * Id of token used when placed inside of a cookie.
    *    config.authentication.jwt.cookieId = 'access_token';
    */
  var cookieId: String = js.native
  /**
    * Lifetime of tokens in seconds.
    *   config.authentication.jwt.expiresIn = 3600 * 24 * 7;
    */
  var expiresIn: Double = js.native
  /**
    * Private RSA256 key used when generating tokens 
    * (N.B. if authentication is turned on 
    * - the defaults must be changed and the keys must 
    * reside outside of the app's root-directory or alt. 
    * a rule should be added to config.server.extlibExcludes).
    *   config.authentication.jwt.privateKey = './src/server/middleware/auth/EXAMPLE_PRIVATE_KEY';
    */
  var privateKey: String = js.native
  /**
    * Public RSA256 key used when evaluating tokens.
    *   config.authentication.jwt.publicKey = './src/server/middleware/auth/EXAMPLE_PRIVATE_KEY';
    */
  var publicKey: String = js.native
  /**
    * Interval in seconds, if there is less time until 
    * expiration the token will be automatically renewed.
    *  (Set this to less or equal to 0 to disabled automatic renewal.)
    *   config.authentication.jwt.renewBeforeExpires = 3600;
    */
  var renewBeforeExpires: Double = js.native
  /**
    * Replaceable module for generating tokens in case 
    * webgme should not generated new tokens by itself.
    *   config.authentication.jwt.tokenGenerator = './src/server/middleware/auth/localtokengenerator.js';
    */
  var tokenGenerator: String = js.native
}

object Algorithm {
  @scala.inline
  def apply(
    algorithm: String,
    cookieId: String,
    expiresIn: Double,
    privateKey: String,
    publicKey: String,
    renewBeforeExpires: Double,
    tokenGenerator: String
  ): Algorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], cookieId = cookieId.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], renewBeforeExpires = renewBeforeExpires.asInstanceOf[js.Any], tokenGenerator = tokenGenerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithm]
  }
  @scala.inline
  implicit class AlgorithmOps[Self <: Algorithm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setCookieId(value: String): Self = this.set("cookieId", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpiresIn(value: Double): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateKey(value: String): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicKey(value: String): Self = this.set("publicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenewBeforeExpires(value: Double): Self = this.set("renewBeforeExpires", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokenGenerator(value: String): Self = this.set("tokenGenerator", value.asInstanceOf[js.Any])
  }
  
}

