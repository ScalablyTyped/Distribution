package typings.viewportMercatorProject.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewportOptions extends StObject {
  
  var height: js.UndefOr[Double] = js.native
  
  var projectionMatrix: js.UndefOr[ViewMatrix] = js.native
  
  var viewMatrix: js.UndefOr[ViewMatrix] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object ViewportOptions {
  
  @scala.inline
  def apply(): ViewportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewportOptions]
  }
  
  @scala.inline
  implicit class ViewportOptionsMutableBuilder[Self <: ViewportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setProjectionMatrix(value: ViewMatrix): Self = StObject.set(x, "projectionMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectionMatrixUndefined: Self = StObject.set(x, "projectionMatrix", js.undefined)
    
    @scala.inline
    def setProjectionMatrixVarargs(value: Double*): Self = StObject.set(x, "projectionMatrix", js.Array(value :_*))
    
    @scala.inline
    def setViewMatrix(value: ViewMatrix): Self = StObject.set(x, "viewMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMatrixUndefined: Self = StObject.set(x, "viewMatrix", js.undefined)
    
    @scala.inline
    def setViewMatrixVarargs(value: Double*): Self = StObject.set(x, "viewMatrix", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
