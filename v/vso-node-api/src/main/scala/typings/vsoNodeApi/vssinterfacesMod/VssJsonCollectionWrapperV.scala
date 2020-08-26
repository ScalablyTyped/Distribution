package typings.vsoNodeApi.vssinterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VssJsonCollectionWrapperV[T] extends VssJsonCollectionWrapperBase {
  var value: T = js.native
}

object VssJsonCollectionWrapperV {
  @scala.inline
  def apply[T](count: Double, value: T): VssJsonCollectionWrapperV[T] = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VssJsonCollectionWrapperV[T]]
  }
  @scala.inline
  implicit class VssJsonCollectionWrapperVOps[Self <: VssJsonCollectionWrapperV[_], T] (val x: Self with VssJsonCollectionWrapperV[T]) extends AnyVal {
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
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

