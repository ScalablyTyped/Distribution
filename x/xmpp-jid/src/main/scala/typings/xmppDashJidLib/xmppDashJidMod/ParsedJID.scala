package typings
package xmppDashJidLib.xmppDashJidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedJID extends js.Object {
  var bare: java.lang.String
  var domain: java.lang.String
  var full: java.lang.String
  var local: js.UndefOr[java.lang.String] = js.undefined
  var prepped: js.UndefOr[scala.Boolean] = js.undefined
  var resource: js.UndefOr[java.lang.String] = js.undefined
  var unescapedBare: js.UndefOr[java.lang.String] = js.undefined
  var unescapedFull: js.UndefOr[java.lang.String] = js.undefined
  var unescapedLocal: js.UndefOr[java.lang.String] = js.undefined
}

object ParsedJID {
  @scala.inline
  def apply(
    bare: java.lang.String,
    domain: java.lang.String,
    full: java.lang.String,
    local: java.lang.String = null,
    prepped: js.UndefOr[scala.Boolean] = js.undefined,
    resource: java.lang.String = null,
    unescapedBare: java.lang.String = null,
    unescapedFull: java.lang.String = null,
    unescapedLocal: java.lang.String = null
  ): ParsedJID = {
    val __obj = js.Dynamic.literal(bare = bare, domain = domain, full = full)
    if (local != null) __obj.updateDynamic("local")(local)
    if (!js.isUndefined(prepped)) __obj.updateDynamic("prepped")(prepped)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (unescapedBare != null) __obj.updateDynamic("unescapedBare")(unescapedBare)
    if (unescapedFull != null) __obj.updateDynamic("unescapedFull")(unescapedFull)
    if (unescapedLocal != null) __obj.updateDynamic("unescapedLocal")(unescapedLocal)
    __obj.asInstanceOf[ParsedJID]
  }
}

