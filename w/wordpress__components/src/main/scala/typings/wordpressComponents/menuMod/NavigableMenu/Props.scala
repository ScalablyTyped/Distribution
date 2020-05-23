package typings.wordpressComponents.menuMod.NavigableMenu

import typings.wordpressComponents.wordpressComponentsStrings.both
import typings.wordpressComponents.wordpressComponentsStrings.horizontal
import typings.wordpressComponents.wordpressComponentsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends typings.wordpressComponents.tabbableMod.TabbableContainer.Props {
  /**
    * The orientation of the menu.
    * @defaultValue "vertical"
    */
  var orientation: js.UndefOr[vertical | horizontal | both] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    Props: typings.wordpressComponents.tabbableMod.TabbableContainer.Props,
    orientation: vertical | horizontal | both = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, Props)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

