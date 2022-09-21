package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasToTempFilePathOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 画布标识，传入 <canvas/> 的 cavas-id
    */
  var canvasId: String
}
object CanvasToTempFilePathOptions {
  
  inline def apply(canvasId: String): CanvasToTempFilePathOptions = {
    val __obj = js.Dynamic.literal(canvasId = canvasId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasToTempFilePathOptions]
  }
  
  extension [Self <: CanvasToTempFilePathOptions](x: Self) {
    
    inline def setCanvasId(value: String): Self = StObject.set(x, "canvasId", value.asInstanceOf[js.Any])
  }
}
