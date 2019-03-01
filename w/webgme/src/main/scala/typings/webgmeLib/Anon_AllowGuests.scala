package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowGuests extends js.Object {
  /**
    * Generate a guest account for non-authenticated connections.
    *    config.authentication.allowGuests = true;
    */
  var allowGuests: scala.Boolean
  /**
    * Allow clients to create new users via the REST api.
    *    config.authentication.allowUserRegistration = true;
    */
  var allowUserRegistration: scala.Boolean
  var authorizer: Anon_Options
  /**
    * If true certain parts will require that users are authenticated.
    *    config.authentication.enable = false;
    */
  var enable: scala.Boolean
  /**
    * User account which non-authenticated connections will access the storage.
    *    config.authentication.guestAccount = 'guest';
    */
  var guestAccount: java.lang.String
  var jwt: Anon_Algorithm
  /**
    * Where clients are redirected if not authenticated.
    *    config.authentication.logInUrl = '/profile/login';
    */
  var logInUrl: java.lang.String
  /**
    * Where clients are redirected after logout.
    *   config.authentication.logOutUrl = '/profile/login';
    */
  var logOutUrl: java.lang.String
  /**
    * Strength of the salting of the users' passwords bcrypt.
    *   config.authentication.salts = 10;
    */
  var salts: scala.Double
}

object Anon_AllowGuests {
  @scala.inline
  def apply(
    allowGuests: scala.Boolean,
    allowUserRegistration: scala.Boolean,
    authorizer: Anon_Options,
    enable: scala.Boolean,
    guestAccount: java.lang.String,
    jwt: Anon_Algorithm,
    logInUrl: java.lang.String,
    logOutUrl: java.lang.String,
    salts: scala.Double
  ): Anon_AllowGuests = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowGuests")(allowGuests)
    __obj.updateDynamic("allowUserRegistration")(allowUserRegistration)
    __obj.updateDynamic("authorizer")(authorizer)
    __obj.updateDynamic("enable")(enable)
    __obj.updateDynamic("guestAccount")(guestAccount)
    __obj.updateDynamic("jwt")(jwt)
    __obj.updateDynamic("logInUrl")(logInUrl)
    __obj.updateDynamic("logOutUrl")(logOutUrl)
    __obj.updateDynamic("salts")(salts)
    __obj.asInstanceOf[Anon_AllowGuests]
  }
}

