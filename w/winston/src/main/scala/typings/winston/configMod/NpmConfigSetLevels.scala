package typings.winston.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NpmConfigSetLevels extends AbstractConfigSetLevels {
  
  var debug: Double = js.native
  
  var error: Double = js.native
  
  var http: Double = js.native
  
  var info: Double = js.native
  
  var silly: Double = js.native
  
  var verbose: Double = js.native
  
  var warn: Double = js.native
}
object NpmConfigSetLevels {
  
  @scala.inline
  def apply(
    debug: Double,
    error: Double,
    http: Double,
    info: Double,
    silly: Double,
    verbose: Double,
    warn: Double
  ): NpmConfigSetLevels = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], silly = silly.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NpmConfigSetLevels]
  }
  
  @scala.inline
  implicit class NpmConfigSetLevelsOps[Self <: NpmConfigSetLevels] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: Double): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Double): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttp(value: Double): Self = this.set("http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: Double): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilly(value: Double): Self = this.set("silly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbose(value: Double): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarn(value: Double): Self = this.set("warn", value.asInstanceOf[js.Any])
  }
}
