package typings.wechatMiniprogram.DB

import typings.wechatMiniprogram.IAPISuccessParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQueryResult extends IAPISuccessParam {
  
  var data: js.Array[IDocumentData] = js.native
}
object IQueryResult {
  
  @scala.inline
  def apply(data: js.Array[IDocumentData], errMsg: String): IQueryResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryResult]
  }
  
  @scala.inline
  implicit class IQueryResultMutableBuilder[Self <: IQueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[IDocumentData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: IDocumentData*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
