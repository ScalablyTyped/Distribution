package typings
package styledDashComponentsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsC[C /* <: java.lang.String */] extends js.Object {
  var as: js.UndefOr[C] = js.undefined
}

object Anon_AsC {
  @scala.inline
  def apply[C /* <: java.lang.String */](as: C = null): Anon_AsC[C] = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AsC[C]]
  }
}

