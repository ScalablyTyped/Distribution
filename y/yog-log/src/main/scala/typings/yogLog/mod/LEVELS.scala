package typings.yogLog.mod

import typings.yogLog.yogLogStrings.ACCESS
import typings.yogLog.yogLogStrings.ACCESS_ERROR
import typings.yogLog.yogLogStrings.DEBUG
import typings.yogLog.yogLogStrings.FATAL
import typings.yogLog.yogLogStrings.NOTICE
import typings.yogLog.yogLogStrings.TRACE
import typings.yogLog.yogLogStrings.WARNING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LEVELS extends js.Object {
  
  // 访问日志
  var `0`: ACCESS = js.native
  
  // 应用日志等级 ODP格式
  var `1`: FATAL = js.native
  
  var `16`: DEBUG = js.native
  
  var `2`: WARNING = js.native
  
  var `3`: ACCESS_ERROR = js.native
  
  var `4`: NOTICE = js.native
  
  var `8`: TRACE = js.native
}
object LEVELS {
  
  @scala.inline
  def apply(`0`: ACCESS, `1`: FATAL, `16`: DEBUG, `2`: WARNING, `3`: ACCESS_ERROR, `4`: NOTICE, `8`: TRACE): LEVELS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("16")(`16`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LEVELS]
  }
  
  @scala.inline
  implicit class LEVELSOps[Self <: LEVELS] (val x: Self) extends AnyVal {
    
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
    def set0(value: ACCESS): Self = this.set("0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set1(value: FATAL): Self = this.set("1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set16(value: DEBUG): Self = this.set("16", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set2(value: WARNING): Self = this.set("2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set3(value: ACCESS_ERROR): Self = this.set("3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set4(value: NOTICE): Self = this.set("4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set8(value: TRACE): Self = this.set("8", value.asInstanceOf[js.Any])
  }
}
