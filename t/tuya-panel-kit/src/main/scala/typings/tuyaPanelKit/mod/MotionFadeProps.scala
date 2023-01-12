package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionFadeProps
  extends StObject
     with MotionProps {
  
  /**
    * @language zh-CN
    * @description 动画不透明度
    * @defaultValue 1
    */
  /**
    * @language en-US
    * @description Animation opacity
    * @defaultValue 1
    */
  var fadeOpacity: js.UndefOr[Double] = js.undefined
}
object MotionFadeProps {
  
  inline def apply(): MotionFadeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionFadeProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MotionFadeProps] (val x: Self) extends AnyVal {
    
    inline def setFadeOpacity(value: Double): Self = StObject.set(x, "fadeOpacity", value.asInstanceOf[js.Any])
    
    inline def setFadeOpacityUndefined: Self = StObject.set(x, "fadeOpacity", js.undefined)
  }
}
