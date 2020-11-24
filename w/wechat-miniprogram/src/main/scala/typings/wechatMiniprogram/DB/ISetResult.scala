package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.IAPISuccessParam
import typings.wechatMiniprogram.anon.Created
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISetResult extends IAPISuccessParam {
  
  var _id: DocumentId = js.native
  
  var stats: Created = js.native
}
object ISetResult {
  
  @scala.inline
  def apply(_id: DocumentId, errMsg: String, stats: Created): ISetResult = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetResult]
  }
  
  @scala.inline
  implicit class ISetResultOps[Self <: ISetResult] (val x: Self) extends AnyVal {
    
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
    def set_id(value: DocumentId): Self = this.set("_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStats(value: Created): Self = this.set("stats", value.asInstanceOf[js.Any])
  }
}
