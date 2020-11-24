package typings.videoJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait All extends js.Object {
  
  var DEFAULT: String = js.native
  
  var all: String = js.native
  
  var debug: String = js.native
  
  var error: String = js.native
  
  var info: String = js.native
  
  var off: String = js.native
  
  var warn: String = js.native
}
object All {
  
  @scala.inline
  def apply(
    DEFAULT: String,
    all: String,
    debug: String,
    error: String,
    info: String,
    off: String,
    warn: String
  ): All = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[All]
  }
  
  @scala.inline
  implicit class AllOps[Self <: All] (val x: Self) extends AnyVal {
    
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
    def setDEFAULT(value: String): Self = this.set("DEFAULT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAll(value: String): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: String): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOff(value: String): Self = this.set("off", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarn(value: String): Self = this.set("warn", value.asInstanceOf[js.Any])
  }
}
