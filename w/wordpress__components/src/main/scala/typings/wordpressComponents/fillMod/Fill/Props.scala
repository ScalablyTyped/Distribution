package typings.wordpressComponents.fillMod.Fill

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  /**
    * Both `Slot` and `Fill` accept a `name` string prop, where a `Slot`
    * with a given `name` will render the `children` of any associated
    * `Fill`s.
    */
  var name: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(children: ReactNode = null, name: String = null): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

