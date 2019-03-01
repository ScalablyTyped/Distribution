package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseButtonOptions extends ComponentOptions {
  var controlText: js.UndefOr[java.lang.String] = js.undefined
}

object CloseButtonOptions {
  @scala.inline
  def apply(children: js.Array[Child] = null, controlText: java.lang.String = null): CloseButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (controlText != null) __obj.updateDynamic("controlText")(controlText)
    __obj.asInstanceOf[CloseButtonOptions]
  }
}

