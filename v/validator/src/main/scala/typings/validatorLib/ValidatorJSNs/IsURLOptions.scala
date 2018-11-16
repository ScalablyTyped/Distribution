package typings
package validatorLib.ValidatorJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// options for isURL

trait IsURLOptions extends js.Object {
  var allow_protocol_relative_urls: js.UndefOr[scala.Boolean] = js.undefined
  var allow_trailing_dot: js.UndefOr[scala.Boolean] = js.undefined
  var allow_underscores: js.UndefOr[scala.Boolean] = js.undefined
  var host_blacklist: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
  var host_whitelist: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
  var protocols: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var require_host: js.UndefOr[scala.Boolean] = js.undefined
  var require_protocol: js.UndefOr[scala.Boolean] = js.undefined
  var require_tld: js.UndefOr[scala.Boolean] = js.undefined
  var require_valid_protocol: js.UndefOr[scala.Boolean] = js.undefined
}

