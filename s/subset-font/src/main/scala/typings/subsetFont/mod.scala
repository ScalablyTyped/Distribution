package typings.subsetFont

import typings.node.bufferMod.global.Buffer
import typings.subsetFont.subsetFontStrings.sfnt
import typings.subsetFont.subsetFontStrings.truetype
import typings.subsetFont.subsetFontStrings.woff
import typings.subsetFont.subsetFontStrings.woff2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a subset font from an existing font in SFNT (TrueType/OpenType), WOFF, or WOFF2 format.
    *
    * @param buffer A buffer containing the original font to subset.
    * @param text A string of characters to subset the original font to.
    * @param options Additional options to configure the subsetter with.
    */
  inline def apply(buffer: Buffer, text: String): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  inline def apply(buffer: Buffer, text: String, options: SubsetFontOptions): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  @JSImport("subset-font", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Object for adjusting options on subset-font output.
    */
  trait SubsetFontOptions extends StObject {
    
    /**
      * An array of numbers specifying the extra name ids to preserve in the name table. See README for details.
      */
    var preserveNameIds: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The desired output format. Defaults to the format of the original font.
      */
    var targetFormat: js.UndefOr[sfnt | woff | woff2 | truetype] = js.undefined
  }
  object SubsetFontOptions {
    
    inline def apply(): SubsetFontOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubsetFontOptions]
    }
    
    extension [Self <: SubsetFontOptions](x: Self) {
      
      inline def setPreserveNameIds(value: js.Array[Double]): Self = StObject.set(x, "preserveNameIds", value.asInstanceOf[js.Any])
      
      inline def setPreserveNameIdsUndefined: Self = StObject.set(x, "preserveNameIds", js.undefined)
      
      inline def setPreserveNameIdsVarargs(value: Double*): Self = StObject.set(x, "preserveNameIds", js.Array(value*))
      
      inline def setTargetFormat(value: sfnt | woff | woff2 | truetype): Self = StObject.set(x, "targetFormat", value.asInstanceOf[js.Any])
      
      inline def setTargetFormatUndefined: Self = StObject.set(x, "targetFormat", js.undefined)
    }
  }
}
