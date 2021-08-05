package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderTheme extends StObject {
  
  var maximumTrackTintColor: String
  
  var thumbRadius: Double
  
  var thumbSize: Double
  
  var thumbTintColor: String
  
  var trackHeight: Double
  
  var trackRadius: Double
  
  var width: Double | Null
}
object SliderTheme {
  
  inline def apply(
    maximumTrackTintColor: String,
    thumbRadius: Double,
    thumbSize: Double,
    thumbTintColor: String,
    trackHeight: Double,
    trackRadius: Double
  ): SliderTheme = {
    val __obj = js.Dynamic.literal(maximumTrackTintColor = maximumTrackTintColor.asInstanceOf[js.Any], thumbRadius = thumbRadius.asInstanceOf[js.Any], thumbSize = thumbSize.asInstanceOf[js.Any], thumbTintColor = thumbTintColor.asInstanceOf[js.Any], trackHeight = trackHeight.asInstanceOf[js.Any], trackRadius = trackRadius.asInstanceOf[js.Any], width = null)
    __obj.asInstanceOf[SliderTheme]
  }
  
  extension [Self <: SliderTheme](x: Self) {
    
    inline def setMaximumTrackTintColor(value: String): Self = StObject.set(x, "maximumTrackTintColor", value.asInstanceOf[js.Any])
    
    inline def setThumbRadius(value: Double): Self = StObject.set(x, "thumbRadius", value.asInstanceOf[js.Any])
    
    inline def setThumbSize(value: Double): Self = StObject.set(x, "thumbSize", value.asInstanceOf[js.Any])
    
    inline def setThumbTintColor(value: String): Self = StObject.set(x, "thumbTintColor", value.asInstanceOf[js.Any])
    
    inline def setTrackHeight(value: Double): Self = StObject.set(x, "trackHeight", value.asInstanceOf[js.Any])
    
    inline def setTrackRadius(value: Double): Self = StObject.set(x, "trackRadius", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
  }
}
