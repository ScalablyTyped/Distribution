package typings.trtcJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Audio extends js.Object {
  var audio: js.UndefOr[Boolean] = js.undefined
  var video: js.UndefOr[Boolean] = js.undefined
}

object Audio {
  @scala.inline
  def apply(audio: js.UndefOr[Boolean] = js.undefined, video: js.UndefOr[Boolean] = js.undefined): Audio = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audio)) __obj.updateDynamic("audio")(audio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(video)) __obj.updateDynamic("video")(video.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audio]
  }
}

