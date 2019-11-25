package typings.stylefire.libSvgBuildMod

import org.scalablytyped.runtime.StringDictionary
import typings.stylefire.Anon_Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAttrs
  extends /* key */ StringDictionary[js.Any] {
  var style: js.UndefOr[Anon_Transform] = js.undefined
}

object SVGAttrs {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[js.Any] = null, style: Anon_Transform = null): SVGAttrs = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAttrs]
  }
}

