package typings.videoDotJs.videoDotJsMod.default

import org.scalablytyped.runtime.StringDictionary
import typings.videoDotJs.videoDotJsMod.videojs.Player
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "getPlayers")
@js.native
object getPlayers extends js.Object {
  /**
  	 * Get an object with the currently created players, keyed by player ID
  	 *
  	 * @return	The created players
  	 */
  def apply(): StringDictionary[Player] = js.native
}

