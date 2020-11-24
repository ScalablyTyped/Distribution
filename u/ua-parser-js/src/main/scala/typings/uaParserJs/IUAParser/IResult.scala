package typings.uaParserJs.IUAParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResult extends js.Object {
  
  var browser: IBrowser = js.native
  
  var cpu: ICPU = js.native
  
  var device: IDevice = js.native
  
  var engine: IEngine = js.native
  
  var os: IOS = js.native
  
  var ua: String = js.native
}
object IResult {
  
  @scala.inline
  def apply(browser: IBrowser, cpu: ICPU, device: IDevice, engine: IEngine, os: IOS, ua: String): IResult = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], cpu = cpu.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], ua = ua.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResult]
  }
  
  @scala.inline
  implicit class IResultOps[Self <: IResult] (val x: Self) extends AnyVal {
    
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
    def setBrowser(value: IBrowser): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpu(value: ICPU): Self = this.set("cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice(value: IDevice): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: IEngine): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOs(value: IOS): Self = this.set("os", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUa(value: String): Self = this.set("ua", value.asInstanceOf[js.Any])
  }
}
