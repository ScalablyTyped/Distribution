package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasToTempFilePathOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /**
    * 画布标识，传入 <canvas/> 的 cavas-id
    */
  var canvasId: String
}
object CanvasToTempFilePathOptions {
  
  @scala.inline
  def apply(canvasId: String): CanvasToTempFilePathOptions = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasToTempFilePathOptions]
  }
  
  @scala.inline
  implicit class CanvasToTempFilePathOptionsMutableBuilder[Self <: CanvasToTempFilePathOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanvasId(value: String): Self = StObject.set(x, "canvasId", value.asInstanceOf[js.Any])
  }
}
