package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Beacon extends StObject {
  
  /**
    * iBeacon 设备的距离
    */
  var accuracy: js.UndefOr[Double] = js.undefined
  
  /**
    * iBeacon 设备的主 id
    */
  var major: js.UndefOr[String] = js.undefined
  
  /**
    * iBeacon 设备的次 id
    */
  var minor: js.UndefOr[String] = js.undefined
  
  /**
    * 表示设备距离的枚举值
    */
  var proximity: js.UndefOr[Double] = js.undefined
  
  /**
    * 表示设备的信号强度
    */
  var rssi: js.UndefOr[Double] = js.undefined
  
  /**
    * iBeacon 设备广播的 uuid
    */
  var uuid: js.UndefOr[String] = js.undefined
}
object Beacon {
  
  @scala.inline
  def apply(): Beacon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Beacon]
  }
  
  @scala.inline
  implicit class BeaconMutableBuilder[Self <: Beacon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    @scala.inline
    def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
    
    @scala.inline
    def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
    
    @scala.inline
    def setProximity(value: Double): Self = StObject.set(x, "proximity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProximityUndefined: Self = StObject.set(x, "proximity", js.undefined)
    
    @scala.inline
    def setRssi(value: Double): Self = StObject.set(x, "rssi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRssiUndefined: Self = StObject.set(x, "rssi", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
