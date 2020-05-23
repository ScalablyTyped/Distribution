package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait B extends js.Object {
  var b: Double
  var g: Double
  var r: Double
}

object B {
  @scala.inline
  def apply(b: Double, g: Double, r: Double): B = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[B]
  }
}

