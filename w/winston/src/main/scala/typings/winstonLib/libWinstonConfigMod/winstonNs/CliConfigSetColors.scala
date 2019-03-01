package typings
package winstonLib.libWinstonConfigMod.winstonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CliConfigSetColors extends AbstractConfigSetColors {
  var data: java.lang.String | js.Array[java.lang.String]
  var debug: java.lang.String | js.Array[java.lang.String]
  var error: java.lang.String | js.Array[java.lang.String]
  var help: java.lang.String | js.Array[java.lang.String]
  var info: java.lang.String | js.Array[java.lang.String]
  var input: java.lang.String | js.Array[java.lang.String]
  var prompt: java.lang.String | js.Array[java.lang.String]
  var silly: java.lang.String | js.Array[java.lang.String]
  var verbose: java.lang.String | js.Array[java.lang.String]
  var warn: java.lang.String | js.Array[java.lang.String]
}

object CliConfigSetColors {
  @scala.inline
  def apply(
    data: java.lang.String | js.Array[java.lang.String],
    debug: java.lang.String | js.Array[java.lang.String],
    error: java.lang.String | js.Array[java.lang.String],
    help: java.lang.String | js.Array[java.lang.String],
    info: java.lang.String | js.Array[java.lang.String],
    input: java.lang.String | js.Array[java.lang.String],
    prompt: java.lang.String | js.Array[java.lang.String],
    silly: java.lang.String | js.Array[java.lang.String],
    verbose: java.lang.String | js.Array[java.lang.String],
    warn: java.lang.String | js.Array[java.lang.String]
  ): CliConfigSetColors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    __obj.updateDynamic("silly")(silly.asInstanceOf[js.Any])
    __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("warn")(warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CliConfigSetColors]
  }
}

