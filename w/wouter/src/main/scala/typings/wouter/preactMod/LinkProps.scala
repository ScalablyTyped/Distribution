package typings.wouter.preactMod

import typings.preact.srcMod.ComponentChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps extends js.Object {
  var children: ComponentChildren
  var href: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var to: js.UndefOr[String] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply(
    children: ComponentChildren = null,
    href: String = null,
    onClick: () => Unit = null,
    to: String = null
  ): LinkProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[LinkProps]
  }
}

