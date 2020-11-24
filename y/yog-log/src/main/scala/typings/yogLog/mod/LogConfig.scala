package typings.yogLog.mod

import typings.yogLog.yogLogNumbers.`0`
import typings.yogLog.yogLogNumbers.`16`
import typings.yogLog.yogLogNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogConfig extends js.Object {
  
  var IS_ODP: js.UndefOr[Boolean] = js.native
  
  var IS_OMP: js.UndefOr[`0` | `1`] = js.native
  
  var LogIdName: js.UndefOr[String] = js.native
  
  var access: js.UndefOr[String] = js.native
  
  var access_error_log_path: js.UndefOr[String] = js.native
  
  var access_log_path: js.UndefOr[String] = js.native
  
  var auto_rotate: js.UndefOr[`0` | `1`] = js.native
  
  // 模板文件地址，可以不填
  var data_path: js.UndefOr[String] = js.native
  
  var debug: js.UndefOr[`0` | `1`] = js.native
  
  var format_wf: js.UndefOr[String] = js.native
  
  var intLevel: js.UndefOr[`16`] = js.native
  
  // 用户只需要填写log_path配置
  var log_path: js.UndefOr[String] = js.native
  
  var use_sub_dir: js.UndefOr[`0` | `1`] = js.native
}
object LogConfig {
  
  @scala.inline
  def apply(): LogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfig]
  }
  
  @scala.inline
  implicit class LogConfigOps[Self <: LogConfig] (val x: Self) extends AnyVal {
    
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
    def setIS_ODP(value: Boolean): Self = this.set("IS_ODP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIS_ODP: Self = this.set("IS_ODP", js.undefined)
    
    @scala.inline
    def setIS_OMP(value: `0` | `1`): Self = this.set("IS_OMP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIS_OMP: Self = this.set("IS_OMP", js.undefined)
    
    @scala.inline
    def setLogIdName(value: String): Self = this.set("LogIdName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogIdName: Self = this.set("LogIdName", js.undefined)
    
    @scala.inline
    def setAccess(value: String): Self = this.set("access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess: Self = this.set("access", js.undefined)
    
    @scala.inline
    def setAccess_error_log_path(value: String): Self = this.set("access_error_log_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess_error_log_path: Self = this.set("access_error_log_path", js.undefined)
    
    @scala.inline
    def setAccess_log_path(value: String): Self = this.set("access_log_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess_log_path: Self = this.set("access_log_path", js.undefined)
    
    @scala.inline
    def setAuto_rotate(value: `0` | `1`): Self = this.set("auto_rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuto_rotate: Self = this.set("auto_rotate", js.undefined)
    
    @scala.inline
    def setData_path(value: String): Self = this.set("data_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData_path: Self = this.set("data_path", js.undefined)
    
    @scala.inline
    def setDebug(value: `0` | `1`): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setFormat_wf(value: String): Self = this.set("format_wf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat_wf: Self = this.set("format_wf", js.undefined)
    
    @scala.inline
    def setIntLevel(value: `16`): Self = this.set("intLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntLevel: Self = this.set("intLevel", js.undefined)
    
    @scala.inline
    def setLog_path(value: String): Self = this.set("log_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog_path: Self = this.set("log_path", js.undefined)
    
    @scala.inline
    def setUse_sub_dir(value: `0` | `1`): Self = this.set("use_sub_dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUse_sub_dir: Self = this.set("use_sub_dir", js.undefined)
  }
}
