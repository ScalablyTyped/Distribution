package typings.typestyle

import typings.typestyle.libTypesMod.KeyFrames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DebugNameKeyframes extends js.Object {
  @JSName("$debugName")
  var $debugName: js.UndefOr[String] = js.undefined
  var keyframes: KeyFrames
}

object Anon_DebugNameKeyframes {
  @scala.inline
  def apply(keyframes: KeyFrames, $debugName: String = null): Anon_DebugNameKeyframes = {
    val __obj = js.Dynamic.literal(keyframes = keyframes.asInstanceOf[js.Any])
    if ($debugName != null) __obj.updateDynamic("$debugName")($debugName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DebugNameKeyframes]
  }
}

