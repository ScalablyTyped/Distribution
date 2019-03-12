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
  def apply(getValue: () => xrmLib.XrmEnumNs.StageCategory): Anon_GetValue = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue))
  
    __obj.asInstanceOf[Anon_GetValue]
  }
}

