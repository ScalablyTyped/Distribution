package typings.videoJs.mod.videojs

import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "videojs.Hook")
@js.native
object Hook extends js.Object {
  type BeforeSetup = js.Function2[/* element */ HTMLVideoElement, /* options */ js.Any, js.Any]
  type Setup = js.Function1[/* player */ Player, Unit]
}

