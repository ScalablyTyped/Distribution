package typings.videoJs.videoCoreNovttMod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js/dist/alt/video.core.novtt", "hookOnce")
@js.native
object hookOnce extends js.Object {
  /**
    * Add a function hook that will only run once to a specific videojs lifecycle.
    *
    * @param type
    *        the lifecycle to hook the function to.
    *
    * @param fn
    *        The function or array of functions to attach.
    */
  def apply(`type`: String): Unit = js.native
  def apply(`type`: String, fn: js.Array[js.Function0[_]]): Unit = js.native
  def apply(`type`: String, fn: js.Function0[_]): Unit = js.native
}

