package typings
package wouterLib.wouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps extends js.Object {
  var children: reactLib.reactMod.ReactElement[_]
  var href: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactElement[_],
    href: java.lang.String = null,
    onClick: () => scala.Unit = null,
    to: java.lang.String = null
  ): LinkProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (href != null) __obj.updateDynamic("href")(href)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[LinkProps]
  }
}

