package typings
package uuidDash1345Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Binary extends js.Object {
  var encoding: uuidDash1345Lib.uuidDash1345LibStrings.binary
  var mac: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Binary {
  @scala.inline
  def apply(
    encoding: uuidDash1345Lib.uuidDash1345LibStrings.binary,
    mac: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Binary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(mac)) __obj.updateDynamic("mac")(mac)
    __obj.asInstanceOf[Anon_Binary]
  }
}

