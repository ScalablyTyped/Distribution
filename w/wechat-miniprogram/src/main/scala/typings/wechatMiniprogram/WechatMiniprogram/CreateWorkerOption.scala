package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 可选参数 */
@js.native
trait CreateWorkerOption extends js.Object {
  
  /** 是否使用实验worker。在iOS下，实验worker的JS运行效率比非实验worker提升近十倍，如需在worker内进行重度计算的建议开启此选项。
    *
    * 最低基础库： `2.13.0` */
  var useExperimentalWorker: js.UndefOr[Boolean] = js.native
}
object CreateWorkerOption {
  
  @scala.inline
  def apply(): CreateWorkerOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkerOption]
  }
  
  @scala.inline
  implicit class CreateWorkerOptionOps[Self <: CreateWorkerOption] (val x: Self) extends AnyVal {
    
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
    def setUseExperimentalWorker(value: Boolean): Self = this.set("useExperimentalWorker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseExperimentalWorker: Self = this.set("useExperimentalWorker", js.undefined)
  }
}
