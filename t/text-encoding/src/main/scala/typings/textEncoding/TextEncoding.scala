package typings.textEncoding

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextEncoding {
  
  @js.native
  trait TextEncoderOptions extends StObject {
    
    var NONSTANDARD_allowLegacyEncoding: js.UndefOr[Boolean] = js.native
  }
  object TextEncoderOptions {
    
    @scala.inline
    def apply(): TextEncoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextEncoderOptions]
    }
    
    @scala.inline
    implicit class TextEncoderOptionsMutableBuilder[Self <: TextEncoderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNONSTANDARD_allowLegacyEncoding(value: Boolean): Self = StObject.set(x, "NONSTANDARD_allowLegacyEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNONSTANDARD_allowLegacyEncodingUndefined: Self = StObject.set(x, "NONSTANDARD_allowLegacyEncoding", js.undefined)
    }
  }
  
  @js.native
  trait TextEncoderStatic
    extends Instantiable0[TextEncoder]
       with Instantiable1[/* utfLabel */ String, TextEncoder]
       with Instantiable2[js.UndefOr[/* utfLabel */ String], /* options */ TextEncoderOptions, TextEncoder] {
    
    def apply(): TextEncoder = js.native
    def apply(utfLabel: js.UndefOr[scala.Nothing], options: TextEncoderOptions): TextEncoder = js.native
    def apply(utfLabel: String): TextEncoder = js.native
    def apply(utfLabel: String, options: TextEncoderOptions): TextEncoder = js.native
  }
}
