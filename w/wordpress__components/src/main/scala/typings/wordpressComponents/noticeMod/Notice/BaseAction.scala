package typings.wordpressComponents.noticeMod.Notice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseAction extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var label: String
  /**
    * Should default classes be removed from the action?
    */
  var noDefaultClasses: js.UndefOr[Boolean] = js.undefined
}

object BaseAction {
  @scala.inline
  def apply(label: String, className: String = null, noDefaultClasses: js.UndefOr[Boolean] = js.undefined): BaseAction = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(noDefaultClasses)) __obj.updateDynamic("noDefaultClasses")(noDefaultClasses.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAction]
  }
}

