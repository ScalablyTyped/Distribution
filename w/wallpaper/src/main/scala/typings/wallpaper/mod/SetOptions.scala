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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetOptions extends js.Object {
  
  /**
  		__macOS only.__
  		Scaling method. Values: `auto` `fill` `fit` `stretch` `center`.
  		@default 'auto'
  		*/
  val scale: js.UndefOr[auto | fill | fit | stretch | center] = js.native
  
  /**
  		__macOS only.__
  		The screen to set the wallpaper on.
  		Values: `all`, `main`, or the index of a screen from `.screens()`.
  		*On Linux and Windows it's hard-coded to `main`.*
  		@default 'all'
  		*/
  val screen: js.UndefOr[all | main | Double] = js.native
}
object SetOptions {
  
  @scala.inline
  def apply(): SetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOptions]
  }
  
  @scala.inline
  implicit class SetOptionsOps[Self <: SetOptions] (val x: Self) extends AnyVal {
    
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
    def setScale(value: auto | fill | fit | stretch | center): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setScreen(value: all | main | Double): Self = this.set("screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreen: Self = this.set("screen", js.undefined)
  }
}
