package typings.styledJsx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Nonce extends js.Object {
  var nonce: js.UndefOr[String] = js.undefined
}

object Nonce {
  @scala.inline
  def apply(nonce: String = null): Nonce = {
    val __obj = js.Dynamic.literal()
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nonce]
  }
}

