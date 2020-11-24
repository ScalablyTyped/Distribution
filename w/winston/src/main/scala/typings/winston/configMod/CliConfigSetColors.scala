package typings.winston.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CliConfigSetColors extends AbstractConfigSetColors {
  
  var data: String | js.Array[String] = js.native
  
  var debug: String | js.Array[String] = js.native
  
  var error: String | js.Array[String] = js.native
  
  var help: String | js.Array[String] = js.native
  
  var info: String | js.Array[String] = js.native
  
  var input: String | js.Array[String] = js.native
  
  var prompt: String | js.Array[String] = js.native
  
  var silly: String | js.Array[String] = js.native
  
  var verbose: String | js.Array[String] = js.native
  
  var warn: String | js.Array[String] = js.native
}
object CliConfigSetColors {
  
  @scala.inline
  def apply(
    data: String | js.Array[String],
    debug: String | js.Array[String],
    error: String | js.Array[String],
    help: String | js.Array[String],
    info: String | js.Array[String],
    input: String | js.Array[String],
    prompt: String | js.Array[String],
    silly: String | js.Array[String],
    verbose: String | js.Array[String],
    warn: String | js.Array[String]
  ): CliConfigSetColors = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], silly = silly.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CliConfigSetColors]
  }
  
  @scala.inline
  implicit class CliConfigSetColorsOps[Self <: CliConfigSetColors] (val x: Self) extends AnyVal {
    
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
    def setDataVarargs(value: String*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: String | js.Array[String]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugVarargs(value: String*): Self = this.set("debug", js.Array(value :_*))
    
    @scala.inline
    def setDebug(value: String | js.Array[String]): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorVarargs(value: String*): Self = this.set("error", js.Array(value :_*))
    
    @scala.inline
    def setError(value: String | js.Array[String]): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpVarargs(value: String*): Self = this.set("help", js.Array(value :_*))
    
    @scala.inline
    def setHelp(value: String | js.Array[String]): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoVarargs(value: String*): Self = this.set("info", js.Array(value :_*))
    
    @scala.inline
    def setInfo(value: String | js.Array[String]): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputVarargs(value: String*): Self = this.set("input", js.Array(value :_*))
    
    @scala.inline
    def setInput(value: String | js.Array[String]): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptVarargs(value: String*): Self = this.set("prompt", js.Array(value :_*))
    
    @scala.inline
    def setPrompt(value: String | js.Array[String]): Self = this.set("prompt", value.asInstanceOf[js.Any])
    
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
