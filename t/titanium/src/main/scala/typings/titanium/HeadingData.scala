package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object holding compass heading data.
  */
@js.native
trait HeadingData extends js.Object {
  
  /**
    * Accuracy of the compass heading, in platform-specific units.
    */
  var accuracy: js.UndefOr[Double] = js.native
  
  /**
    * Declination in degrees from magnetic North.
    */
  var magneticHeading: js.UndefOr[Double] = js.native
  
  /**
    * Timestamp for the heading data, in milliseconds.
    */
  var timestamp: js.UndefOr[Double] = js.native
  
  /**
    * Declination in degrees from true North.
    */
  var trueHeading: js.UndefOr[Double] = js.native
  
  /**
    * Raw geomagnetic data for the X axis.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * Raw geomagnetic data for the Y axis.
    */
  var y: js.UndefOr[Double] = js.native
  
  /**
    * Raw geomagnetic data for the Z axis.
    */
  var z: js.UndefOr[Double] = js.native
}
object HeadingData {
  
  @scala.inline
  def apply(): HeadingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadingData]
  }
  
  @scala.inline
  implicit class HeadingDataOps[Self <: HeadingData] (val x: Self) extends AnyVal {
    
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
    def setAccuracy(value: Double): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccuracy: Self = this.set("accuracy", js.undefined)
    
    @scala.inline
    def setMagneticHeading(value: Double): Self = this.set("magneticHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagneticHeading: Self = this.set("magneticHeading", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setTrueHeading(value: Double): Self = this.set("trueHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrueHeading: Self = this.set("trueHeading", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
  }
}
