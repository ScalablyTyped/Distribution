package typings.videoDotJs.videoDotJsMod.default

import typings.videoDotJs.videoDotJsMod.videojs.Middleware
import typings.videoDotJs.videoDotJsMod.videojs.Player
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "use")
@js.native
object use extends js.Object {
  /**
    * Register a middleware to a source type.
    *
    * @param type A string representing a MIME type.
    * @param middleware A middleware factory that takes a player.
    */
  def apply(`type`: String, middleware: js.Function1[/* player */ Player, Middleware]): Unit = js.native
}

