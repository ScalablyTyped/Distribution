package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WordAck extends StObject {
  
  var word: String
}
object WordAck {
  
  inline def apply(word: String): WordAck = {
    val __obj = js.Dynamic.literal(word = word.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordAck]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WordAck] (val x: Self) extends AnyVal {
    
    inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
  }
}
