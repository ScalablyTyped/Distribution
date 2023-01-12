package typings.wif

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wif", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(string: String): WIFReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(string.asInstanceOf[js.Any]).asInstanceOf[WIFReturn]
  inline def decode(string: String, version: Double): WIFReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(string.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[WIFReturn]
  
  inline def decodeRaw(buffer: Buffer): WIFReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeRaw")(buffer.asInstanceOf[js.Any]).asInstanceOf[WIFReturn]
  inline def decodeRaw(buffer: Buffer, version: Double): WIFReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeRaw")(buffer.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[WIFReturn]
  
  inline def encode(version: Double, privateKey: Buffer, compressed: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(version.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeRaw(version: Double, privateKey: Buffer, compressed: Boolean): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeRaw")(version.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  trait WIFReturn extends StObject {
    
    val compressed: Boolean
    
    val privateKey: Buffer
    
    val version: Double
  }
  object WIFReturn {
    
    inline def apply(compressed: Boolean, privateKey: Buffer, version: Double): WIFReturn = {
      val __obj = js.Dynamic.literal(compressed = compressed.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[WIFReturn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WIFReturn] (val x: Self) extends AnyVal {
      
      inline def setCompressed(value: Boolean): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
      
      inline def setPrivateKey(value: Buffer): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
