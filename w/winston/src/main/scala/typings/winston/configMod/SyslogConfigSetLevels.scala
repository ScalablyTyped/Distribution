package typings.winston.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyslogConfigSetLevels extends AbstractConfigSetLevels {
  
  var alert: Double = js.native
  
  var crit: Double = js.native
  
  var debug: Double = js.native
  
  var emerg: Double = js.native
  
  var error: Double = js.native
  
  var info: Double = js.native
  
  var notice: Double = js.native
  
  var warning: Double = js.native
}
object SyslogConfigSetLevels {
  
  @scala.inline
  def apply(
    alert: Double,
    crit: Double,
    debug: Double,
    emerg: Double,
    error: Double,
    info: Double,
    notice: Double,
    warning: Double
  ): SyslogConfigSetLevels = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], crit = crit.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], emerg = emerg.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], notice = notice.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyslogConfigSetLevels]
  }
  
  @scala.inline
  implicit class SyslogConfigSetLevelsOps[Self <: SyslogConfigSetLevels] (val x: Self) extends AnyVal {
    
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
    def setAlert(value: Double): Self = this.set("alert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrit(value: Double): Self = this.set("crit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: Double): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmerg(value: Double): Self = this.set("emerg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Double): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: Double): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotice(value: Double): Self = this.set("notice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarning(value: Double): Self = this.set("warning", value.asInstanceOf[js.Any])
  }
}
