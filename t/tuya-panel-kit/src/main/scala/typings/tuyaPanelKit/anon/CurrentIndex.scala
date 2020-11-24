package typings.tuyaPanelKit.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentIndex extends js.Object {
  
  var count: Double = js.native
  
  var currentIndex: Double = js.native
  
  var dotActiveStyle: StyleProp[ViewStyle] = js.native
  
  var dotStyle: StyleProp[ViewStyle] = js.native
  
  var dotWrapperStyle: StyleProp[ViewStyle] = js.native
}
object CurrentIndex {
  
  @scala.inline
  def apply(count: Double, currentIndex: Double): CurrentIndex = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], currentIndex = currentIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentIndex]
  }
  
  @scala.inline
  implicit class CurrentIndexOps[Self <: CurrentIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentIndex(value: Double): Self = this.set("currentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotActiveStyle(value: StyleProp[ViewStyle]): Self = this.set("dotActiveStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotActiveStyle: Self = this.set("dotActiveStyle", js.undefined)
    
    @scala.inline
    def setDotActiveStyleNull: Self = this.set("dotActiveStyle", null)
    
    @scala.inline
    def setDotStyle(value: StyleProp[ViewStyle]): Self = this.set("dotStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotStyle: Self = this.set("dotStyle", js.undefined)
    
    @scala.inline
    def setDotStyleNull: Self = this.set("dotStyle", null)
    
    @scala.inline
    def setDotWrapperStyle(value: StyleProp[ViewStyle]): Self = this.set("dotWrapperStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotWrapperStyle: Self = this.set("dotWrapperStyle", js.undefined)
    
    @scala.inline
    def setDotWrapperStyleNull: Self = this.set("dotWrapperStyle", null)
  }
}
