package typings
package styledDashComponentsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_As[C /* <: java.lang.String */] extends js.Object {
  var as: js.UndefOr[C] = js.undefined
}

object Anon_As {
  @scala.inline
  def apply[C /* <: java.lang.String */](as: C = null): Anon_As[C] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_As[C]]
  }
}

