package typings.twoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstructorParams extends StObject {
  
  var autostart: js.UndefOr[Boolean] = js.undefined
  
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var ratio: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[Types] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ConstructorParams {
  
  @scala.inline
  def apply(): ConstructorParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstructorParams]
  }
  
  @scala.inline
  implicit class ConstructorParamsMutableBuilder[Self <: ConstructorParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutostart(value: Boolean): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutostartUndefined: Self = StObject.set(x, "autostart", js.undefined)
    
    @scala.inline
    def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    @scala.inline
    def setType(value: Types): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
