package typings.tracking.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Audio extends js.Object {
  var audio: js.UndefOr[Boolean] = js.undefined
  var camera: js.UndefOr[Boolean] = js.undefined
}

object Audio {
  @scala.inline
  def apply(audio: js.UndefOr[Boolean] = js.undefined, camera: js.UndefOr[Boolean] = js.undefined): Audio = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audio)) __obj.updateDynamic("audio")(audio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(camera)) __obj.updateDynamic("camera")(camera.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audio]
  }
}

