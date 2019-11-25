package typings.atWordpressApiDashFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProtectedRaw extends js.Object {
  var `protected`: Boolean
  var raw: String
}

object Anon_ProtectedRaw {
  @scala.inline
  def apply(`protected`: Boolean, raw: String): Anon_ProtectedRaw = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ProtectedRaw]
  }
}

