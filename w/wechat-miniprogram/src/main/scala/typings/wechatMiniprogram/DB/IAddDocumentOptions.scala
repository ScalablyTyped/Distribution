package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.IAPIParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAddDocumentOptions
  extends StObject
     with IAPIParam[js.Any] {
  
  var data: IDocumentData
}
object IAddDocumentOptions {
  
  inline def apply(data: IDocumentData): IAddDocumentOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddDocumentOptions]
  }
  
  extension [Self <: IAddDocumentOptions](x: Self) {
    
    inline def setData(value: IDocumentData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
