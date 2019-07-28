package typings.uuidDash1345

import typings.uuidDash1345.uuidDash1345Strings.ascii
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ascii extends js.Object {
  var encoding: ascii
  var mac: js.UndefOr[Boolean] = js.undefined
}

object Anon_Ascii {
  @scala.inline
  def apply(encoding: ascii, mac: js.UndefOr[Boolean] = js.undefined): Anon_Ascii = {
    val __obj = js.Dynamic.literal(encoding = encoding)
    if (!js.isUndefined(mac)) __obj.updateDynamic("mac")(mac)
    __obj.asInstanceOf[Anon_Ascii]
  }
}

