package typings.uuidDash1345

import typings.uuidDash1345.uuidDash1345Strings.`object`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: `object`
  var mac: js.UndefOr[Boolean] = js.undefined
}

object Anon_Encoding {
  @scala.inline
  def apply(encoding: `object`, mac: js.UndefOr[Boolean] = js.undefined): Anon_Encoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(mac)) __obj.updateDynamic("mac")(mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Encoding]
  }
}

