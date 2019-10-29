package typings.wouter.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationalProps extends js.Object {
  var href: js.UndefOr[Path] = js.undefined
  var to: js.UndefOr[Path] = js.undefined
}

object NavigationalProps {
  @scala.inline
  def apply(href: Path = null, to: Path = null): NavigationalProps = {
    val __obj = js.Dynamic.literal()
    if (href != null) __obj.updateDynamic("href")(href)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[NavigationalProps]
  }
}

