package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.DB.IDocumentData
import typings.wechatMiniprogram.ICloudConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wechat-miniprogram.RQ<wechat-miniprogram.DB.IAddDocumentOptions> */
@js.native
trait RQIAddDocumentOptions extends StObject {
  
  var config: js.UndefOr[ICloudConfig] = js.native
  
  var data: IDocumentData = js.native
}
object RQIAddDocumentOptions {
  
  @scala.inline
  def apply(data: IDocumentData): RQIAddDocumentOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQIAddDocumentOptions]
  }
  
  @scala.inline
  implicit class RQIAddDocumentOptionsMutableBuilder[Self <: RQIAddDocumentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: ICloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setData(value: IDocumentData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
