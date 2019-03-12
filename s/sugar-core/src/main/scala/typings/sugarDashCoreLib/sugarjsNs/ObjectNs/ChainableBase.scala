package typings
package sugarDashCoreLib.sugarjsNs.ObjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue
}

object ChainableBase {
  @scala.inline
  def apply[RawValue](raw: RawValue, toString: () => java.lang.String, valueOf: () => RawValue): ChainableBase[RawValue] = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], toString = js.Any.fromFunction0(toString), valueOf = js.Any.fromFunction0(valueOf))
  
    __obj.asInstanceOf[ChainableBase[RawValue]]
  }
}

