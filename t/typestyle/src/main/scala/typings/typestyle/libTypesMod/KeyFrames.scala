package typings.typestyle.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyFrames
  extends /* key */ StringDictionary[js.UndefOr[CSSProperties | String]] {
  @JSName("$debugName")
  var $debugName: js.UndefOr[String] = js.undefined
}

object KeyFrames {
  @scala.inline
  def apply(
    $debugName: String = null,
    StringDictionary: /* key */ StringDictionary[js.UndefOr[CSSProperties | String]] = null
  ): KeyFrames = {
    val __obj = js.Dynamic.literal()
    if ($debugName != null) __obj.updateDynamic("$debugName")($debugName.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[KeyFrames]
  }
}

