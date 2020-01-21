package typings.wallpaper.mod

import typings.wallpaper.wallpaperStrings.all
import typings.wallpaper.wallpaperStrings.auto
import typings.wallpaper.wallpaperStrings.center
import typings.wallpaper.wallpaperStrings.fill
import typings.wallpaper.wallpaperStrings.fit
import typings.wallpaper.wallpaperStrings.main
import typings.wallpaper.wallpaperStrings.stretch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions extends js.Object {
  /**
  		__macOS only.__
  		Scaling method. Values: `auto` `fill` `fit` `stretch` `center`.
  		@default 'auto'
  		*/
  val scale: js.UndefOr[auto | fill | fit | stretch | center] = js.undefined
  /**
  		__macOS only.__
  		The screen to set the wallpaper on.
  		Values: `all`, `main`, or the index of a screen from `.screens()`.
  		*On Linux and Windows it's hard-coded to `main`.*
  		@default 'all'
  		*/
  val screen: js.UndefOr[all | main | Double] = js.undefined
}

object SetOptions {
  @scala.inline
  def apply(scale: auto | fill | fit | stretch | center = null, screen: all | main | Double = null): SetOptions = {
    val __obj = js.Dynamic.literal()
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (screen != null) __obj.updateDynamic("screen")(screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptions]
  }
}

