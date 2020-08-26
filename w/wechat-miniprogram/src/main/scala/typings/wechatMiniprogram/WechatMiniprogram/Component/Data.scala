package typings.wechatMiniprogram.WechatMiniprogram.Component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data[D /* <: DataOption */] extends js.Object {
  /** 组件的内部数据，和 `properties` 一同用于组件的模板渲染 */
  var data: js.UndefOr[D] = js.native
}

object Data {
  @scala.inline
  def apply[/* <: typings.wechatMiniprogram.WechatMiniprogram.Component.DataOption */ D](): Data[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Data[D]]
  }
  @scala.inline
  implicit class DataOps[Self <: Data[_], /* <: typings.wechatMiniprogram.WechatMiniprogram.Component.DataOption */ D] (val x: Self with Data[D]) extends AnyVal {
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
    def setData(value: D): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

