package typings.webdriverio.WebdriverIOAsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof webdriverio.WebdriverIO.TouchAction, 'element'> ]: webdriverio.WebdriverIO.TouchAction[P]} */ trait TouchAction extends js.Object {
  var element: js.UndefOr[Element] = js.undefined
}

object TouchAction {
  @scala.inline
  def apply(element: Element = null): TouchAction = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchAction]
  }
}

