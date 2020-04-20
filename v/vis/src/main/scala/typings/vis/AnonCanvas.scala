package typings.vis

import typings.vis.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanvas extends js.Object {
  var DOM: Position
  var canvas: Position
}

object AnonCanvas {
  @scala.inline
  def apply(DOM: Position, canvas: Position): AnonCanvas = {
    val __obj = js.Dynamic.literal(DOM = DOM.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCanvas]
  }
}

