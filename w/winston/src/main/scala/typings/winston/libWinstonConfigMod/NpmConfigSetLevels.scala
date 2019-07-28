package typings.winston.libWinstonConfigMod

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
    val __obj = js.Dynamic.literal(debug = debug, error = error, http = http, info = info, silly = silly, verbose = verbose, warn = warn)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[NpmConfigSetLevels]
  }
}

