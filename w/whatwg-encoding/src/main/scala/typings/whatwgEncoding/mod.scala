package typings.whatwgEncoding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("whatwg-encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(uint8Array: js.typedarray.Uint8Array, fallbackEncodingName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(uint8Array.asInstanceOf[js.Any], fallbackEncodingName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getBOMEncoding(uint8Array: js.typedarray.Uint8Array): BOMEncoding | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBOMEncoding")(uint8Array.asInstanceOf[js.Any]).asInstanceOf[BOMEncoding | Null]
  
  inline def isSupported(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def labelToName(label: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("labelToName")(label.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typings.whatwgEncoding.whatwgEncodingStrings.`UTF-16BE`
    - typings.whatwgEncoding.whatwgEncodingStrings.`UTF-16LE`
    - typings.whatwgEncoding.whatwgEncodingStrings.`UTF-8`
  */
  trait BOMEncoding extends StObject
  object BOMEncoding {
    
    inline def `UTF-16BE`: typings.whatwgEncoding.whatwgEncodingStrings.`UTF-16BE` = "UTF-16BE".asInstanceOf[typings.whatwgEncoding.whatwgEncodingStrings.`UTF-16BE`]
    
    inline def `UTF-16LE`: typings.whatwgEncoding.whatwgEncodingStrings.`UTF-16LE` = "UTF-16LE".asInstanceOf[typings.whatwgEncoding.whatwgEncodingStrings.`UTF-16LE`]
    
    inline def `UTF-8`: typings.whatwgEncoding.whatwgEncodingStrings.`UTF-8` = "UTF-8".asInstanceOf[typings.whatwgEncoding.whatwgEncodingStrings.`UTF-8`]
  }
}
