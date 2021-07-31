package typings.tuyaPanelKit.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentIndex extends StObject {
  
  var count: Double
  
  var currentIndex: Double
  
  var dotActiveStyle: StyleProp[ViewStyle]
  
  var dotStyle: StyleProp[ViewStyle]
  
  var dotWrapperStyle: StyleProp[ViewStyle]
}
object CurrentIndex {
  
  @scala.inline
  def apply(count: Double, currentIndex: Double): CurrentIndex = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], currentIndex = currentIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentIndex]
  }
  
  @scala.inline
  implicit class CurrentIndexMutableBuilder[Self <: CurrentIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentIndex(value: Double): Self = StObject.set(x, "currentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotActiveStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotActiveStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotActiveStyleNull: Self = StObject.set(x, "dotActiveStyle", null)
    
    @scala.inline
    def setDotActiveStyleUndefined: Self = StObject.set(x, "dotActiveStyle", js.undefined)
    
    @scala.inline
    def setDotStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotStyleNull: Self = StObject.set(x, "dotStyle", null)
    
    @scala.inline
    def setDotStyleUndefined: Self = StObject.set(x, "dotStyle", js.undefined)
    
    @scala.inline
    def setDotWrapperStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotWrapperStyleNull: Self = StObject.set(x, "dotWrapperStyle", null)
    
    @scala.inline
    def setDotWrapperStyleUndefined: Self = StObject.set(x, "dotWrapperStyle", js.undefined)
  }
}
