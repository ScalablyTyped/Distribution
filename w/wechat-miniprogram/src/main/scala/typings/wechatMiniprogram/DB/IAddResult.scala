package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.IAPISuccessParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAddResult
  extends StObject
     with IAPISuccessParam {
  
  var _id: DocumentId
}
object IAddResult {
  
  inline def apply(_id: DocumentId, errMsg: String): IAddResult = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddResult]
  }
  
  extension [Self <: IAddResult](x: Self) {
    
    inline def set_id(value: DocumentId): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
