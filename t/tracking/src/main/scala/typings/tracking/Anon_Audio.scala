package typings.tracking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Audio extends js.Object {
  var audio: js.UndefOr[Boolean] = js.undefined
  var camera: js.UndefOr[Boolean] = js.undefined
}

object Anon_Audio {
  @scala.inline
  def apply(audio: js.UndefOr[Boolean] = js.undefined, camera: js.UndefOr[Boolean] = js.undefined): Anon_Audio = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audio)) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (!js.isUndefined(camera)) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Audio]
  }
}

