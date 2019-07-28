package typings.styledDashJsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Nonce extends js.Object {
  var nonce: js.UndefOr[String] = js.undefined
}

object Anon_Nonce {
  @scala.inline
  def apply(nonce: String = null): Anon_Nonce = {
    val __obj = js.Dynamic.literal()
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    __obj.asInstanceOf[Anon_Nonce]
  }
}

