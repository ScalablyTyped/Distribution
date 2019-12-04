package typings.videoDotJs.distAltVideoDotCoreDotNovttMod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js/dist/alt/video.core.novtt", "setFormatTime")
@js.native
object setFormatTime extends js.Object {
  /**
    * Replaces the default formatTime implementation with a custom implementation.
    *
    * @param customImplementation
    *        A function which will be used in place of the default formatTime implementation.
    *        Will receive the current time in seconds and the guide (in seconds) as arguments.
    */
  def apply(customImplementation: js.Function2[/* seconds */ Double, /* guide */ Double, String]): Unit = js.native
}

