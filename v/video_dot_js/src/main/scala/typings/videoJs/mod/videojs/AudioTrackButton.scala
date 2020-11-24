package typings.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base class for buttons that toggle specific {@link AudioTrack} types.
  */
@js.native
trait AudioTrackButton extends MenuButton {
  
  def createItems(items: js.Array[AudioTrackMenuItem]): js.Array[AudioTrackMenuItem] = js.native
}
