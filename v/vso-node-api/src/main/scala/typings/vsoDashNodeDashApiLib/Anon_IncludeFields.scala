package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeFields extends js.Object {
  var includeFields: scala.Double
  var none: scala.Double
}

object Anon_IncludeFields {
  @scala.inline
  def apply(includeFields: scala.Double, none: scala.Double): Anon_IncludeFields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("includeFields")(includeFields)
    __obj.updateDynamic("none")(none)
    __obj.asInstanceOf[Anon_IncludeFields]
  }
}

