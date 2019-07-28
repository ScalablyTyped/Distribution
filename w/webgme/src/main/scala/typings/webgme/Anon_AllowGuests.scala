package typings.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowGuests extends js.Object {
  /**
    * Generate a guest account for non-authenticated connections.
    *    config.authentication.allowGuests = true;
    */
  var allowGuests: Boolean
  /**
    * Allow clients to create new users via the REST api.
    *    config.authentication.allowUserRegistration = true;
    */
  var allowUserRegistration: Boolean
  var authorizer: Anon_Options
  /**
    * If true certain parts will require that users are authenticated.
    *    config.authentication.enable = false;
    */
  var enable: Boolean
  /**
    * User account which non-authenticated connections will access the storage.
    *    config.authentication.guestAccount = 'guest';
    */
  var guestAccount: String
  var jwt: Anon_Algorithm
  /**
    * Where clients are redirected if not authenticated.
    *    config.authentication.logInUrl = '/profile/login';
    */
  var logInUrl: String
  /**
    * Where clients are redirected after logout.
    *   config.authentication.logOutUrl = '/profile/login';
    */
  var logOutUrl: String
  /**
    * Strength of the salting of the users' passwords bcrypt.
    *   config.authentication.salts = 10;
    */
  var salts: Double
}

object Anon_AllowGuests {
  @scala.inline
  def apply(
    allowGuests: Boolean,
    allowUserRegistration: Boolean,
    authorizer: Anon_Options,
    enable: Boolean,
    guestAccount: String,
    jwt: Anon_Algorithm,
    logInUrl: String,
    logOutUrl: String,
    salts: Double
  ): Anon_AllowGuests = {
    val __obj = js.Dynamic.literal(allowGuests = allowGuests, allowUserRegistration = allowUserRegistration, authorizer = authorizer, enable = enable, guestAccount = guestAccount, jwt = jwt, logInUrl = logInUrl, logOutUrl = logOutUrl, salts = salts)
  
    __obj.asInstanceOf[Anon_AllowGuests]
  }
}

