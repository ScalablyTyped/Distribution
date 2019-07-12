package typings
package wouterLib.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectProps extends js.Object {
  var href: js.UndefOr[java.lang.String] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object RedirectProps {
  @scala.inline
  def apply(href: java.lang.String = null, to: java.lang.String = null): RedirectProps = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[RedirectProps]
  }
}

