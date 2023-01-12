package typings.textEncoding

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextEncoding {
  
  trait TextEncoderOptions extends StObject {
    
    var NONSTANDARD_allowLegacyEncoding: js.UndefOr[Boolean] = js.undefined
  }
  object TextEncoderOptions {
    
    inline def apply(): TextEncoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextEncoderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextEncoderOptions] (val x: Self) extends AnyVal {
      
      inline def setNONSTANDARD_allowLegacyEncoding(value: Boolean): Self = StObject.set(x, "NONSTANDARD_allowLegacyEncoding", value.asInstanceOf[js.Any])
      
      inline def setNONSTANDARD_allowLegacyEncodingUndefined: Self = StObject.set(x, "NONSTANDARD_allowLegacyEncoding", js.undefined)
    }
  }
  
  @js.native
  trait TextEncoderStatic
    extends StObject
       with Instantiable0[TextEncoder]
       with Instantiable1[/* utfLabel */ String, TextEncoder]
       with Instantiable2[
          (/* utfLabel */ String) | (/* utfLabel */ Unit), 
          /* options */ TextEncoderOptions, 
          TextEncoder
        ] {
    
    def apply(): TextEncoder = js.native
    def apply(utfLabel: String): TextEncoder = js.native
    def apply(utfLabel: String, options: TextEncoderOptions): TextEncoder = js.native
    def apply(utfLabel: Unit, options: TextEncoderOptions): TextEncoder = js.native
  }
}
