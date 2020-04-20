package typings.webgme.Gme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pos2D extends js.Object {
  var x: Double
  var y: Double
}

object Pos2D {
  @scala.inline
  def apply(x: Double, y: Double): Pos2D = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pos2D]
  }
}

