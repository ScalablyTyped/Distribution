package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a 3x3 rotation matrix. */
trait SensorRotationMatrix extends js.Object {
  /** Gets the value at row 1, column 1 of the given rotation matrix. */
  var m11: Double
  /** Gets the value at row 1, column 2 of the given rotation matrix. */
  var m12: Double
  /** Gets the value at row 1, column 3 of the given rotation matrix. */
  var m13: Double
  /** Gets the value at row 2, column 1 of the given rotation matrix. */
  var m21: Double
  /** Gets the value at row 2, column 2 of the given rotation matrix. */
  var m22: Double
  /** Gets the value at row 2, column 3 of the given rotation matrix. */
  var m23: Double
  /** Gets the value at row 3, column 1 of the given rotation matrix. */
  var m31: Double
  /** Gets the value at row 3, column 2 of the given rotation matrix. */
  var m32: Double
  /** Gets the value at row 3, column 3 of the given rotation matrix. */
  var m33: Double
}

object SensorRotationMatrix {
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
  ): SensorRotationMatrix = {
    val __obj = js.Dynamic.literal(m11 = m11.asInstanceOf[js.Any], m12 = m12.asInstanceOf[js.Any], m13 = m13.asInstanceOf[js.Any], m21 = m21.asInstanceOf[js.Any], m22 = m22.asInstanceOf[js.Any], m23 = m23.asInstanceOf[js.Any], m31 = m31.asInstanceOf[js.Any], m32 = m32.asInstanceOf[js.Any], m33 = m33.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorRotationMatrix]
  }
}

