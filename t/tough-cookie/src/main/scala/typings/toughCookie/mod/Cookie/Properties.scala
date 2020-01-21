package typings.toughCookie.mod.Cookie

import typings.std.Date
import typings.toughCookie.toughCookieStrings.Infinity
import typings.toughCookie.toughCookieStrings.`-Infinity`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Properties extends js.Object {
  var creation: js.UndefOr[Date] = js.undefined
  var creationIndex: js.UndefOr[Double] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var expires: js.UndefOr[Date] = js.undefined
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  var hostOnly: js.UndefOr[Boolean] = js.undefined
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var lastAccessed: js.UndefOr[Date] = js.undefined
  var maxAge: js.UndefOr[Double | Infinity | `-Infinity`] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var pathIsDefault: js.UndefOr[Boolean] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object Properties {
  @scala.inline
  def apply(
    creation: Date = null,
    creationIndex: Int | Double = null,
    domain: String = null,
    expires: Date = null,
    extensions: js.Array[String] = null,
    hostOnly: js.UndefOr[Boolean] = js.undefined,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    lastAccessed: Date = null,
    maxAge: Double | Infinity | `-Infinity` = null,
    path: String = null,
    pathIsDefault: js.UndefOr[Boolean] = js.undefined,
    secure: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): Properties = {
    val __obj = js.Dynamic.literal()
    if (creation != null) __obj.updateDynamic("creation")(creation.asInstanceOf[js.Any])
    if (creationIndex != null) __obj.updateDynamic("creationIndex")(creationIndex.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(hostOnly)) __obj.updateDynamic("hostOnly")(hostOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lastAccessed != null) __obj.updateDynamic("lastAccessed")(lastAccessed.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(pathIsDefault)) __obj.updateDynamic("pathIsDefault")(pathIsDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
}

