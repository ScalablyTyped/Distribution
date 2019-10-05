package typings.webdriverio.WebdriverIOAsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.TouchAction * / any, 'element'> ]: / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.TouchAction * / any[P]} */ trait TouchAction extends js.Object {
  var element: js.UndefOr[Element] = js.undefined
}

object TouchAction {
  @scala.inline
  def apply(element: Element = null): TouchAction = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[TouchAction]
  }
}

