package typings.winston.libWinstonConfigMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CliConfigSetLevels extends AbstractConfigSetLevels {
  var data: Double
  var debug: Double
  var error: Double
  var help: Double
  var info: Double
  var input: Double
  var prompt: Double
  var silly: Double
  var verbose: Double
  var warn: Double
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
    warn: Double,
    StringDictionary: StringDictionary[Double] = null
  ): CliConfigSetLevels = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], silly = silly.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CliConfigSetLevels]
  }
}

