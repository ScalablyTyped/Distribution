package typings
package uuidDash1345Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dns extends js.Object {
  var dns: uuidDash1345Lib.uuidDash1345Mod.UUID
  var oid: uuidDash1345Lib.uuidDash1345Mod.UUID
  var url: uuidDash1345Lib.uuidDash1345Mod.UUID
  var x500: uuidDash1345Lib.uuidDash1345Mod.UUID
}

object Anon_Dns {
  @scala.inline
  def apply(
    dns: uuidDash1345Lib.uuidDash1345Mod.UUID,
    oid: uuidDash1345Lib.uuidDash1345Mod.UUID,
    url: uuidDash1345Lib.uuidDash1345Mod.UUID,
    x500: uuidDash1345Lib.uuidDash1345Mod.UUID
  ): Anon_Dns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dns")(dns)
    __obj.updateDynamic("oid")(oid)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("x500")(x500)
    __obj.asInstanceOf[Anon_Dns]
  }
}

