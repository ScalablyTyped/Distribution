package typings.wordpressComponents.focusableIframeMod.FocusableIframe

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.RefObject
import typings.std.HTMLIFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends AllHTMLAttributes[HTMLIFrameElement]
     with ClassAttributes[HTMLIFrameElement] {
  var iframeRef: js.UndefOr[RefObject[HTMLIFrameElement]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLIFrameElement] = null,
    ClassAttributes: ClassAttributes[HTMLIFrameElement] = null,
    iframeRef: RefObject[HTMLIFrameElement] = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (iframeRef != null) __obj.updateDynamic("iframeRef")(iframeRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

