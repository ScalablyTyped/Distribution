package typings.wordpressBlockEditor.warningMod.Warning

import typings.react.mod.ReactFragment
import typings.react.mod.ReactNode
import typings.wordpressBlockEditor.anon.OnClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var actions: js.UndefOr[ReactFragment] = js.undefined
  var children: ReactNode
  var className: js.UndefOr[String] = js.undefined
  var secondaryActions: js.UndefOr[js.Array[OnClick]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    actions: ReactFragment = null,
    children: ReactNode = null,
    className: String = null,
    secondaryActions: js.Array[OnClick] = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (secondaryActions != null) __obj.updateDynamic("secondaryActions")(secondaryActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

