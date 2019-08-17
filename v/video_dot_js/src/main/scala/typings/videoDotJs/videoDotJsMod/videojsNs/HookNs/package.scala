package typings.videoDotJs.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HookNs {
  import typings.std.HTMLVideoElement
  import typings.videoDotJs.videoDotJsMod.videojsNs.Player

  type BeforeSetup = js.Function2[/* element */ HTMLVideoElement, /* options */ js.Any, js.Any]
  type Setup = js.Function1[/* player */ Player, Unit]
}
