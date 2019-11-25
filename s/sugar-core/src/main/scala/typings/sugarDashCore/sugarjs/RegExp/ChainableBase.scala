package typings.sugarDashCore.sugarjs.RegExp

import typings.std.RegExpExecArray
import typings.sugarDashCore.sugarjs.SugarDefaultChainable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue
  def exec(string: java.lang.String): SugarDefaultChainable[RegExpExecArray | Null]
  def test(string: java.lang.String): SugarDefaultChainable[Boolean]
}

object ChainableBase {
  @scala.inline
  def apply[RawValue](
    exec: java.lang.String => SugarDefaultChainable[RegExpExecArray | Null],
    raw: RawValue,
    test: java.lang.String => SugarDefaultChainable[Boolean]
  ): ChainableBase[RawValue] = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), raw = raw.asInstanceOf[js.Any], test = js.Any.fromFunction1(test))
  
    __obj.asInstanceOf[ChainableBase[RawValue]]
  }
}

