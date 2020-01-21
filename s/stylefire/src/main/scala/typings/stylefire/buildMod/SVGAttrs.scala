package typings.stylefire.buildMod

import org.scalablytyped.runtime.StringDictionary
import typings.stylefire.AnonTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAttrs
  extends /* key */ StringDictionary[js.Any] {
  var style: js.UndefOr[AnonTransform] = js.undefined
}

object SVGAttrs {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, style: AnonTransform = null): SVGAttrs = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAttrs]
  }
}

