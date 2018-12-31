package typings
package yarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Path extends js.Object {
  /**
    * Tells Hapi that if a session cookie is invalid for any reason,
    * to clear it from the browser.
    * This prevents Hapi from having to reprocess the bad cookie on future requests.
    * In general you'll probably want this on,
    * but if you'd prefer that session cookies be dealt with in some
    * other way you may set this to false.
    * Defaults to true
    */
  var clearInvalid: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * an optional function to create custom session IDs.
    * Must retun a string and have the signature function (request) where:
    * request - (optional) is the original request received from the client.
    * Defaults to uuidv4
    */
  var customSessionIDGenerator: js.UndefOr[js.Function1[/* req */ hapiLib.hapiMod.Request, java.lang.String]] = js.undefined
  /**
    * Tells Hapi that it should not respond with a HTTP 400 error if the session cookie cannot decrypt.
    * This could happen if the cookie is changed on the client, or more likely, if you change the cookie password in your settings.
    * If you want to make this condition send an error like it did in prior versions, change this to `false`,
    * but be aware that if you change your cookie password you will cause 400 errors to be returned to end users.
    * In that case you should probably change this back to true for a short time to allow session cookies to get reset for the best user experience.
    * Defaults to true.
    */
  var ignoreErrors: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * determines whether or not to set HttpOnly option in cookie.
    * Defaults to false.
    */
  var isHttpOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * enables the same-site cookie parameter.
    * Default to 'Lax'.
    */
  var isSameSite: js.UndefOr[
    yarLib.yarLibStrings.Lax | yarLib.yarLibStrings.Strict | yarLib.yarLibNumbers.`false`
  ] = js.undefined
  /**
    * determines whether or not to transfer using TLS/SSL.
    * Defaults to true.
    */
  var isSecure: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (Required) used to encrypt and sign the cookie data.
    * Must be at least 32 chars.
    */
  var password: java.lang.String
  /**
    * determines the cookie path.
    * Defaults to '/'.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * sets the time for the cookie to live in the browser, in milliseconds.
    * Defaults to null (session time-life - cookies are deleted when the browser is closed).
    */
  var ttl: js.UndefOr[scala.Double] = js.undefined
}

