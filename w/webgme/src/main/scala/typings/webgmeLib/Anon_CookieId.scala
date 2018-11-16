package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_CookieId extends js.Object {
  /**
                   * The algorithm used for encryption (should not be edited w/o chaning keys appropriately).
                   *   config.authentication.jwt.algorithm = 'RS256';
                   */
  var algorithm: java.lang.String
  /**
                   * Id of token used when placed inside of a cookie.
                   *    config.authentication.jwt.cookieId = 'access_token';
                   */
  var cookieId: java.lang.String
  /**
                   * Lifetime of tokens in seconds.
                   *   config.authentication.jwt.expiresIn = 3600 * 24 * 7;
                   */
  var expiresIn: scala.Double
  /**
                   * Private RSA256 key used when generating tokens 
                   * (N.B. if authentication is turned on 
                   * - the defaults must be changed and the keys must 
                   * reside outside of the app's root-directory or alt. 
                   * a rule should be added to config.server.extlibExcludes).
                   *   config.authentication.jwt.privateKey = './src/server/middleware/auth/EXAMPLE_PRIVATE_KEY';
                   */
  var privateKey: java.lang.String
  /**
                   * Public RSA256 key used when evaluating tokens.
                   *   config.authentication.jwt.publicKey = './src/server/middleware/auth/EXAMPLE_PRIVATE_KEY';
                   */
  var publicKey: java.lang.String
  /**
                   * Interval in seconds, if there is less time until 
                   * expiration the token will be automatically renewed.
                   *  (Set this to less or equal to 0 to disabled automatic renewal.)
                   *   config.authentication.jwt.renewBeforeExpires = 3600;
                   */
  var renewBeforeExpires: scala.Double
  /**
                   * Replaceable module for generating tokens in case 
                   * webgme should not generated new tokens by itself.
                   *   config.authentication.jwt.tokenGenerator = './src/server/middleware/auth/localtokengenerator.js';
                   */
  var tokenGenerator: java.lang.String
}

