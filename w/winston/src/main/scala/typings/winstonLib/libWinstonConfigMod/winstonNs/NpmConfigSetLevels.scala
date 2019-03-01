package typings
package winstonLib.libWinstonConfigMod.winstonNs

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
    warn: scala.Double
  ): NpmConfigSetLevels = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("http")(http)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("silly")(silly)
    __obj.updateDynamic("verbose")(verbose)
    __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[NpmConfigSetLevels]
  }
}

