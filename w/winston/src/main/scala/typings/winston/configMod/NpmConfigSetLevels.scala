package typings.winston.configMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NpmConfigSetLevels extends AbstractConfigSetLevels {
  var debug: Double
  var error: Double
  var http: Double
  var info: Double
  var silly: Double
  var verbose: Double
  var warn: Double
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
    warn: Double,
    StringDictionary: StringDictionary[Double] = null
  ): NpmConfigSetLevels = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], silly = silly.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[NpmConfigSetLevels]
  }
}

