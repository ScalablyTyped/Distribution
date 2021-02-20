package typings.wiiu

import typings.wiiu.wiiu.ImageView
import typings.wiiu.wiiu.VideoPlayer
import typings.wiiu.wiiu.WiiuGamePad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object wiiu {
    
    @JSGlobal("wiiu")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("wiiu.gamepad")
    @js.native
    def gamepad: WiiuGamePad = js.native
    @scala.inline
    def gamepad_=(x: WiiuGamePad): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gamepad")(x.asInstanceOf[js.Any])
    
    @JSGlobal("wiiu.imageview")
    @js.native
    def imageview: ImageView = js.native
    @scala.inline
    def imageview_=(x: ImageView): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imageview")(x.asInstanceOf[js.Any])
    
    @JSGlobal("wiiu.videoplayer")
    @js.native
    def videoplayer: VideoPlayer = js.native
    @scala.inline
    def videoplayer_=(x: VideoPlayer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("videoplayer")(x.asInstanceOf[js.Any])
  }
}
