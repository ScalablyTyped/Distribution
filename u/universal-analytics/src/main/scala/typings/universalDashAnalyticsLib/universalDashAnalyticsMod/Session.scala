package typings
package universalDashAnalyticsLib.universalDashAnalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  var cid: js.UndefOr[java.lang.String] = js.undefined
}

object Session {
  @scala.inline
  def apply(cid: java.lang.String = null): Session = {
    val __obj = js.Dynamic.literal()
    if (cid != null) __obj.updateDynamic("cid")(cid)
    __obj.asInstanceOf[Session]
  }
}

