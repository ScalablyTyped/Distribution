package typings.xrm

import typings.xrm.XrmEnum.StageCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetValue extends js.Object {
  def getValue(): StageCategory
}

object AnonGetValue {
  @scala.inline
  def apply(getValue: () => StageCategory): AnonGetValue = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue))
  
    __obj.asInstanceOf[AnonGetValue]
  }
}

