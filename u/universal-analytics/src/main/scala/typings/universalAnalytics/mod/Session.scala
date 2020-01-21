package typings.universalAnalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  var cid: js.UndefOr[String] = js.undefined
}

object Session {
  @scala.inline
  def apply(cid: String = null): Session = {
    val __obj = js.Dynamic.literal()
    if (cid != null) __obj.updateDynamic("cid")(cid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
}

