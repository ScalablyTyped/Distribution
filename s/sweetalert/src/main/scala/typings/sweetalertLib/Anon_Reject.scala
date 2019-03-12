package typings
package sweetalertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Reject extends js.Object {
  var reject: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var resolve: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
}

object Anon_Reject {
  @scala.inline
  def apply(reject: () => scala.Unit = null, resolve: /* value */ java.lang.String => scala.Unit = null): Anon_Reject = {
    val __obj = js.Dynamic.literal()
    if (reject != null) __obj.updateDynamic("reject")(js.Any.fromFunction0(reject))
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[Anon_Reject]
  }
}

