package typings
package uuidDash1345Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ascii extends js.Object {
  var encoding: uuidDash1345Lib.uuidDash1345LibStrings.ascii
  var mac: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Ascii {
  @scala.inline
  def apply(
    encoding: uuidDash1345Lib.uuidDash1345LibStrings.ascii,
    mac: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Ascii = {
    val __obj = js.Dynamic.literal(encoding = encoding)
    if (!js.isUndefined(mac)) __obj.updateDynamic("mac")(mac)
    __obj.asInstanceOf[Anon_Ascii]
  }
}

