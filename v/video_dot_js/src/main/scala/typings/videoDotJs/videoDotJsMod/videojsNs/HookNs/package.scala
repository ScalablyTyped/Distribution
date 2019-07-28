package typings.videoDotJs.videoDotJsMod.videojsNs

import typings.std.HTMLVideoElement
import typings.videoDotJs.videoDotJsMod.videojsNs.Player
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HookNs {
  type BeforeSetup = js.Function2[/* element */ HTMLVideoElement, /* options */ js.Any, js.Any]
  type Setup = js.Function1[/* player */ Player, Unit]
}
