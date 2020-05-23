package typings.webgme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DSN extends js.Object {
  var DSN: String
  var enable: Boolean
  var ravenOptions: Null | String
}

object DSN {
  @scala.inline
  def apply(DSN: String, enable: Boolean, ravenOptions: String = null): DSN = {
    val __obj = js.Dynamic.literal(DSN = DSN.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], ravenOptions = ravenOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSN]
  }
}

