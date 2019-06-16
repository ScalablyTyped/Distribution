package typings
package wallpaperLib.wallpaperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOptions extends js.Object {
  /**
  		__macOS only.__
  		The screen to get the wallpaper from.
  		Values: `all`, `main`, or the index of a screen from `.screens()`.
  		@default 'main'
  		*/
  val screen: js.UndefOr[
    wallpaperLib.wallpaperLibStrings.all | wallpaperLib.wallpaperLibStrings.main | scala.Double
  ] = js.undefined
}

object GetOptions {
  @scala.inline
  def apply(
    screen: wallpaperLib.wallpaperLibStrings.all | wallpaperLib.wallpaperLibStrings.main | scala.Double = null
  ): GetOptions = {
    val __obj = js.Dynamic.literal()
    if (screen != null) __obj.updateDynamic("screen")(screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOptions]
  }
}

