package typings.webgme.GmeConfig

import typings.webgme.Anon_LevelString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogOptions extends js.Object {
  var log: Anon_LevelString
}

object LogOptions {
  @scala.inline
  def apply(log: Anon_LevelString): LogOptions = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LogOptions]
  }
}

