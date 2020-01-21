package typings.wiringPi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait tcs34725RGBC extends js.Object {
  var b: Double
  var c: Double
  var g: Double
  var r: Double
}

object tcs34725RGBC {
  @scala.inline
  def apply(b: Double, c: Double, g: Double, r: Double): tcs34725RGBC = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[tcs34725RGBC]
  }
}

