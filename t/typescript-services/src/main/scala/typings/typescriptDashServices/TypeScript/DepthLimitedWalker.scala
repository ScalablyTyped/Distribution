package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.DepthLimitedWalker")
@js.native
class DepthLimitedWalker protected () extends PositionTrackingWalker {
  def this(maximumDepth: Double) = this()
  var _depth: js.Any = js.native
  var _maximumDepth: js.Any = js.native
}

