package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludeClass extends StObject {
  
  var excludeClass: String
  
  var fixed: Boolean
  
  var flip: Boolean
  
  var placement: String
  
  var shown: Boolean
  
  var zIndex: Double
}
object ExcludeClass {
  
  inline def apply(
    excludeClass: String,
    fixed: Boolean,
    flip: Boolean,
    placement: String,
    shown: Boolean,
    zIndex: Double
  ): ExcludeClass = {
    val __obj = js.Dynamic.literal(excludeClass = excludeClass.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], flip = flip.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeClass]
  }
  
  extension [Self <: ExcludeClass](x: Self) {
    
    inline def setExcludeClass(value: String): Self = StObject.set(x, "excludeClass", value.asInstanceOf[js.Any])
    
    inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setShown(value: Boolean): Self = StObject.set(x, "shown", value.asInstanceOf[js.Any])
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
