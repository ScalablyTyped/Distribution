package typings
package uuidDash1345Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: uuidDash1345Lib.uuidDash1345LibStrings.`object`
  var mac: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Encoding {
  @scala.inline
  def apply(
    encoding: uuidDash1345Lib.uuidDash1345LibStrings.`object`,
    mac: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Encoding = {
    val __obj = js.Dynamic.literal(encoding = encoding)
    if (!js.isUndefined(mac)) __obj.updateDynamic("mac")(mac)
    __obj.asInstanceOf[Anon_Encoding]
  }
}

