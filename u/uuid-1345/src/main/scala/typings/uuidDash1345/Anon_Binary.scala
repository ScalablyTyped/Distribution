package typings.uuidDash1345

import typings.uuidDash1345.uuidDash1345Strings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Binary extends js.Object {
  var encoding: binary
  var mac: js.UndefOr[Boolean] = js.undefined
}

object Anon_Binary {
  @scala.inline
  def apply(encoding: binary, mac: js.UndefOr[Boolean] = js.undefined): Anon_Binary = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(mac)) __obj.updateDynamic("mac")(mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Binary]
  }
}

