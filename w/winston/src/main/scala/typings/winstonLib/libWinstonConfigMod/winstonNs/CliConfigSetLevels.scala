package typings
package winstonLib.libWinstonConfigMod.winstonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CliConfigSetLevels extends AbstractConfigSetLevels {
  var data: scala.Double
  var debug: scala.Double
  var error: scala.Double
  var help: scala.Double
  var info: scala.Double
  var input: scala.Double
  var prompt: scala.Double
  var silly: scala.Double
  var verbose: scala.Double
  var warn: scala.Double
}

object CliConfigSetLevels {
  @scala.inline
  def apply(
    data: scala.Double,
    debug: scala.Double,
    error: scala.Double,
    help: scala.Double,
    info: scala.Double,
    input: scala.Double,
    prompt: scala.Double,
    silly: scala.Double,
    verbose: scala.Double,
    warn: scala.Double
  ): CliConfigSetLevels = {
    val __obj = js.Dynamic.literal(data = data, debug = debug, error = error, help = help, info = info, input = input, prompt = prompt, silly = silly, verbose = verbose, warn = warn)
  
    __obj.asInstanceOf[CliConfigSetLevels]
  }
}

