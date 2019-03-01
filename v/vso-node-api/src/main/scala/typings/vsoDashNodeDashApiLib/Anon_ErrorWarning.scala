package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorWarning extends js.Object {
  var error: scala.Double
  var warning: scala.Double
}

object Anon_ErrorWarning {
  @scala.inline
  def apply(error: scala.Double, warning: scala.Double): Anon_ErrorWarning = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[Anon_ErrorWarning]
  }
}

