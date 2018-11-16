package typings
package universalDashCookieLib.universalDashCookieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CookieOpts extends js.Object {
  /**
       * domain for the cookie (sub.domain.com or .allsubdomains.com)
       */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
       * absolute expiration date for the cookie
       */
  var expires: js.UndefOr[stdLib.Date] = js.undefined
  /**
       * Is only the server can access the cookie?
       */
  var httpOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * relative max age of the cookie from when the client receives it in second
       */
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  /**
       * cookie path, use / as the path if you want your cookie to be accessible on all pages
       */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Is only accessible through HTTPS?
       */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
}

