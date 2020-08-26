package typings.vegaTypings.transformMod

import typings.vegaTypings.vegaTypingsStrings.stratify
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StratifyTransform extends _Transforms {
  var key: FieldRef = js.native
  var parentKey: FieldRef = js.native
  var `type`: stratify = js.native
}

object StratifyTransform {
  @scala.inline
  def apply(key: FieldRef, parentKey: FieldRef, `type`: stratify): StratifyTransform = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parentKey = parentKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StratifyTransform]
  }
  @scala.inline
  implicit class StratifyTransformOps[Self <: StratifyTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: FieldRef): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentKey(value: FieldRef): Self = this.set("parentKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: stratify): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

