package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decode extends StObject {
  
  var decode: scala.Any
  
  var encode: scala.Any
  
  var format: scala.Any
  
  var parse: scala.Any
}
object Decode {
  
  inline def apply(decode: scala.Any, encode: scala.Any, format: scala.Any, parse: scala.Any): Decode = {
    val __obj = js.Dynamic.literal(decode = decode.asInstanceOf[js.Any], encode = encode.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decode]
  }
  
  extension [Self <: Decode](x: Self) {
    
    inline def setDecode(value: scala.Any): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
    
    inline def setEncode(value: scala.Any): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: scala.Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setParse(value: scala.Any): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
  }
}
