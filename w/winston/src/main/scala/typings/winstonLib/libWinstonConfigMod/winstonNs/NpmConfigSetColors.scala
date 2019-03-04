package typings
package winstonLib.libWinstonConfigMod.winstonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NpmConfigSetColors extends AbstractConfigSetColors {
  var debug: java.lang.String | js.Array[java.lang.String]
  var error: java.lang.String | js.Array[java.lang.String]
  var info: java.lang.String | js.Array[java.lang.String]
  var silly: java.lang.String | js.Array[java.lang.String]
  var verbose: java.lang.String | js.Array[java.lang.String]
  var warn: java.lang.String | js.Array[java.lang.String]
}

object NpmConfigSetColors {
  @scala.inline
  def apply(
    debug: java.lang.String | js.Array[java.lang.String],
    error: java.lang.String | js.Array[java.lang.String],
    info: java.lang.String | js.Array[java.lang.String],
    silly: java.lang.String | js.Array[java.lang.String],
    verbose: java.lang.String | js.Array[java.lang.String],
    warn: java.lang.String | js.Array[java.lang.String]
  ): NpmConfigSetColors = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], silly = silly.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NpmConfigSetColors]
  }
}

