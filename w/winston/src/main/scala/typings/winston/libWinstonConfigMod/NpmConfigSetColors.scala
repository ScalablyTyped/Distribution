package typings.winston.libWinstonConfigMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NpmConfigSetColors extends AbstractConfigSetColors {
  var debug: String | js.Array[String]
  var error: String | js.Array[String]
  var info: String | js.Array[String]
  var silly: String | js.Array[String]
  var verbose: String | js.Array[String]
  var warn: String | js.Array[String]
}

object NpmConfigSetColors {
  @scala.inline
  def apply(
    debug: String | js.Array[String],
    error: String | js.Array[String],
    info: String | js.Array[String],
    silly: String | js.Array[String],
    verbose: String | js.Array[String],
    warn: String | js.Array[String],
    StringDictionary: StringDictionary[String | js.Array[String]] = null
  ): NpmConfigSetColors = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], silly = silly.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[NpmConfigSetColors]
  }
}

