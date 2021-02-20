package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.IAPIParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISetSingleDocumentOptions
  extends IAPIParam[js.Any] {
  
  var data: IUpdateCondition = js.native
}
object ISetSingleDocumentOptions {
  
  @scala.inline
  def apply(data: IUpdateCondition): ISetSingleDocumentOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetSingleDocumentOptions]
  }
  
  @scala.inline
  implicit class ISetSingleDocumentOptionsMutableBuilder[Self <: ISetSingleDocumentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: IUpdateCondition): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
