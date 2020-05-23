package typings.xrm.anon

import typings.xrm.XrmEnum.StageCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetValue extends js.Object {
  def getValue(): StageCategory
}

object GetValue {
  @scala.inline
  def apply(getValue: () => StageCategory): GetValue = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue))
    __obj.asInstanceOf[GetValue]
  }
}

