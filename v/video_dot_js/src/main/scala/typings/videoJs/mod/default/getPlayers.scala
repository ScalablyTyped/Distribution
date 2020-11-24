package typings.videoJs.mod.default

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("video.js", "getPlayers")
@js.native
object getPlayers extends js.Object {
  
  /**
    * Get an object with the currently created players, keyed by player ID
    *
    * @return    The created players
    */
  def apply(): StringDictionary[typings.videoJs.mod.videojs.Player] = js.native
}
