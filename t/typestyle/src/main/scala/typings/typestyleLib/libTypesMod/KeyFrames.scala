package typings
package typestyleLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyFrames
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[CSSProperties | java.lang.String]] {
  @JSName("$debugName")
  var $debugName: js.UndefOr[java.lang.String] = js.undefined
}

object KeyFrames {
  @scala.inline
  def apply(
    $debugName: java.lang.String = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[CSSProperties | java.lang.String]] = null
  ): KeyFrames = {
    val __obj = js.Dynamic.literal()
    if ($debugName != null) __obj.updateDynamic("$debugName")($debugName)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[KeyFrames]
  }
}

