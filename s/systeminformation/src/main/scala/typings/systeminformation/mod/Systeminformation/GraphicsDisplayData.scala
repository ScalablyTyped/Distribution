package typings.systeminformation.mod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphicsDisplayData extends js.Object {
  
  var builtin: Boolean = js.native
  
  var connection: String = js.native
  
  var currentRefreshRate: Double = js.native
  
  var currentResX: Double = js.native
  
  var currentResY: Double = js.native
  
  var deviceName: String = js.native
  
  var main: Boolean = js.native
  
  var model: String = js.native
  
  var pixeldepth: Double = js.native
  
  var positionX: Double = js.native
  
  var positionY: Double = js.native
  
  var resolutionx: Double = js.native
  
  var resolutiony: Double = js.native
  
  var sizex: Double = js.native
  
  var sizey: Double = js.native
  
  var vendor: String = js.native
}
object GraphicsDisplayData {
  
  @scala.inline
  def apply(
    builtin: Boolean,
    connection: String,
    currentRefreshRate: Double,
    currentResX: Double,
    currentResY: Double,
    deviceName: String,
    main: Boolean,
    model: String,
    pixeldepth: Double,
    positionX: Double,
    positionY: Double,
    resolutionx: Double,
    resolutiony: Double,
    sizex: Double,
    sizey: Double,
    vendor: String
  ): GraphicsDisplayData = {
    val __obj = js.Dynamic.literal(builtin = builtin.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], currentRefreshRate = currentRefreshRate.asInstanceOf[js.Any], currentResX = currentResX.asInstanceOf[js.Any], currentResY = currentResY.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], pixeldepth = pixeldepth.asInstanceOf[js.Any], positionX = positionX.asInstanceOf[js.Any], positionY = positionY.asInstanceOf[js.Any], resolutionx = resolutionx.asInstanceOf[js.Any], resolutiony = resolutiony.asInstanceOf[js.Any], sizex = sizex.asInstanceOf[js.Any], sizey = sizey.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicsDisplayData]
  }
  
  @scala.inline
  implicit class GraphicsDisplayDataOps[Self <: GraphicsDisplayData] (val x: Self) extends AnyVal {
    
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
    def setBuiltin(value: Boolean): Self = this.set("builtin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection(value: String): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRefreshRate(value: Double): Self = this.set("currentRefreshRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentResX(value: Double): Self = this.set("currentResX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentResY(value: Double): Self = this.set("currentResY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMain(value: Boolean): Self = this.set("main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixeldepth(value: Double): Self = this.set("pixeldepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionX(value: Double): Self = this.set("positionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionY(value: Double): Self = this.set("positionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionx(value: Double): Self = this.set("resolutionx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutiony(value: Double): Self = this.set("resolutiony", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizex(value: Double): Self = this.set("sizex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizey(value: Double): Self = this.set("sizey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
  }
}
