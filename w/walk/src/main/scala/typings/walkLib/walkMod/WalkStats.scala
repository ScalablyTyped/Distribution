package typings
package walkLib.walkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WalkStats
  extends nodeLib.fsMod.Stats {
  var error: js.UndefOr[nodeLib.NodeJSNs.ErrnoException] = js.native
  var name: java.lang.String = js.native
  var `type`: walkLib.walkLibStrings.file | walkLib.walkLibStrings.directory | walkLib.walkLibStrings.symbolicLink | walkLib.walkLibStrings.blockDevice | walkLib.walkLibStrings.characterDevice | walkLib.walkLibStrings.FIFO | walkLib.walkLibStrings.socket = js.native
}

