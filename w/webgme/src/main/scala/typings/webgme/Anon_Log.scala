package typings.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Log extends js.Object {
  /**
    * Logger settings when running bin scripts.
    *   config.bin.log = see config
    */
  var log: js.Any
}

object Anon_Log {
  @scala.inline
  def apply(log: js.Any): Anon_Log = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Log]
  }
}

