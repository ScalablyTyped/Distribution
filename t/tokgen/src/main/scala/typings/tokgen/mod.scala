package typings.tokgen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tokgen", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with TokenGenerator {
    def this(options: Options) = this()
  }
  
  type Callback = js.Function2[/* error */ js.Any, /* token */ String, Unit]
  
  type Options = Double | String | OptionsObject
  
  trait OptionsObject extends StObject {
    
    var chars: js.UndefOr[String] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
  }
  object OptionsObject {
    
    inline def apply(): OptionsObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsObject]
    }
    
    extension [Self <: OptionsObject](x: Self) {
      
      inline def setChars(value: String): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      inline def setCharsUndefined: Self = StObject.set(x, "chars", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    }
  }
  
  @js.native
  trait TokenGenerator extends StObject {
    
    def generate(): String = js.native
    def generate(callback: Callback): Unit = js.native
    def generate(length: Double): String = js.native
    def generate(length: Double, callback: Callback): Unit = js.native
  }
}
