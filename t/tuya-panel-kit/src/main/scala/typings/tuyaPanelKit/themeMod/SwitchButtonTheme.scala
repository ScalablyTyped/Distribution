package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwitchButtonTheme extends StObject {
  
  var height: Double = js.native
  
  var margin: Double = js.native
  
  var onThumbTintColor: String = js.native
  
  var onTintColor: String = js.native
  
  var thumbSize: Double = js.native
  
  var thumbTintColor: String = js.native
  
  var tintColor: String = js.native
  
  var width: Double = js.native
}
object SwitchButtonTheme {
  
  @scala.inline
  def apply(
    height: Double,
    margin: Double,
    onThumbTintColor: String,
    onTintColor: String,
    thumbSize: Double,
    thumbTintColor: String,
    tintColor: String,
    width: Double
  ): SwitchButtonTheme = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], onThumbTintColor = onThumbTintColor.asInstanceOf[js.Any], onTintColor = onTintColor.asInstanceOf[js.Any], thumbSize = thumbSize.asInstanceOf[js.Any], thumbTintColor = thumbTintColor.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchButtonTheme]
  }
  
  @scala.inline
  implicit class SwitchButtonThemeMutableBuilder[Self <: SwitchButtonTheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnThumbTintColor(value: String): Self = StObject.set(x, "onThumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTintColor(value: String): Self = StObject.set(x, "onTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbSize(value: Double): Self = StObject.set(x, "thumbSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbTintColor(value: String): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
