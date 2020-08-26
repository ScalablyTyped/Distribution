package typings.winston.configMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CliConfigSetLevels extends AbstractConfigSetLevels {
  var data: Double = js.native
  var debug: Double = js.native
  var error: Double = js.native
  var help: Double = js.native
  var info: Double = js.native
  var input: Double = js.native
  var prompt: Double = js.native
  var silly: Double = js.native
  var verbose: Double = js.native
  var warn: Double = js.native
}

object CliConfigSetLevels {
  @scala.inline
  def apply(
    data: Double,
    debug: Double,
    error: Double,
    help: Double,
    info: Double,
    input: Double,
    prompt: Double,
    silly: Double,
    verbose: Double,
    warn: Double
  ): CliConfigSetLevels = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], silly = silly.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CliConfigSetLevels]
  }
  @scala.inline
  implicit class CliConfigSetLevelsOps[Self <: CliConfigSetLevels] (val x: Self) extends AnyVal {
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
    def setData(value: Double): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebug(value: Double): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Double): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setHelp(value: Double): Self = this.set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: Double): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: Double): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrompt(value: Double): Self = this.set("prompt", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilly(value: Double): Self = this.set("silly", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbose(value: Double): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarn(value: Double): Self = this.set("warn", value.asInstanceOf[js.Any])
  }
  
}

