package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionPushDownProps
  extends StObject
     with MotionProps {
  
  var dropHeight: js.UndefOr[Double] = js.undefined
  
  var isAlign: js.UndefOr[Boolean] = js.undefined
}
object MotionPushDownProps {
  
  @scala.inline
  def apply(): MotionPushDownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionPushDownProps]
  }
  
  @scala.inline
  implicit class MotionPushDownPropsMutableBuilder[Self <: MotionPushDownProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropHeight(value: Double): Self = StObject.set(x, "dropHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropHeightUndefined: Self = StObject.set(x, "dropHeight", js.undefined)
    
    @scala.inline
    def setIsAlign(value: Boolean): Self = StObject.set(x, "isAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAlignUndefined: Self = StObject.set(x, "isAlign", js.undefined)
  }
}
