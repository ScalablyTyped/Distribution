package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafeAreaResult extends StObject {
  
  /**
    * 安全区域右下角纵坐标
    */
  var bottom: js.UndefOr[Double] = js.native
  
  /**
    * 安全区域的高度，单位逻辑像素
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * 安全区域左上角横坐标
    */
  var left: js.UndefOr[Double] = js.native
  
  /**
    * 安全区域右下角横坐标
    */
  var right: js.UndefOr[Double] = js.native
  
  /**
    * 安全区域左上角纵坐标
    */
  var top: js.UndefOr[Double] = js.native
  
  /**
    * 安全区域的宽度，单位逻辑像素
    */
  var width: js.UndefOr[Double] = js.native
}
object SafeAreaResult {
  
  @scala.inline
  def apply(): SafeAreaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeAreaResult]
  }
  
  @scala.inline
  implicit class SafeAreaResultMutableBuilder[Self <: SafeAreaResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
