package typings
package wiringDashPiLib.wiringDashPiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait tcs34725HSV extends js.Object {
  var h: scala.Double
  var s: scala.Double
  var v: scala.Double
}

object tcs34725HSV {
  @scala.inline
  def apply(h: scala.Double, s: scala.Double, v: scala.Double): tcs34725HSV = {
    val __obj = js.Dynamic.literal(h = h, s = s, v = v)
  
    __obj.asInstanceOf[tcs34725HSV]
  }
}

