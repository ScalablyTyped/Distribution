package typings.wechatMiniprogram.anon

import typings.wechatMiniprogram.DB.IUpdateCondition
import typings.wechatMiniprogram.ICloudConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wechat-miniprogram.RQ<wechat-miniprogram.DB.ISetSingleDocumentOptions> */
@js.native
trait RQISetSingleDocumentOptio extends StObject {
  
  var config: js.UndefOr[ICloudConfig] = js.native
  
  var data: IUpdateCondition = js.native
}
object RQISetSingleDocumentOptio {
  
  @scala.inline
  def apply(data: IUpdateCondition): RQISetSingleDocumentOptio = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQISetSingleDocumentOptio]
  }
  
  @scala.inline
  implicit class RQISetSingleDocumentOptioMutableBuilder[Self <: RQISetSingleDocumentOptio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: ICloudConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setData(value: IUpdateCondition): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
