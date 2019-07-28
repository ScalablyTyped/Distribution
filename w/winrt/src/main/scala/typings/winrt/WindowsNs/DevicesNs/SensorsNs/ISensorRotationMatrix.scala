package typings.winrt.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISensorRotationMatrix extends js.Object {
  var m11: Double
  var m12: Double
  var m13: Double
  var m21: Double
  var m22: Double
  var m23: Double
  var m31: Double
  var m32: Double
  var m33: Double
}

object ISensorRotationMatrix {
  @scala.inline
  def apply(
    m11: Double,
    m12: Double,
    m13: Double,
    m21: Double,
    m22: Double,
    m23: Double,
    m31: Double,
    m32: Double,
    m33: Double
  ): ISensorRotationMatrix = {
    val __obj = js.Dynamic.literal(m11 = m11, m12 = m12, m13 = m13, m21 = m21, m22 = m22, m23 = m23, m31 = m31, m32 = m32, m33 = m33)
  
    __obj.asInstanceOf[ISensorRotationMatrix]
  }
}

