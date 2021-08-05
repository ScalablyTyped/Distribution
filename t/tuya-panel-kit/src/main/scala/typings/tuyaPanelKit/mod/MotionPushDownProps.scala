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
  
  inline def apply(): MotionPushDownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionPushDownProps]
  }
  
  extension [Self <: MotionPushDownProps](x: Self) {
    
    inline def setDropHeight(value: Double): Self = StObject.set(x, "dropHeight", value.asInstanceOf[js.Any])
    
    inline def setDropHeightUndefined: Self = StObject.set(x, "dropHeight", js.undefined)
    
    inline def setIsAlign(value: Boolean): Self = StObject.set(x, "isAlign", value.asInstanceOf[js.Any])
    
    inline def setIsAlignUndefined: Self = StObject.set(x, "isAlign", js.undefined)
  }
}
