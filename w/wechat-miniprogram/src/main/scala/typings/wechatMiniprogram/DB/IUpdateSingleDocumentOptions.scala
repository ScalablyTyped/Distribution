package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.IAPIParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUpdateSingleDocumentOptions
  extends StObject
     with IAPIParam[js.Any] {
  
  var data: IUpdateCondition
}
object IUpdateSingleDocumentOptions {
  
  inline def apply(data: IUpdateCondition): IUpdateSingleDocumentOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateSingleDocumentOptions]
  }
  
  extension [Self <: IUpdateSingleDocumentOptions](x: Self) {
    
    inline def setData(value: IUpdateCondition): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
