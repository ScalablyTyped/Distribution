package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Decode extends StObject {
  
  var decode: js.Any = js.native
  
  var encode: js.Any = js.native
  
  var format: js.Any = js.native
  
  var parse: js.Any = js.native
}
object Decode {
  
  @scala.inline
  def apply(decode: js.Any, encode: js.Any, format: js.Any, parse: js.Any): Decode = {
    val __obj = js.Dynamic.literal(decode = decode.asInstanceOf[js.Any], encode = encode.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decode]
  }
  
  @scala.inline
  implicit class DecodeMutableBuilder[Self <: Decode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecode(value: js.Any): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncode(value: js.Any): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: js.Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: js.Any): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
  }
}
