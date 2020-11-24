package typings.winston.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyslogConfigSetColors extends AbstractConfigSetColors {
  
  var alert: String | js.Array[String] = js.native
  
  var crit: String | js.Array[String] = js.native
  
  var debug: String | js.Array[String] = js.native
  
  var emerg: String | js.Array[String] = js.native
  
  var error: String | js.Array[String] = js.native
  
  var info: String | js.Array[String] = js.native
  
  var notice: String | js.Array[String] = js.native
  
  var warning: String | js.Array[String] = js.native
}
object SyslogConfigSetColors {
  
  @scala.inline
  def apply(
    alert: String | js.Array[String],
    crit: String | js.Array[String],
    debug: String | js.Array[String],
    emerg: String | js.Array[String],
    error: String | js.Array[String],
    info: String | js.Array[String],
    notice: String | js.Array[String],
    warning: String | js.Array[String]
  ): SyslogConfigSetColors = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], crit = crit.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], emerg = emerg.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], notice = notice.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyslogConfigSetColors]
  }
  
  @scala.inline
  implicit class SyslogConfigSetColorsOps[Self <: SyslogConfigSetColors] (val x: Self) extends AnyVal {
    
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
    def setAlertVarargs(value: String*): Self = this.set("alert", js.Array(value :_*))
    
    @scala.inline
    def setAlert(value: String | js.Array[String]): Self = this.set("alert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCritVarargs(value: String*): Self = this.set("crit", js.Array(value :_*))
    
    @scala.inline
    def setCrit(value: String | js.Array[String]): Self = this.set("crit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugVarargs(value: String*): Self = this.set("debug", js.Array(value :_*))
    
    @scala.inline
    def setDebug(value: String | js.Array[String]): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmergVarargs(value: String*): Self = this.set("emerg", js.Array(value :_*))
    
    @scala.inline
    def setEmerg(value: String | js.Array[String]): Self = this.set("emerg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorVarargs(value: String*): Self = this.set("error", js.Array(value :_*))
    
    @scala.inline
    def setError(value: String | js.Array[String]): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoVarargs(value: String*): Self = this.set("info", js.Array(value :_*))
    
    @scala.inline
    def setInfo(value: String | js.Array[String]): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoticeVarargs(value: String*): Self = this.set("notice", js.Array(value :_*))
    
    @scala.inline
    def setNotice(value: String | js.Array[String]): Self = this.set("notice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningVarargs(value: String*): Self = this.set("warning", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: String | js.Array[String]): Self = this.set("warning", value.asInstanceOf[js.Any])
  }
}
