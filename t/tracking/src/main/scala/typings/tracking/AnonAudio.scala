package typings.tracking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAudio extends js.Object {
  var audio: js.UndefOr[Boolean] = js.undefined
  var camera: js.UndefOr[Boolean] = js.undefined
}

object AnonAudio {
  @scala.inline
  def apply(audio: js.UndefOr[Boolean] = js.undefined, camera: js.UndefOr[Boolean] = js.undefined): AnonAudio = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audio)) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (!js.isUndefined(camera)) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAudio]
  }
}

