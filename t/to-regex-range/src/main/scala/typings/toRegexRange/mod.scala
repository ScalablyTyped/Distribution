package typings.toRegexRange

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(min: String): String = ^.asInstanceOf[js.Dynamic].apply(min.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(min: String, max: String): String = (^.asInstanceOf[js.Dynamic].apply(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(min: String, max: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(min: String, max: Double): String = (^.asInstanceOf[js.Dynamic].apply(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(min: String, max: Double, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(min: String, max: Unit, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(min: Double): String = ^.asInstanceOf[js.Dynamic].apply(min.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(min: Double, max: String): String = (^.asInstanceOf[js.Dynamic].apply(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(min: Double, max: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(min: Double, max: Double): String = (^.asInstanceOf[js.Dynamic].apply(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(min: Double, max: Double, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(min: Double, max: Unit, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("to-regex-range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var capture: js.UndefOr[Boolean] = js.undefined
    
    var relaxZeros: js.UndefOr[Boolean] = js.undefined
    
    var shorthand: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setRelaxZeros(value: Boolean): Self = StObject.set(x, "relaxZeros", value.asInstanceOf[js.Any])
      
      inline def setRelaxZerosUndefined: Self = StObject.set(x, "relaxZeros", js.undefined)
      
      inline def setShorthand(value: Boolean): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
      
      inline def setShorthandUndefined: Self = StObject.set(x, "shorthand", js.undefined)
    }
  }
}
