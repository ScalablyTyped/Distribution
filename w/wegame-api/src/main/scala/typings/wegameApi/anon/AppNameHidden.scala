package typings.wegameApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppNameHidden extends StObject {
  
  /**
    * 游戏名称是否隐藏
    */
  var appNameHidden: Boolean
  
  /**
    * 游戏icon的border颜色色值
    */
  var borderColor: String
  
  /**
    * 游戏icon的border尺寸
    */
  var borderWidth: Double
  
  /**
    * 游戏名称的颜色色值
    */
  var color: String
  
  /**
    * 游戏icon的X轴坐标
    */
  var left: Double
  
  /**
    * 游戏icon的宽高值
    */
  var size: Double
  
  /**
    * 游戏icon的Y轴坐标
    */
  var top: Double
}
object AppNameHidden {
  
  @scala.inline
  def apply(
    appNameHidden: Boolean,
    borderColor: String,
    borderWidth: Double,
    color: String,
    left: Double,
    size: Double,
    top: Double
  ): AppNameHidden = {
    val __obj = js.Dynamic.literal(appNameHidden = appNameHidden.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppNameHidden]
  }
  
  @scala.inline
  implicit class AppNameHiddenMutableBuilder[Self <: AppNameHidden] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppNameHidden(value: Boolean): Self = StObject.set(x, "appNameHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
