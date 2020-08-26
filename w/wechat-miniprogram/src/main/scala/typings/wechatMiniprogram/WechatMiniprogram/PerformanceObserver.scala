package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** PerformanceObserver 对象， 用于监听性能相关事件
  *
  * 最低基础库： `2.11.0` */
@js.native
trait PerformanceObserver extends js.Object {
  /** 获取当前支持的所有性能指标类型 */
  var supportedEntryTypes: js.Array[_] = js.native
  /** [PerformanceObserver.disconnect()](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/performance/PerformanceObserver.disconnect.html)
    *
    * 停止监听
    *
    * 最低基础库： `2.11.0` */
  def disconnect(): Unit = js.native
  /** [PerformanceObserver.observe(Object options)](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/performance/PerformanceObserver.observe.html)
    *
    * 开始监听
    *
    * 最低基础库： `2.11.0` */
  def observe(/** 设置 type 监听单个类型的指标，设置 entryTypes 监听多个类型指标。 */
  options: IAnyObject): Unit = js.native
}

object PerformanceObserver {
  @scala.inline
  def apply(disconnect: () => Unit, observe: IAnyObject => Unit, supportedEntryTypes: js.Array[_]): PerformanceObserver = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), observe = js.Any.fromFunction1(observe), supportedEntryTypes = supportedEntryTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceObserver]
  }
  @scala.inline
  implicit class PerformanceObserverOps[Self <: PerformanceObserver] (val x: Self) extends AnyVal {
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
    def setDisconnect(value: () => Unit): Self = this.set("disconnect", js.Any.fromFunction0(value))
    @scala.inline
    def setObserve(value: IAnyObject => Unit): Self = this.set("observe", js.Any.fromFunction1(value))
    @scala.inline
    def setSupportedEntryTypesVarargs(value: js.Any*): Self = this.set("supportedEntryTypes", js.Array(value :_*))
    @scala.inline
    def setSupportedEntryTypes(value: js.Array[_]): Self = this.set("supportedEntryTypes", value.asInstanceOf[js.Any])
  }
  
}

