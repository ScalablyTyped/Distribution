package typings.strongDataUri

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("strong-data-uri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(uri: String): Buffer & DataURI = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(uri.asInstanceOf[js.Any]).asInstanceOf[Buffer & DataURI]
  
  inline def encode(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(input: String, mediatype: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any], mediatype.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(input: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def encode(input: Buffer, mediatype: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any], mediatype.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @js.native
  trait DataURI
    extends StObject
       with Buffer {
    
    var charset: String | Null = js.native
    
    var mediatype: String = js.native
    
    var mimetype: String = js.native
  }
}
