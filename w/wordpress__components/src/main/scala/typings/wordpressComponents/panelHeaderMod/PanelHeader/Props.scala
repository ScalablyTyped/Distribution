package typings.wordpressComponents.panelHeaderMod.PanelHeader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * The text that will be rendered as the title of the `Panel`. Will be
    * rendered in an `<h2>` tag.
    */
  var label: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(label: String = null): Props = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

