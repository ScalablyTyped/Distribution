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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    __obj.updateDynamic("silly")(silly.asInstanceOf[js.Any])
    __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.updateDynamic("warn")(warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NpmConfigSetColors]
  }
}

