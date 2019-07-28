package typings.winston.libWinstonConfigMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CliConfigSetColors extends AbstractConfigSetColors {
  var data: String | js.Array[String]
  var debug: String | js.Array[String]
  var error: String | js.Array[String]
  var help: String | js.Array[String]
  var info: String | js.Array[String]
  var input: String | js.Array[String]
  var prompt: String | js.Array[String]
  var silly: String | js.Array[String]
  var verbose: String | js.Array[String]
  var warn: String | js.Array[String]
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
    warn: String | js.Array[String],
    StringDictionary: StringDictionary[String | js.Array[String]] = null
  ): CliConfigSetColors = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], silly = silly.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[CliConfigSetColors]
  }
}

