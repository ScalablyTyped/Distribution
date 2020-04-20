package typings.videoJs.videoCoreMod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js/dist/alt/video.core", "removeHook")
@js.native
object removeHook extends js.Object {
  /**
    * Remove a hook from a specific videojs lifecycle.
    *
    * @param type
    *        the lifecycle that the function hooked to
    *
    * @param fn
    *        The hooked function to remove
    *
    * @return	The function that was removed or undef
    */
  def apply(`type`: String, fn: js.Function0[_]): Boolean = js.native
}

