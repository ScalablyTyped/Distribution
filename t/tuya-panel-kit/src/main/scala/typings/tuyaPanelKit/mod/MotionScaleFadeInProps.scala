package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MotionScaleFadeInProps extends MotionProps {
  
  var finalScale: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var initScale: js.UndefOr[Double] = js.native
  
  var isAlign: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object MotionScaleFadeInProps {
  
  @scala.inline
  def apply(): MotionScaleFadeInProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionScaleFadeInProps]
  }
  
  @scala.inline
  implicit class MotionScaleFadeInPropsMutableBuilder[Self <: MotionScaleFadeInProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinalScale(value: Double): Self = StObject.set(x, "finalScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalScaleUndefined: Self = StObject.set(x, "finalScale", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setInitScale(value: Double): Self = StObject.set(x, "initScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitScaleUndefined: Self = StObject.set(x, "initScale", js.undefined)
    
    @scala.inline
    def setIsAlign(value: Boolean): Self = StObject.set(x, "isAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAlignUndefined: Self = StObject.set(x, "isAlign", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
