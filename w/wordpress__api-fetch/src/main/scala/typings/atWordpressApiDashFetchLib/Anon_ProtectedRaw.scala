package typings
package atWordpressApiDashFetchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ProtectedRaw extends js.Object {
  var `protected`: scala.Boolean
  var raw: java.lang.String
}

object Anon_ProtectedRaw {
  @scala.inline
  def apply(`protected`: scala.Boolean, raw: java.lang.String): Anon_ProtectedRaw = {
    val __obj = js.Dynamic.literal(raw = raw)
    __obj.updateDynamic("protected")(`protected`)
    __obj.asInstanceOf[Anon_ProtectedRaw]
  }
}

