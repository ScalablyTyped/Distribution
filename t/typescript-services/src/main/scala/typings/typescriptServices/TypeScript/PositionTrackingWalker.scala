package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PositionTrackingWalker")
@js.native
class PositionTrackingWalker () extends SyntaxWalker {
  var _position: js.Any = js.native
  def position(): Double = js.native
  def skip(element: ISyntaxElement): Unit = js.native
}

