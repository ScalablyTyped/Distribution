package typings.videoJs.videoCoreMod.default

import typings.videoJs.mod.videojs.ModalDialogOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js/dist/alt/video.core", "ModalDialog")
@js.native
class ModalDialogCls protected ()
  extends typings.videoJs.mod.videojs.ModalDialog {
  /**
    * Create an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    */
  def this(player: typings.videoJs.mod.videojs.Player) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: ModalDialogOptions) = this()
}

