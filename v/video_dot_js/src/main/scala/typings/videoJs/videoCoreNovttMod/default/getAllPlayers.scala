package typings.videoJs.videoCoreNovttMod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js/dist/alt/video.core.novtt", "getAllPlayers")
@js.native
object getAllPlayers extends js.Object {
  /**
    * Returns an array of all current players.
    *
    * @return An array of all players. The array will be in the order that
    *         `Object.keys` provides, which could potentially vary between
    *         JavaScript engines.
    *
    */
  def apply(): js.Array[typings.videoJs.mod.videojs.Player] = js.native
}

