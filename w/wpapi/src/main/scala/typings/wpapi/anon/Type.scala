package typings.wpapi.anon

import typings.wpapi.mod.HTTPArgumentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var `type`: HTTPArgumentType
}

object Type {
  @scala.inline
  def apply(`type`: HTTPArgumentType): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

