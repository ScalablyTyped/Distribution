package typings.styledJsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNonce extends js.Object {
  var nonce: js.UndefOr[String] = js.undefined
}

object AnonNonce {
  @scala.inline
  def apply(nonce: String = null): AnonNonce = {
    val __obj = js.Dynamic.literal()
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNonce]
  }
}

