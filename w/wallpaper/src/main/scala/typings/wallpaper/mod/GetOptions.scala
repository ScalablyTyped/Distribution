package typings.wallpaper.mod

import typings.wallpaper.wallpaperStrings.all
import typings.wallpaper.wallpaperStrings.main
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
  val screen: js.UndefOr[all | main | Double] = js.undefined
}

object GetOptions {
  @scala.inline
  def apply(screen: all | main | Double = null): GetOptions = {
    val __obj = js.Dynamic.literal()
    if (screen != null) __obj.updateDynamic("screen")(screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOptions]
  }
}

