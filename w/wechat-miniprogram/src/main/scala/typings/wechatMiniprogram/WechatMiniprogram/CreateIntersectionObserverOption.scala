package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 选项 */
@js.native
trait CreateIntersectionObserverOption extends js.Object {
  /** 初始的相交比例，如果调用时检测到的相交比例与这个值不相等且达到阈值，则会触发一次监听器的回调函数。 */
  var initialRatio: js.UndefOr[Double] = js.native
  /** 是否同时观测多个目标节点（而非一个），如果设为 true ，observe 的 targetSelector 将选中多个节点（注意：同时选中过多节点将影响渲染性能）
    *
    * 最低基础库： `2.0.0` */
  var observeAll: js.UndefOr[Boolean] = js.native
  /** 一个数值数组，包含所有阈值。 */
  var thresholds: js.UndefOr[js.Array[Double]] = js.native
}

object CreateIntersectionObserverOption {
  @scala.inline
  def apply(): CreateIntersectionObserverOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIntersectionObserverOption]
  }
  @scala.inline
  implicit class CreateIntersectionObserverOptionOps[Self <: CreateIntersectionObserverOption] (val x: Self) extends AnyVal {
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
    def setInitialRatio(value: Double): Self = this.set("initialRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialRatio: Self = this.set("initialRatio", js.undefined)
    @scala.inline
    def setObserveAll(value: Boolean): Self = this.set("observeAll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObserveAll: Self = this.set("observeAll", js.undefined)
    @scala.inline
    def setThresholdsVarargs(value: Double*): Self = this.set("thresholds", js.Array(value :_*))
    @scala.inline
    def setThresholds(value: js.Array[Double]): Self = this.set("thresholds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThresholds: Self = this.set("thresholds", js.undefined)
  }
  
}

