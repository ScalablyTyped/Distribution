package typings.xstyledSystem.mod

import typings.csstype.mod.ZIndexProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZIndexProps extends js.Object {
  val zIndex: js.UndefOr[ResponsiveValue[ZIndexProperty | AliasKey]] = js.undefined
}

object ZIndexProps {
  @scala.inline
  def apply(zIndex: ResponsiveValue[ZIndexProperty | AliasKey] = null): ZIndexProps = {
    val __obj = js.Dynamic.literal()
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZIndexProps]
  }
}

