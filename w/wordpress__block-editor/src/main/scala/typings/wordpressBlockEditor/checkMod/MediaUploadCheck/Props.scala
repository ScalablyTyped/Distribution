package typings.wordpressBlockEditor.checkMod.MediaUploadCheck

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactNode
  var fallback: js.UndefOr[ReactNode] = js.undefined
}

object Props {
  @scala.inline
  def apply(children: ReactNode = null, fallback: ReactNode = null): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

