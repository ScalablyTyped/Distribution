package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScreenBrightnessSuccessRes extends StObject {
  
  /**
    * 屏幕亮度值，范围 0~1，0 最暗，1 最亮。
    */
  var value: js.UndefOr[Double] = js.undefined
}
object GetScreenBrightnessSuccessRes {
  
  @scala.inline
  def apply(): GetScreenBrightnessSuccessRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetScreenBrightnessSuccessRes]
  }
  
  @scala.inline
  implicit class GetScreenBrightnessSuccessResMutableBuilder[Self <: GetScreenBrightnessSuccessRes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
