package typings.wordpressComponents.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@wordpress/components.@wordpress/components/slot-fill/fill.default.Props, 'name'> */
trait OmitPropsname extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
}

object OmitPropsname {
  @scala.inline
  def apply(children: ReactNode = null): OmitPropsname = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitPropsname]
  }
}

