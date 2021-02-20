package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object holding compass heading data.
  */
@js.native
trait HeadingData extends StObject {
  
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
  implicit class HeadingDataMutableBuilder[Self <: HeadingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    @scala.inline
    def setMagneticHeading(value: Double): Self = StObject.set(x, "magneticHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagneticHeadingUndefined: Self = StObject.set(x, "magneticHeading", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setTrueHeading(value: Double): Self = StObject.set(x, "trueHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrueHeadingUndefined: Self = StObject.set(x, "trueHeading", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
