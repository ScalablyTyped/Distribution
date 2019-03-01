package typings
package toughDashCookieLib.toughDashCookieMod.CookieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Properties extends js.Object {
  var creation: js.UndefOr[stdLib.Date] = js.undefined
  var creationIndex: js.UndefOr[scala.Double] = js.undefined
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var expires: js.UndefOr[stdLib.Date] = js.undefined
  var extensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var hostOnly: js.UndefOr[scala.Boolean] = js.undefined
  var httpOnly: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var lastAccessed: js.UndefOr[stdLib.Date] = js.undefined
  var maxAge: js.UndefOr[
    scala.Double | toughDashCookieLib.toughDashCookieLibStrings.Infinity | toughDashCookieLib.toughDashCookieLibStrings.`-Infinity`
  ] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var pathIsDefault: js.UndefOr[scala.Boolean] = js.undefined
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Properties {
  @scala.inline
  def apply(
    creation: stdLib.Date = null,
    creationIndex: scala.Int | scala.Double = null,
    domain: java.lang.String = null,
    expires: stdLib.Date = null,
    extensions: js.Array[java.lang.String] = null,
    hostOnly: js.UndefOr[scala.Boolean] = js.undefined,
    httpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    lastAccessed: stdLib.Date = null,
    maxAge: scala.Double | toughDashCookieLib.toughDashCookieLibStrings.Infinity | toughDashCookieLib.toughDashCookieLibStrings.`-Infinity` = null,
    path: java.lang.String = null,
    pathIsDefault: js.UndefOr[scala.Boolean] = js.undefined,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String = null
  ): Properties = {
    val __obj = js.Dynamic.literal()
    if (creation != null) __obj.updateDynamic("creation")(creation)
    if (creationIndex != null) __obj.updateDynamic("creationIndex")(creationIndex.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (!js.isUndefined(hostOnly)) __obj.updateDynamic("hostOnly")(hostOnly)
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly)
    if (key != null) __obj.updateDynamic("key")(key)
    if (lastAccessed != null) __obj.updateDynamic("lastAccessed")(lastAccessed)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(pathIsDefault)) __obj.updateDynamic("pathIsDefault")(pathIsDefault)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Properties]
  }
}

