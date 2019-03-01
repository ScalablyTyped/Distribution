package typings
package xrmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetValue extends js.Object {
  def getValue(): xrmLib.XrmEnumNs.StageCategory
}

object Anon_GetValue {
  @scala.inline
  def apply(getValue: js.Function0[xrmLib.XrmEnumNs.StageCategory]): Anon_GetValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getValue")(getValue)
    __obj.asInstanceOf[Anon_GetValue]
  }
}

