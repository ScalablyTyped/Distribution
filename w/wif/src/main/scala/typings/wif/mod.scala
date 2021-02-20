package typings.wif

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wif", "decode")
  @js.native
  def decode(string: String): WIFReturn = js.native
  @JSImport("wif", "decode")
  @js.native
  def decode(string: String, version: Double): WIFReturn = js.native
  
  @JSImport("wif", "decodeRaw")
  @js.native
  def decodeRaw(buffer: Buffer): WIFReturn = js.native
  @JSImport("wif", "decodeRaw")
  @js.native
  def decodeRaw(buffer: Buffer, version: Double): WIFReturn = js.native
  
  @JSImport("wif", "encode")
  @js.native
  def encode(version: Double, privateKey: Buffer, compressed: Boolean): String = js.native
  
  @JSImport("wif", "encodeRaw")
  @js.native
  def encodeRaw(version: Double, privateKey: Buffer, compressed: Boolean): Buffer = js.native
  
  @js.native
  trait WIFReturn extends StObject {
    
    val compressed: Boolean = js.native
    
    val privateKey: Buffer = js.native
    
    val version: Double = js.native
  }
  object WIFReturn {
    
    @scala.inline
    def apply(compressed: Boolean, privateKey: Buffer, version: Double): WIFReturn = {
      val __obj = js.Dynamic.literal(compressed = compressed.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[WIFReturn]
    }
    
    @scala.inline
    implicit class WIFReturnMutableBuilder[Self <: WIFReturn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompressed(value: Boolean): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKey(value: Buffer): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
