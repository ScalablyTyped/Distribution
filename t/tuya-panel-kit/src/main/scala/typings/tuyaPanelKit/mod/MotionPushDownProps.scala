package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionPushDownProps
  extends StObject
     with MotionProps {
  
  /**
    * @language zh-CN
    * @description 下拉的高度
    * @defaultValue 200
    */
  /**
    * @language en-US
    * @description Height of pull down
    * @defaultValue 200
    */
  var dropHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * @language zh-CN
    * @description 是否竖直居中
    * @defaultValue true
    */
  /**
    * @language en-US
    * @description Is it vertically centered
    * @defaultValue true
    */
  var isAlign: js.UndefOr[Boolean] = js.undefined
}
object MotionPushDownProps {
  
  inline def apply(): MotionPushDownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionPushDownProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MotionPushDownProps] (val x: Self) extends AnyVal {
    
    inline def setDropHeight(value: Double): Self = StObject.set(x, "dropHeight", value.asInstanceOf[js.Any])
    
    inline def setDropHeightUndefined: Self = StObject.set(x, "dropHeight", js.undefined)
    
    inline def setIsAlign(value: Boolean): Self = StObject.set(x, "isAlign", value.asInstanceOf[js.Any])
    
    inline def setIsAlignUndefined: Self = StObject.set(x, "isAlign", js.undefined)
  }
}
