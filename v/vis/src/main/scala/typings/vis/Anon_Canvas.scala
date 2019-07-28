package typings.vis

import typings.vis.visMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Canvas extends js.Object {
  var DOM: Position
  var canvas: Position
}

object Anon_Canvas {
  @scala.inline
  def apply(DOM: Position, canvas: Position): Anon_Canvas = {
    val __obj = js.Dynamic.literal(DOM = DOM, canvas = canvas)
  
    __obj.asInstanceOf[Anon_Canvas]
  }
}

