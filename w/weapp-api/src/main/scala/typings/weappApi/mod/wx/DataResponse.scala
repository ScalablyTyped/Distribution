package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataResponse extends StObject {
  
  /** 回调函数返回的内容 */
  var data: js.Any
}
object DataResponse {
  
  @scala.inline
  def apply(data: js.Any): DataResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataResponse]
  }
  
  @scala.inline
  implicit class DataResponseMutableBuilder[Self <: DataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
