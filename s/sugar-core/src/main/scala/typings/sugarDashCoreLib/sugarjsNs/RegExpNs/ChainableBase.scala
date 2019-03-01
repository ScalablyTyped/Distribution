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
    exec: js.Function1[
      java.lang.String, 
      sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[stdLib.RegExpExecArray | scala.Null]
    ],
    raw: RawValue,
    test: js.Function1[java.lang.String, sugarDashCoreLib.sugarjsNs.SugarDefaultChainable[scala.Boolean]],
    toString: js.Function0[java.lang.String],
    valueOf: js.Function0[RawValue]
  ): ChainableBase[RawValue] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exec")(exec)
    __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.updateDynamic("test")(test)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("valueOf")(valueOf)
    __obj.asInstanceOf[ChainableBase[RawValue]]
  }
}

