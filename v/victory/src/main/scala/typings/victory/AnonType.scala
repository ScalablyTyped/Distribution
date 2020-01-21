package typings.victory

import typings.victory.mod.ScatterSymbolType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `type`: js.UndefOr[ScatterSymbolType] = js.undefined
}

object AnonType {
  @scala.inline
  def apply(`type`: ScatterSymbolType = null): AnonType = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

