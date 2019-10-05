package typings.videoDotJs.videoDotJsMod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseButtonOptions extends ComponentOptions {
  var controlText: js.UndefOr[String] = js.undefined
}

object CloseButtonOptions {
  @scala.inline
  def apply(children: js.Array[Child] = null, controlText: String = null): CloseButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (controlText != null) __obj.updateDynamic("controlText")(controlText)
    __obj.asInstanceOf[CloseButtonOptions]
  }
}

