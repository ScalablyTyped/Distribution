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
    val __obj = js.Dynamic.literal(data = data, debug = debug, error = error, help = help, info = info, input = input, prompt = prompt, silly = silly, verbose = verbose, warn = warn)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CliConfigSetLevels]
  }
}

