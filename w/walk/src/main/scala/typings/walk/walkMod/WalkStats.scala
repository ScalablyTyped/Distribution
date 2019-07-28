package typings.walk.walkMod

import typings.node.NodeJSNs.ErrnoException
import typings.node.fsMod.Stats
import typings.walk.walkStrings.FIFO
import typings.walk.walkStrings.blockDevice
import typings.walk.walkStrings.characterDevice
import typings.walk.walkStrings.directory
import typings.walk.walkStrings.file
import typings.walk.walkStrings.socket
import typings.walk.walkStrings.symbolicLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WalkStats extends Stats {
  var error: js.UndefOr[ErrnoException] = js.native
  var name: String = js.native
  var `type`: file | directory | symbolicLink | blockDevice | characterDevice | FIFO | socket = js.native
}

