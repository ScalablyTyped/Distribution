package typings.welldoneSoftwareWhyDidYouRender.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookDifference extends js.Object {
  var diffType: String = js.native
  var nextValue: js.Any = js.native
  var pathString: String = js.native
  var prevValue: js.Any = js.native
}

object HookDifference {
  @scala.inline
  def apply(diffType: String, nextValue: js.Any, pathString: String, prevValue: js.Any): HookDifference = {
    val __obj = js.Dynamic.literal(diffType = diffType.asInstanceOf[js.Any], nextValue = nextValue.asInstanceOf[js.Any], pathString = pathString.asInstanceOf[js.Any], prevValue = prevValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookDifference]
  }
  @scala.inline
  implicit class HookDifferenceOps[Self <: HookDifference] (val x: Self) extends AnyVal {
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
    def setDiffType(value: String): Self = this.set("diffType", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextValue(value: js.Any): Self = this.set("nextValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathString(value: String): Self = this.set("pathString", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevValue(value: js.Any): Self = this.set("prevValue", value.asInstanceOf[js.Any])
  }
  
}

