package typings
package videoDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_All extends js.Object {
  var DEFAULT: java.lang.String
  var all: java.lang.String
  var debug: java.lang.String
  var error: java.lang.String
  var info: java.lang.String
  var off: java.lang.String
  var warn: java.lang.String
}

object Anon_All {
  @scala.inline
  def apply(
    DEFAULT: java.lang.String,
    all: java.lang.String,
    debug: java.lang.String,
    error: java.lang.String,
    info: java.lang.String,
    off: java.lang.String,
    warn: java.lang.String
  ): Anon_All = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DEFAULT")(DEFAULT)
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("off")(off)
    __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[Anon_All]
  }
}

