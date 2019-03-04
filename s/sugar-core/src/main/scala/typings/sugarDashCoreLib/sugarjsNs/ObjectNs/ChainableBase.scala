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
  def apply[RawValue](raw: RawValue, toString: js.Function0[java.lang.String], valueOf: js.Function0[RawValue]): ChainableBase[RawValue] = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], toString = toString, valueOf = valueOf)
  
    __obj.asInstanceOf[ChainableBase[RawValue]]
  }
}

