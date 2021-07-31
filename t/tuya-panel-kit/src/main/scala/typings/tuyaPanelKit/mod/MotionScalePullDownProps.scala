package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionScalePullDownProps
  extends StObject
     with MotionProps {
  
  var initScale: js.UndefOr[Double] = js.undefined
  
  var isAlign: js.UndefOr[Boolean] = js.undefined
}
object MotionScalePullDownProps {
  
  @scala.inline
  def apply(): MotionScalePullDownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionScalePullDownProps]
  }
  
  @scala.inline
  implicit class MotionScalePullDownPropsMutableBuilder[Self <: MotionScalePullDownProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitScale(value: Double): Self = StObject.set(x, "initScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitScaleUndefined: Self = StObject.set(x, "initScale", js.undefined)
    
    @scala.inline
    def setIsAlign(value: Boolean): Self = StObject.set(x, "isAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAlignUndefined: Self = StObject.set(x, "isAlign", js.undefined)
  }
}
