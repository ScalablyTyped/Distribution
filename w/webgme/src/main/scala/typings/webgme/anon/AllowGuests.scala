package typings.webgme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowGuests extends js.Object {
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
  var authorizer: Options
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
  var jwt: Algorithm
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

object AllowGuests {
  @scala.inline
  def apply(
    allowGuests: Boolean,
    allowUserRegistration: Boolean,
    authorizer: Options,
    enable: Boolean,
    guestAccount: String,
    jwt: Algorithm,
    logInUrl: String,
    logOutUrl: String,
    salts: Double
  ): AllowGuests = {
    val __obj = js.Dynamic.literal(allowGuests = allowGuests.asInstanceOf[js.Any], allowUserRegistration = allowUserRegistration.asInstanceOf[js.Any], authorizer = authorizer.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], guestAccount = guestAccount.asInstanceOf[js.Any], jwt = jwt.asInstanceOf[js.Any], logInUrl = logInUrl.asInstanceOf[js.Any], logOutUrl = logOutUrl.asInstanceOf[js.Any], salts = salts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowGuests]
  }
}

