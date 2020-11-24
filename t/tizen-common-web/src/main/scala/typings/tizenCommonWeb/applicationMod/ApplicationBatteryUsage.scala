package typings.tizenCommonWeb.applicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationBatteryUsage extends js.Object {
  
  /**
    * An attribute storing ID of an application.
    */
  val appId: ApplicationId = js.native
  
  /**
    * An attribute which stores information about battery usage of an application with ApplicationId `appId`.
    * Battery usage is a ratio of battery consumption of the application with ApplicationId `appId` to the total battery consumption of all applications.
    * The attribute value scales from ***0*** to ***1***, the higher value, the more battery is consumed.
    */
  val batteryUsage: Double = js.native
}
object ApplicationBatteryUsage {
  
  @scala.inline
  def apply(appId: ApplicationId, batteryUsage: Double): ApplicationBatteryUsage = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], batteryUsage = batteryUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationBatteryUsage]
  }
  
  @scala.inline
  implicit class ApplicationBatteryUsageOps[Self <: ApplicationBatteryUsage] (val x: Self) extends AnyVal {
    
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
    def setAppId(value: ApplicationId): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatteryUsage(value: Double): Self = this.set("batteryUsage", value.asInstanceOf[js.Any])
  }
}
