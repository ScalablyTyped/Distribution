package typings
package wallpaperLib.wallpaperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions extends js.Object {
  /**
  		__macOS only.__
  		Scaling method. Values: `auto` `fill` `fit` `stretch` `center`.
  		@default 'auto'
  		*/
  val scale: js.UndefOr[
    wallpaperLib.wallpaperLibStrings.auto | wallpaperLib.wallpaperLibStrings.fill | wallpaperLib.wallpaperLibStrings.fit | wallpaperLib.wallpaperLibStrings.stretch | wallpaperLib.wallpaperLibStrings.center
  ] = js.undefined
  /**
  		__macOS only.__
  		The screen to set the wallpaper on. Values: `all` `main` or the index of a screen from `.screens()`.
  		*On Linux and Windows it's hard-coded to `main`.*
  		@default 'all'
  		*/
  val screen: js.UndefOr[
    wallpaperLib.wallpaperLibStrings.all | wallpaperLib.wallpaperLibStrings.main | scala.Double
  ] = js.undefined
}

object SetOptions {
  @scala.inline
  def apply(
    scale: wallpaperLib.wallpaperLibStrings.auto | wallpaperLib.wallpaperLibStrings.fill | wallpaperLib.wallpaperLibStrings.fit | wallpaperLib.wallpaperLibStrings.stretch | wallpaperLib.wallpaperLibStrings.center = null,
    screen: wallpaperLib.wallpaperLibStrings.all | wallpaperLib.wallpaperLibStrings.main | scala.Double = null
  ): SetOptions = {
    val __obj = js.Dynamic.literal()
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (screen != null) __obj.updateDynamic("screen")(screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptions]
  }
}

