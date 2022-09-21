package typings.viewportMercatorProject.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewportOptions extends StObject {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var projectionMatrix: js.UndefOr[ViewMatrix] = js.undefined
  
  var viewMatrix: js.UndefOr[ViewMatrix] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ViewportOptions {
  
  inline def apply(): ViewportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewportOptions]
  }
  
  extension [Self <: ViewportOptions](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setProjectionMatrix(value: ViewMatrix): Self = StObject.set(x, "projectionMatrix", value.asInstanceOf[js.Any])
    
    inline def setProjectionMatrixUndefined: Self = StObject.set(x, "projectionMatrix", js.undefined)
    
    inline def setProjectionMatrixVarargs(value: Double*): Self = StObject.set(x, "projectionMatrix", js.Array(value*))
    
    inline def setViewMatrix(value: ViewMatrix): Self = StObject.set(x, "viewMatrix", value.asInstanceOf[js.Any])
    
    inline def setViewMatrixUndefined: Self = StObject.set(x, "viewMatrix", js.undefined)
    
    inline def setViewMatrixVarargs(value: Double*): Self = StObject.set(x, "viewMatrix", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
