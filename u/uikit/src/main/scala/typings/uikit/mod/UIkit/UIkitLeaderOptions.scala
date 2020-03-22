package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitLeaderOptions extends js.Object {
  var fill: js.UndefOr[String] = js.undefined
  var media: js.UndefOr[Double | String] = js.undefined
}

object UIkitLeaderOptions {
  @scala.inline
  def apply(fill: String = null, media: Double | String = null): UIkitLeaderOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitLeaderOptions]
  }
}

