package typings.videoJs.videoCoreNovttMod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("video.js/dist/alt/video.core.novtt", "hooks")
@js.native
object hooks extends js.Object {
  
  /**
    * Get a list of hooks for a specific lifecycle
    *
    * @param type
    *        the lifecycle to get hooks from
    *
    * @param [fn]
    *        Optionally add a hook (or hooks) to the lifecycle that your are getting.
    *
    * @return    an array of hooks, or an empty array if there are none.
    */
  def apply(`type`: String): Unit = js.native
  def apply(`type`: String, fn: js.Array[js.Function0[_]]): Unit = js.native
  def apply(`type`: String, fn: js.Function0[_]): Unit = js.native
}
