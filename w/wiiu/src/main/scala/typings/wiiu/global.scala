package typings.wiiu

import typings.wiiu.wiiu.ImageView
import typings.wiiu.wiiu.VideoPlayer
import typings.wiiu.wiiu.WiiuGamePad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object wiiu extends js.Object {
    
    var gamepad: WiiuGamePad = js.native
    
    var imageview: ImageView = js.native
    
    var videoplayer: VideoPlayer = js.native
  }
}
