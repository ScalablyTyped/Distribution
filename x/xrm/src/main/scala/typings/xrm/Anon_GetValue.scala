package typings.xrm

import typings.xrm.XrmEnum.StageCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetValue extends js.Object {
  def getValue(): StageCategory
}

object Anon_GetValue {
  @scala.inline
  def apply(getValue: () => StageCategory): Anon_GetValue = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue))
  
    __obj.asInstanceOf[Anon_GetValue]
  }
}

