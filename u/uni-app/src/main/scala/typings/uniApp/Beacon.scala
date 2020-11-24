package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Beacon extends js.Object {
  
  /**
    * iBeacon 设备的距离
    */
  var accuracy: js.UndefOr[Double] = js.native
  
  /**
    * iBeacon 设备的主 id
    */
  var major: js.UndefOr[String] = js.native
  
  /**
    * iBeacon 设备的次 id
    */
  var minor: js.UndefOr[String] = js.native
  
  /**
    * 表示设备距离的枚举值
    */
  var proximity: js.UndefOr[Double] = js.native
  
  /**
    * 表示设备的信号强度
    */
  var rssi: js.UndefOr[Double] = js.native
  
  /**
    * iBeacon 设备广播的 uuid
    */
  var uuid: js.UndefOr[String] = js.native
}
object Beacon {
  
  @scala.inline
  def apply(): Beacon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Beacon]
  }
  
  @scala.inline
  implicit class BeaconOps[Self <: Beacon] (val x: Self) extends AnyVal {
    
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
    def setMajor(value: String): Self = this.set("major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajor: Self = this.set("major", js.undefined)
    
    @scala.inline
    def setMinor(value: String): Self = this.set("minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinor: Self = this.set("minor", js.undefined)
    
    @scala.inline
    def setProximity(value: Double): Self = this.set("proximity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProximity: Self = this.set("proximity", js.undefined)
    
    @scala.inline
    def setRssi(value: Double): Self = this.set("rssi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRssi: Self = this.set("rssi", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
}
