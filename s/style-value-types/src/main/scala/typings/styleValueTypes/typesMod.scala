package typings.styleValueTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.styleValueTypes.typesMod.HSLA
    - typings.styleValueTypes.typesMod.RGBA
  */
  trait Color extends StObject
  object Color {
    
    inline def HSLA(hue: Double, lightness: Double, saturation: Double): typings.styleValueTypes.typesMod.HSLA = {
      val __obj = js.Dynamic.literal(hue = hue.asInstanceOf[js.Any], lightness = lightness.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.styleValueTypes.typesMod.HSLA]
    }
    
    inline def RGBA(blue: Double, green: Double, red: Double): typings.styleValueTypes.typesMod.RGBA = {
      val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.styleValueTypes.typesMod.RGBA]
    }
  }
  
  trait HSLA
    extends StObject
       with Color {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var hue: Double
    
    var lightness: Double
    
    var saturation: Double
  }
  object HSLA {
    
    inline def apply(hue: Double, lightness: Double, saturation: Double): HSLA = {
      val __obj = js.Dynamic.literal(hue = hue.asInstanceOf[js.Any], lightness = lightness.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSLA]
    }
    
    extension [Self <: HSLA](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setHue(value: Double): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
      
      inline def setLightness(value: Double): Self = StObject.set(x, "lightness", value.asInstanceOf[js.Any])
      
      inline def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
    }
  }
  
  type NumberMap = StringDictionary[Double]
  
  trait RGBA
    extends StObject
       with Color {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var blue: Double
    
    var green: Double
    
    var red: Double
  }
  object RGBA {
    
    inline def apply(blue: Double, green: Double, red: Double): RGBA = {
      val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBA]
    }
    
    extension [Self <: RGBA](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    }
  }
  
  type Transformer = js.Function1[/* v */ Any, Any]
  
  trait ValueType extends StObject {
    
    var default: js.UndefOr[Any] = js.undefined
    
    var createTransformer: js.UndefOr[js.Function1[/* template */ String, Transformer]] = js.undefined
    
    var getAnimatableNone: js.UndefOr[js.Function1[/* v */ Any, Any]] = js.undefined
    
    def parse(v: Any): Any
    
    def test(v: Any): Boolean
    
    var transform: js.UndefOr[Transformer] = js.undefined
  }
  object ValueType {
    
    inline def apply(parse: Any => Any, test: Any => Boolean): ValueType = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), test = js.Any.fromFunction1(test))
      __obj.asInstanceOf[ValueType]
    }
    
    extension [Self <: ValueType](x: Self) {
      
      inline def setCreateTransformer(value: /* template */ String => Transformer): Self = StObject.set(x, "createTransformer", js.Any.fromFunction1(value))
      
      inline def setCreateTransformerUndefined: Self = StObject.set(x, "createTransformer", js.undefined)
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setGetAnimatableNone(value: /* v */ Any => Any): Self = StObject.set(x, "getAnimatableNone", js.Any.fromFunction1(value))
      
      inline def setGetAnimatableNoneUndefined: Self = StObject.set(x, "getAnimatableNone", js.undefined)
      
      inline def setParse(value: Any => Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setTest(value: Any => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
      
      inline def setTransform(value: /* v */ Any => Any): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}
