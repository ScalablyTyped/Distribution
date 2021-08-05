package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManipulationDelta extends StObject {
  
  var expansion: Double
  
  var rotation: Double
  
  var scale: Double
  
  var translation: Point
}
object ManipulationDelta {
  
  inline def apply(expansion: Double, rotation: Double, scale: Double, translation: Point): ManipulationDelta = {
    val __obj = js.Dynamic.literal(expansion = expansion.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], translation = translation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManipulationDelta]
  }
  
  extension [Self <: ManipulationDelta](x: Self) {
    
    inline def setExpansion(value: Double): Self = StObject.set(x, "expansion", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setTranslation(value: Point): Self = StObject.set(x, "translation", value.asInstanceOf[js.Any])
  }
}
