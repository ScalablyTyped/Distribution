package typings.winston.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NpmConfigSetColors extends AbstractConfigSetColors {
  
  var debug: String | js.Array[String] = js.native
  
  var error: String | js.Array[String] = js.native
  
  var info: String | js.Array[String] = js.native
  
  var silly: String | js.Array[String] = js.native
  
  var verbose: String | js.Array[String] = js.native
  
  var warn: String | js.Array[String] = js.native
}
object NpmConfigSetColors {
  
  @scala.inline
  def apply(
    debug: String | js.Array[String],
    error: String | js.Array[String],
    info: String | js.Array[String],
    silly: String | js.Array[String],
    verbose: String | js.Array[String],
    warn: String | js.Array[String]
  ): NpmConfigSetColors = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], silly = silly.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NpmConfigSetColors]
  }
  
  @scala.inline
  implicit class NpmConfigSetColorsOps[Self <: NpmConfigSetColors] (val x: Self) extends AnyVal {
    
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
    def setDebugVarargs(value: String*): Self = this.set("debug", js.Array(value :_*))
    
    @scala.inline
    def setDebug(value: String | js.Array[String]): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorVarargs(value: String*): Self = this.set("error", js.Array(value :_*))
    
    @scala.inline
    def setError(value: String | js.Array[String]): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoVarargs(value: String*): Self = this.set("info", js.Array(value :_*))
    
    @scala.inline
    def setInfo(value: String | js.Array[String]): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSillyVarargs(value: String*): Self = this.set("silly", js.Array(value :_*))
    
    @scala.inline
    def setSilly(value: String | js.Array[String]): Self = this.set("silly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseVarargs(value: String*): Self = this.set("verbose", js.Array(value :_*))
    
    @scala.inline
    def setVerbose(value: String | js.Array[String]): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarnVarargs(value: String*): Self = this.set("warn", js.Array(value :_*))
    
    @scala.inline
    def setWarn(value: String | js.Array[String]): Self = this.set("warn", value.asInstanceOf[js.Any])
  }
}
