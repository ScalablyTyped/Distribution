package typings
package winstonLib.libWinstonConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NpmConfigSetLevels extends AbstractConfigSetLevels {
  var debug: scala.Double
  var error: scala.Double
  var http: scala.Double
  var info: scala.Double
  var silly: scala.Double
  var verbose: scala.Double
  var warn: scala.Double
}

object NpmConfigSetLevels {
  @scala.inline
  def apply(
    debug: scala.Double,
    error: scala.Double,
    http: scala.Double,
    info: scala.Double,
    silly: scala.Double,
    verbose: scala.Double,
    warn: scala.Double,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[scala.Double] = null
  ): NpmConfigSetLevels = {
    val __obj = js.Dynamic.literal(debug = debug, error = error, http = http, info = info, silly = silly, verbose = verbose, warn = warn)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[NpmConfigSetLevels]
  }
}

