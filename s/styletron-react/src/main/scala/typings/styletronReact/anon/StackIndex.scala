package typings.styletronReact.anon

import typings.styletronReact.mod.StackInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackIndex extends js.Object {
  var stackIndex: typings.styletronReact.mod.StackIndex = js.native
  var stackInfo: StackInfo = js.native
}

object StackIndex {
  @scala.inline
  def apply(stackIndex: typings.styletronReact.mod.StackIndex, stackInfo: StackInfo): StackIndex = {
    val __obj = js.Dynamic.literal(stackIndex = stackIndex.asInstanceOf[js.Any], stackInfo = stackInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackIndex]
  }
  @scala.inline
  implicit class StackIndexOps[Self <: StackIndex] (val x: Self) extends AnyVal {
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
    def setStackIndex(value: typings.styletronReact.mod.StackIndex): Self = this.set("stackIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackInfo(value: StackInfo): Self = this.set("stackInfo", value.asInstanceOf[js.Any])
  }
  
}

