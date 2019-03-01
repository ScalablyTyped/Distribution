package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeChange extends js.Object {
  var codeChange: scala.Double
  var system: scala.Double
  var text: scala.Double
  var unknown: scala.Double
}

object Anon_CodeChange {
  @scala.inline
  def apply(codeChange: scala.Double, system: scala.Double, text: scala.Double, unknown: scala.Double): Anon_CodeChange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("codeChange")(codeChange)
    __obj.updateDynamic("system")(system)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("unknown")(unknown)
    __obj.asInstanceOf[Anon_CodeChange]
  }
}

