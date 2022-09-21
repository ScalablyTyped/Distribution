package typings.uzip

import org.scalablytyped.runtime.StringDictionary
import typings.uzip.anon.Csize
import typings.uzip.uzipBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uzip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deflate(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def deflate(data: js.typedarray.Uint8Array, options: UZIPOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def deflateRaw(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def deflateRaw(data: js.typedarray.Uint8Array, options: UZIPOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("deflateRaw")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encode(obj: UZIPFiles): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  inline def encode(obj: UZIPFiles, noCmpr: Boolean): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(obj.asInstanceOf[js.Any], noCmpr.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
  
  inline def inflate(file: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(file.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def inflate(file: js.typedarray.Uint8Array, outputBuffer: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(file.asInstanceOf[js.Any], outputBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def inflateRaw(file: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(file.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def inflateRaw(file: js.typedarray.Uint8Array, outputBuffer: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("inflateRaw")(file.asInstanceOf[js.Any], outputBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def parse(buf: js.typedarray.ArrayBuffer): UZIPFiles = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(buf.asInstanceOf[js.Any]).asInstanceOf[UZIPFiles]
  inline def parse(buf: js.typedarray.ArrayBuffer, onlyNames: Boolean): UZIPFiles = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(buf.asInstanceOf[js.Any], onlyNames.asInstanceOf[js.Any])).asInstanceOf[UZIPFiles]
  
  inline def parse_true(buf: js.typedarray.ArrayBuffer, onlyNames: `true`): UZIPSizeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(buf.asInstanceOf[js.Any], onlyNames.asInstanceOf[js.Any])).asInstanceOf[UZIPSizeInfo]
  
  type UZIPFiles = StringDictionary[js.typedarray.Uint8Array]
  
  trait UZIPOptions extends StObject {
    
    var level: Double
  }
  object UZIPOptions {
    
    inline def apply(level: Double): UZIPOptions = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[UZIPOptions]
    }
    
    extension [Self <: UZIPOptions](x: Self) {
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
  
  type UZIPSizeInfo = StringDictionary[Csize]
}
