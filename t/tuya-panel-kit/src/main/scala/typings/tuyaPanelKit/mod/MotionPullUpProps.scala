package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionPullUpProps
  extends StObject
     with MotionProps {
  
  /**
    * @language zh-CN
    * @description 下拉的高度
    * @defaultValue undefined
    */
  /**
    * @language en-US
    * @description Height of pull down
    * @defaultValue undefined
    */
  var dropHeight: js.UndefOr[Double] = js.undefined
}
object MotionPullUpProps {
  
  inline def apply(): MotionPullUpProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionPullUpProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MotionPullUpProps] (val x: Self) extends AnyVal {
    
    inline def setDropHeight(value: Double): Self = StObject.set(x, "dropHeight", value.asInstanceOf[js.Any])
    
    inline def setDropHeightUndefined: Self = StObject.set(x, "dropHeight", js.undefined)
  }
}
