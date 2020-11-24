package typings.winrtUwp.Windows.Devices.Sensors

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a magnetometer reading. */
@js.native
trait MagnetometerReading extends js.Object {
  
  /** Gets the magnetometer's directional accuracy. */
  var directionalAccuracy: MagnetometerAccuracy = js.native
  
  /** Gets the magnetic field strength in microteslas along the X axis. */
  var magneticFieldX: Double = js.native
  
  /** Gets the magnetic field strength in microteslas along the Y axis. */
  var magneticFieldY: Double = js.native
  
  /** Gets the magnetic field strength in microteslas along the Z axis. */
  var magneticFieldZ: Double = js.native
  
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date = js.native
}
object MagnetometerReading {
  
  @scala.inline
  def apply(
    directionalAccuracy: MagnetometerAccuracy,
    magneticFieldX: Double,
    magneticFieldY: Double,
    magneticFieldZ: Double,
    timestamp: Date
  ): MagnetometerReading = {
    val __obj = js.Dynamic.literal(directionalAccuracy = directionalAccuracy.asInstanceOf[js.Any], magneticFieldX = magneticFieldX.asInstanceOf[js.Any], magneticFieldY = magneticFieldY.asInstanceOf[js.Any], magneticFieldZ = magneticFieldZ.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagnetometerReading]
  }
  
  @scala.inline
  implicit class MagnetometerReadingOps[Self <: MagnetometerReading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirectionalAccuracy(value: MagnetometerAccuracy): Self = this.set("directionalAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagneticFieldX(value: Double): Self = this.set("magneticFieldX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagneticFieldY(value: Double): Self = this.set("magneticFieldY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagneticFieldZ(value: Double): Self = this.set("magneticFieldZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
}
