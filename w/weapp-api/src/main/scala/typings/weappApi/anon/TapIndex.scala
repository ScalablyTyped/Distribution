package typings.weappApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TapIndex extends js.Object {
  var tapIndex: Double = js.native
}

object TapIndex {
  @scala.inline
  def apply(tapIndex: Double): TapIndex = {
    val __obj = js.Dynamic.literal(tapIndex = tapIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapIndex]
  }
  @scala.inline
  implicit class TapIndexOps[Self <: TapIndex] (val x: Self) extends AnyVal {
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
    def setTapIndex(value: Double): Self = this.set("tapIndex", value.asInstanceOf[js.Any])
  }
  
}

