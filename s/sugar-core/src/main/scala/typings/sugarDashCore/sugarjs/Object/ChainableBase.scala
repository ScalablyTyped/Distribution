package typings.sugarDashCore.sugarjs.Object

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue
}

object ChainableBase {
  @scala.inline
  def apply[RawValue](raw: RawValue): ChainableBase[RawValue] = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChainableBase[RawValue]]
  }
}

