package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// 界面-----绘图
@js.native
trait CanvasAction extends StObject {
  
  var data: js.Array[CanvasAction | Double | String] = js.native
  
  var method: String = js.native
}
object CanvasAction {
  
  @scala.inline
  def apply(data: js.Array[CanvasAction | Double | String], method: String): CanvasAction = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasAction]
  }
  
  @scala.inline
  implicit class CanvasActionMutableBuilder[Self <: CanvasAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[CanvasAction | Double | String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: (CanvasAction | Double | String)*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
