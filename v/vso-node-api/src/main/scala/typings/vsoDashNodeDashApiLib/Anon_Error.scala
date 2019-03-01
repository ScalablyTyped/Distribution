package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: scala.Double
  var warning: scala.Double
}

object Anon_Error {
  @scala.inline
  def apply(error: scala.Double, warning: scala.Double): Anon_Error = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[Anon_Error]
  }
}

