package typings.typestyle

import typings.typestyle.typesMod.KeyFrames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyframes extends js.Object {
  @JSName("$debugName")
  var $debugName: js.UndefOr[String] = js.undefined
  var keyframes: KeyFrames
}

object AnonKeyframes {
  @scala.inline
  def apply(keyframes: KeyFrames, $debugName: String = null): AnonKeyframes = {
    val __obj = js.Dynamic.literal(keyframes = keyframes.asInstanceOf[js.Any])
    if ($debugName != null) __obj.updateDynamic("$debugName")($debugName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKeyframes]
  }
}

