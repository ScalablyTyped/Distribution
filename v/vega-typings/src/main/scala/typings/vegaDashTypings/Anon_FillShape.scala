package typings.vegaDashTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FillShape extends js.Object {
  var fill: String
  var shape: String
  var size: Double
  var strokeWidth: Double
}

object Anon_FillShape {
  @scala.inline
  def apply(fill: String, shape: String, size: Double, strokeWidth: Double): Anon_FillShape = {
    val __obj = js.Dynamic.literal(fill = fill, shape = shape, size = size, strokeWidth = strokeWidth)
  
    __obj.asInstanceOf[Anon_FillShape]
  }
}

