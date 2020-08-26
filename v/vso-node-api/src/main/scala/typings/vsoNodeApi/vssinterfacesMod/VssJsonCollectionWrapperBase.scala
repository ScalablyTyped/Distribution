package typings.vsoNodeApi.vssinterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VssJsonCollectionWrapperBase extends js.Object {
  var count: Double = js.native
}

object VssJsonCollectionWrapperBase {
  @scala.inline
  def apply(count: Double): VssJsonCollectionWrapperBase = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[VssJsonCollectionWrapperBase]
  }
  @scala.inline
  implicit class VssJsonCollectionWrapperBaseOps[Self <: VssJsonCollectionWrapperBase] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
  }
  
}

