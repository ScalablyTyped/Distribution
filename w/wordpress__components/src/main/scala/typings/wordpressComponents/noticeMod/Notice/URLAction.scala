package typings.wordpressComponents.noticeMod.Notice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLAction
  extends BaseAction
     with Action {
  var url: String
}

object URLAction {
  @scala.inline
  def apply(
    label: String,
    url: String,
    className: String = null,
    noDefaultClasses: js.UndefOr[Boolean] = js.undefined
  ): URLAction = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(noDefaultClasses)) __obj.updateDynamic("noDefaultClasses")(noDefaultClasses.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[URLAction]
  }
}

