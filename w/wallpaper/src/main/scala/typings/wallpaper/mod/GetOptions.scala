package typings.wallpaper.mod

import typings.wallpaper.wallpaperStrings.all
import typings.wallpaper.wallpaperStrings.main
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOptions extends js.Object {
  /**
  		__macOS only.__
  		The screen to get the wallpaper from.
  		Values: `all`, `main`, or the index of a screen from `.screens()`.
  		@default 'main'
  		*/
  val screen: js.UndefOr[all | main | Double] = js.native
}

object GetOptions {
  @scala.inline
  def apply(): GetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOptions]
  }
  @scala.inline
  implicit class GetOptionsOps[Self <: GetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setScreen(value: all | main | Double): Self = this.set("screen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreen: Self = this.set("screen", js.undefined)
  }
  
}

