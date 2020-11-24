package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.IAPIParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAddDocumentOptions
  extends IAPIParam[js.Any] {
  
  var data: IDocumentData = js.native
}
object IAddDocumentOptions {
  
  @scala.inline
  def apply(data: IDocumentData): IAddDocumentOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddDocumentOptions]
  }
  
  @scala.inline
  implicit class IAddDocumentOptionsOps[Self <: IAddDocumentOptions] (val x: Self) extends AnyVal {
    
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
    def setData(value: IDocumentData): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
