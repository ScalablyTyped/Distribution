package typings.userAgents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends js.Object {
  
  /**
    *  The value of navigator.appName
    */
  var appName: String = js.native
  
  /**
    *  The value of navigator.connection
    */
  var connection: js.UndefOr[Connection] = js.native
  
  /**
    *  The value of navigator.cpuClass
    */
  var cpuClass: js.UndefOr[String] = js.native
  
  /**
    * One of desktop, mobile, or tablet depending on the type of device
    */
  var deviceCategory: js.UndefOr[String] = js.native
  
  /**
    *  The value of navigator.oscpu
    */
  var oscpu: js.UndefOr[String] = js.native
  
  /**
    * The value of navigator.platform
    */
  var platform: String = js.native
  
  /**
    * The value of navigator.plugins.length
    */
  var pluginsLength: Double = js.native
  
  /**
    *  The value of screen.height
    */
  var screenHeight: Double = js.native
  
  /**
    * The value of screen.width
    */
  var screenWidth: Double = js.native
  
  /**
    * The value of navigator.userAgent
    */
  var userAgent: String = js.native
  
  /**
    * The value of navigator.vendor
    */
  var vendor: String = js.native
  
  /**
    * The value of window.innerHeight
    */
  var viewportHeight: Double = js.native
  
  /**
    * The value of window.innerWidth
    */
  var viewportWidth: Double = js.native
}
object Data {
  
  @scala.inline
  def apply(
    appName: String,
    platform: String,
    pluginsLength: Double,
    screenHeight: Double,
    screenWidth: Double,
    userAgent: String,
    vendor: String,
    viewportHeight: Double,
    viewportWidth: Double
  ): Data = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], pluginsLength = pluginsLength.asInstanceOf[js.Any], screenHeight = screenHeight.asInstanceOf[js.Any], screenWidth = screenWidth.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    
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
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsLength(value: Double): Self = this.set("pluginsLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenHeight(value: Double): Self = this.set("screenHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenWidth(value: Double): Self = this.set("screenWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportHeight(value: Double): Self = this.set("viewportHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewportWidth(value: Double): Self = this.set("viewportWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection(value: Connection): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    
    @scala.inline
    def setCpuClass(value: String): Self = this.set("cpuClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpuClass: Self = this.set("cpuClass", js.undefined)
    
    @scala.inline
    def setDeviceCategory(value: String): Self = this.set("deviceCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceCategory: Self = this.set("deviceCategory", js.undefined)
    
    @scala.inline
    def setOscpu(value: String): Self = this.set("oscpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOscpu: Self = this.set("oscpu", js.undefined)
  }
}
