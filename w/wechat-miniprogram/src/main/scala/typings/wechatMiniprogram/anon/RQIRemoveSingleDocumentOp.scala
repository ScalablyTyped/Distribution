package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wechat-miniprogram.RQ<wechat-miniprogram.DB.IRemoveSingleDocumentOptions> */
@js.native
trait RQIRemoveSingleDocumentOp extends js.Object {
  
  var config: js.UndefOr[ICloudConfig] = js.native
}
object RQIRemoveSingleDocumentOp {
  
  @scala.inline
  def apply(): RQIRemoveSingleDocumentOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RQIRemoveSingleDocumentOp]
  }
  
  @scala.inline
  implicit class RQIRemoveSingleDocumentOpOps[Self <: RQIRemoveSingleDocumentOp] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: ICloudConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
  }
}
