package typings.stylefire

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgTypesMod {
  
  trait Dimensions extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Dimensions {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): Dimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dimensions]
    }
    
    extension [Self <: Dimensions](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type SVGState = StringDictionary[String | Double]
  
  trait TransformState
    extends StObject
       with /* key */ StringDictionary[String] {
    
    var rotate: String
    
    var scale: String
    
    var skewX: String
    
    var skewY: String
    
    var translate: String
  }
  object TransformState {
    
    inline def apply(rotate: String, scale: String, skewX: String, skewY: String, translate: String): TransformState = {
      val __obj = js.Dynamic.literal(rotate = rotate.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], skewX = skewX.asInstanceOf[js.Any], skewY = skewY.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformState]
    }
    
    extension [Self <: TransformState](x: Self) {
      
      inline def setRotate(value: String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setSkewX(value: String): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
      
      inline def setSkewY(value: String): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
      
      inline def setTranslate(value: String): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    }
  }
}
