package typings
package sugarDashCoreLib.sugarjsNs.RegExpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue
  def exec(string: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExpExecArray | scala.Null]
  def test(string: java.lang.String): sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Boolean]
}

object ChainableBase {
  @scala.inline
  def apply[RawValue](
    exec: java.lang.String => sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExpExecArray | scala.Null],
    raw: RawValue,
    test: java.lang.String => sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Boolean],
    toString: () => java.lang.String,
    valueOf: () => RawValue
  ): ChainableBase[RawValue] = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec), raw = raw.asInstanceOf[js.Any], test = js.Any.fromFunction1(test), toString = js.Any.fromFunction0(toString), valueOf = js.Any.fromFunction0(valueOf))
  
    __obj.asInstanceOf[ChainableBase[RawValue]]
  }
}

