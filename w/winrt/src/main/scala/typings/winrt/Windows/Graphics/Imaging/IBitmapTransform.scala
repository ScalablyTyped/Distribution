package typings.winrt.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBitmapTransform extends StObject {
  
  var bounds: BitmapBounds
  
  var flip: BitmapFlip
  
  var interpolationMode: BitmapInterpolationMode
  
  var rotation: BitmapRotation
  
  var scaledHeight: Double
  
  var scaledWidth: Double
}
object IBitmapTransform {
  
  inline def apply(
    bounds: BitmapBounds,
    flip: BitmapFlip,
    interpolationMode: BitmapInterpolationMode,
    rotation: BitmapRotation,
    scaledHeight: Double,
    scaledWidth: Double
  ): IBitmapTransform = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], flip = flip.asInstanceOf[js.Any], interpolationMode = interpolationMode.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaledHeight = scaledHeight.asInstanceOf[js.Any], scaledWidth = scaledWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitmapTransform]
  }
  
  extension [Self <: IBitmapTransform](x: Self) {
    
    inline def setBounds(value: BitmapBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setFlip(value: BitmapFlip): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    inline def setInterpolationMode(value: BitmapInterpolationMode): Self = StObject.set(x, "interpolationMode", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: BitmapRotation): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setScaledHeight(value: Double): Self = StObject.set(x, "scaledHeight", value.asInstanceOf[js.Any])
    
    inline def setScaledWidth(value: Double): Self = StObject.set(x, "scaledWidth", value.asInstanceOf[js.Any])
  }
}
