package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.DB.IDocumentData
import typings.wechatMiniprogram.ICloudConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wechat-miniprogram.RQ<wechat-miniprogram.DB.IAddDocumentOptions> */
trait RQIAddDocumentOptions extends StObject {
  
  var config: js.UndefOr[ICloudConfig] = js.undefined
  
  var data: IDocumentData
}
object RQIAddDocumentOptions {
  
  inline def apply(data: IDocumentData): RQIAddDocumentOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQIAddDocumentOptions]
  }
  
  extension [Self <: RQIAddDocumentOptions](x: Self) {
    
    inline def setConfig(value: ICloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setData(value: IDocumentData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
