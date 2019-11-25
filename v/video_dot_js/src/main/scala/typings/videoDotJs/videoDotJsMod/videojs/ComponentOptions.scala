package typings.videoDotJs.videoDotJsMod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptions extends js.Object {
  var children: js.UndefOr[js.Array[Child]] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply(children: js.Array[Child] = null): ComponentOptions = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptions]
  }
}

