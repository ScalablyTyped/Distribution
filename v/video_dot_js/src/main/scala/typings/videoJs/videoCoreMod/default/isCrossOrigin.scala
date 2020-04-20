package typings.videoJs.videoCoreMod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js/dist/alt/video.core", "isCrossOrigin")
@js.native
object isCrossOrigin extends js.Object {
  /**
    * Returns whether the url passed is a cross domain request or not.
    *
    * @param url
    *        The url to check.
    *
    * @return	Whether it is a cross domain request or not.
    */
  def apply(url: String): Boolean = js.native
}

