package typings.wiringDashPi.wiringDashPiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait tcs34725HSV extends js.Object {
  var h: Double
  var s: Double
  var v: Double
}

object tcs34725HSV {
  @scala.inline
  def apply(h: Double, s: Double, v: Double): tcs34725HSV = {
    val __obj = js.Dynamic.literal(h = h, s = s, v = v)
  
    __obj.asInstanceOf[tcs34725HSV]
  }
}

