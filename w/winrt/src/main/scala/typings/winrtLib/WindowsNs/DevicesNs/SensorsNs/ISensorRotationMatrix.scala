package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISensorRotationMatrix extends js.Object {
  var m11: scala.Double
  var m12: scala.Double
  var m13: scala.Double
  var m21: scala.Double
  var m22: scala.Double
  var m23: scala.Double
  var m31: scala.Double
  var m32: scala.Double
  var m33: scala.Double
}

object ISensorRotationMatrix {
  @scala.inline
  def apply(
    m11: scala.Double,
    m12: scala.Double,
    m13: scala.Double,
    m21: scala.Double,
    m22: scala.Double,
    m23: scala.Double,
    m31: scala.Double,
    m32: scala.Double,
    m33: scala.Double
  ): ISensorRotationMatrix = {
    val __obj = js.Dynamic.literal(m11 = m11, m12 = m12, m13 = m13, m21 = m21, m22 = m22, m23 = m23, m31 = m31, m32 = m32, m33 = m33)
  
    __obj.asInstanceOf[ISensorRotationMatrix]
  }
}

