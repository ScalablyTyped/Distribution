package typings.wouter.wouterMod

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkProps extends js.Object {
  var children: ReactElement
  var href: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var to: js.UndefOr[String] = js.undefined
}

object LinkProps {
  @scala.inline
  def apply(children: ReactElement, href: String = null, onClick: () => Unit = null, to: String = null): LinkProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (href != null) __obj.updateDynamic("href")(href)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[LinkProps]
  }
}

