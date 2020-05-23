package typings.videoJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait All extends js.Object {
  var DEFAULT: String
  var all: String
  var debug: String
  var error: String
  var info: String
  var off: String
  var warn: String
}

object All {
  @scala.inline
  def apply(
    DEFAULT: String,
    all: String,
    debug: String,
    error: String,
    info: String,
    off: String,
    warn: String
  ): All = {
    val __obj = js.Dynamic.literal(DEFAULT = DEFAULT.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], off = off.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[All]
  }
}

