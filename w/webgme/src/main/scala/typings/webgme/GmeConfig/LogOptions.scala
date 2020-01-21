package typings.webgme.GmeConfig

import typings.webgme.AnonLevelString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogOptions extends js.Object {
  var log: AnonLevelString
}

object LogOptions {
  @scala.inline
  def apply(log: AnonLevelString): LogOptions = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LogOptions]
  }
}

