package typings.videoDotJs.videoDotJsMod.default

import typings.videoDotJs.videoDotJsMod.videojs.Player
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "getAllPlayers")
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
  def apply(): js.Array[Player] = js.native
}

