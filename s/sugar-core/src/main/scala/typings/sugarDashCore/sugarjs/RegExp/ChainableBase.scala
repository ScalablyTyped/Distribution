package typings.sugarDashCore.sugarjs.RegExp

import typings.std.RegExpExecArray
import typings.sugarDashCore.sugarjs.SugarDefaultChainable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue
  def exec(string: String): SugarDefaultChainable[RegExpExecArray | Null]
  def test(string: String): SugarDefaultChainable[Boolean]
}

object ChainableBase {
  @scala.inline
  def apply[RawValue](
    exec: String => SugarDefaultChainable[RegExpExecArray | Null],
    raw: RawValue,
    test: String => SugarDefaultChainable[Boolean],
    toString: () => String,
    valueOf: () => RawValue
  ): ChainableBase[RawValue] = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), raw = raw.asInstanceOf[js.Any], test = js.Any.fromFunction1(test), toString = js.Any.fromFunction0(toString), valueOf = js.Any.fromFunction0(valueOf))
  
    __obj.asInstanceOf[ChainableBase[RawValue]]
  }
}

