package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.IAPISuccessParam
import typings.wechatMiniprogram.anon.Removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRemoveResult extends IAPISuccessParam {
  
  var stats: Removed = js.native
}
object IRemoveResult {
  
  @scala.inline
  def apply(errMsg: String, stats: Removed): IRemoveResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRemoveResult]
  }
  
  @scala.inline
  implicit class IRemoveResultOps[Self <: IRemoveResult] (val x: Self) extends AnyVal {
    
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
    def setStats(value: Removed): Self = this.set("stats", value.asInstanceOf[js.Any])
  }
}
