package typings.vis.anon

import typings.vis.mod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Canvas extends js.Object {
  var DOM: Position
  var canvas: Position
}

object Canvas {
  @scala.inline
  def apply(DOM: Position, canvas: Position): Canvas = {
    val __obj = js.Dynamic.literal(DOM = DOM.asInstanceOf[js.Any], canvas = canvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canvas]
  }
}

