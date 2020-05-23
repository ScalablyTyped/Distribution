package typings.webgme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Log extends js.Object {
  /**
    * Logger settings when running bin scripts.
    *   config.bin.log = see config
    */
  var log: js.Any
}

object Log {
  @scala.inline
  def apply(log: js.Any): Log = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
}

