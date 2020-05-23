package typings.webtorrent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Autoplay extends js.Object {
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var controls: js.UndefOr[Boolean] = js.undefined
  var maxBlobLength: js.UndefOr[Double] = js.undefined
}

object Autoplay {
  @scala.inline
  def apply(
    autoplay: js.UndefOr[Boolean] = js.undefined,
    controls: js.UndefOr[Boolean] = js.undefined,
    maxBlobLength: js.UndefOr[Double] = js.undefined
  ): Autoplay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBlobLength)) __obj.updateDynamic("maxBlobLength")(maxBlobLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autoplay]
  }
}

