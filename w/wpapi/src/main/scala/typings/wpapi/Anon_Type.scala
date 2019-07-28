package typings.wpapi

import typings.wpapi.wpapiMod.HTTPArgumentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends js.Object {
  var `type`: HTTPArgumentType
}

object Anon_Type {
  @scala.inline
  def apply(`type`: HTTPArgumentType): Anon_Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Type]
  }
}

