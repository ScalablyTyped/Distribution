package typings
package wallpaperLib.wallpaperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WallpaperOptions extends js.Object {
  var scale: js.UndefOr[
    wallpaperLib.wallpaperLibStrings.fill | wallpaperLib.wallpaperLibStrings.fit | wallpaperLib.wallpaperLibStrings.stretch | wallpaperLib.wallpaperLibStrings.center
  ] = js.undefined
}

object WallpaperOptions {
  @scala.inline
  def apply(
    scale: wallpaperLib.wallpaperLibStrings.fill | wallpaperLib.wallpaperLibStrings.fit | wallpaperLib.wallpaperLibStrings.stretch | wallpaperLib.wallpaperLibStrings.center = null
  ): WallpaperOptions = {
    val __obj = js.Dynamic.literal()
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[WallpaperOptions]
  }
}

