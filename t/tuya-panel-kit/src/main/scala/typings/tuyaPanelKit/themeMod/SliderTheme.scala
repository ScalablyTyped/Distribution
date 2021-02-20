package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderTheme extends StObject {
  
  var maximumTrackTintColor: String = js.native
  
  var thumbRadius: Double = js.native
  
  var thumbSize: Double = js.native
  
  var thumbTintColor: String = js.native
  
  var trackHeight: Double = js.native
  
  var trackRadius: Double = js.native
  
  var width: Double | Null = js.native
}
object SliderTheme {
  
  @scala.inline
  def apply(
    maximumTrackTintColor: String,
    thumbRadius: Double,
    thumbSize: Double,
    thumbTintColor: String,
    trackHeight: Double,
    trackRadius: Double
  ): SliderTheme = {
    val __obj = js.Dynamic.literal(maximumTrackTintColor = maximumTrackTintColor.asInstanceOf[js.Any], thumbRadius = thumbRadius.asInstanceOf[js.Any], thumbSize = thumbSize.asInstanceOf[js.Any], thumbTintColor = thumbTintColor.asInstanceOf[js.Any], trackHeight = trackHeight.asInstanceOf[js.Any], trackRadius = trackRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderTheme]
  }
  
  @scala.inline
  implicit class SliderThemeMutableBuilder[Self <: SliderTheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumTrackTintColor(value: String): Self = StObject.set(x, "maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbRadius(value: Double): Self = StObject.set(x, "thumbRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbSize(value: Double): Self = StObject.set(x, "thumbSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbTintColor(value: String): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackHeight(value: Double): Self = StObject.set(x, "trackHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackRadius(value: Double): Self = StObject.set(x, "trackRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthNull: Self = StObject.set(x, "width", null)
  }
}
