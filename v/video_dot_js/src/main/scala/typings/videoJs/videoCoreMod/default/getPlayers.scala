package typings.videoJs.videoCoreMod.default

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js/dist/alt/video.core", "getPlayers")
@js.native
object getPlayers extends js.Object {
  /**
    * Get an object with the currently created players, keyed by player ID
    *
    * @return	The created players
    */
  def apply(): StringDictionary[typings.videoJs.mod.videojs.Player] = js.native
}

