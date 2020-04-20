package typings.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlgorithm extends js.Object {
  /**
    * The algorithm used for encryption (should not be edited w/o chaning keys appropriately).
    *   config.authentication.jwt.algorithm = 'RS256';
    */
  var algorithm: String
  /**
    * Id of token used when placed inside of a cookie.
    *    config.authentication.jwt.cookieId = 'access_token';
    */
  var cookieId: String
  /**
    * Lifetime of tokens in seconds.
    *   config.authentication.jwt.expiresIn = 3600 * 24 * 7;
    */
  var expiresIn: Double
  /**
    * Private RSA256 key used when generating tokens 
    * (N.B. if authentication is turned on 
    * - the defaults must be changed and the keys must 
    * reside outside of the app's root-directory or alt. 
    * a rule should be added to config.server.extlibExcludes).
    *   config.authentication.jwt.privateKey = './src/server/middleware/auth/EXAMPLE_PRIVATE_KEY';
    */
  var privateKey: String
  /**
    * Public RSA256 key used when evaluating tokens.
    *   config.authentication.jwt.publicKey = './src/server/middleware/auth/EXAMPLE_PRIVATE_KEY';
    */
  var publicKey: String
  /**
    * Interval in seconds, if there is less time until 
    * expiration the token will be automatically renewed.
    *  (Set this to less or equal to 0 to disabled automatic renewal.)
    *   config.authentication.jwt.renewBeforeExpires = 3600;
    */
  var renewBeforeExpires: Double
  /**
    * Replaceable module for generating tokens in case 
    * webgme should not generated new tokens by itself.
    *   config.authentication.jwt.tokenGenerator = './src/server/middleware/auth/localtokengenerator.js';
    */
  var tokenGenerator: String
}

object AnonAlgorithm {
  @scala.inline
  def apply(
    algorithm: String,
    cookieId: String,
    expiresIn: Double,
    privateKey: String,
    publicKey: String,
    renewBeforeExpires: Double,
    tokenGenerator: String
  ): AnonAlgorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], cookieId = cookieId.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], renewBeforeExpires = renewBeforeExpires.asInstanceOf[js.Any], tokenGenerator = tokenGenerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlgorithm]
  }
}

