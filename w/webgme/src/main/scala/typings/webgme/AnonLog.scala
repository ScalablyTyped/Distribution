package typings.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLog extends js.Object {
  /**
    * Logger settings when running bin scripts.
    *   config.bin.log = see config
    */
  var log: js.Any
}

object AnonLog {
  @scala.inline
  def apply(log: js.Any): AnonLog = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLog]
  }
}

