package typings.yaml.anon

import typings.yaml.cstMod.SourceToken
import typings.yaml.cstMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Start extends StObject {
  
  var key: Token | Null
  
  var sep: js.Array[SourceToken]
  
  var start: js.Array[SourceToken]
  
  var value: js.UndefOr[Token] = js.undefined
}
object Start {
  
  inline def apply(sep: js.Array[SourceToken], start: js.Array[SourceToken]): Start = {
    val __obj = js.Dynamic.literal(sep = sep.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], key = null)
    __obj.asInstanceOf[Start]
  }
  
  extension [Self <: Start](x: Self) {
    
    inline def setKey(value: Token): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setSep(value: js.Array[SourceToken]): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
    
    inline def setSepVarargs(value: SourceToken*): Self = StObject.set(x, "sep", js.Array(value*))
    
    inline def setStart(value: js.Array[SourceToken]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartVarargs(value: SourceToken*): Self = StObject.set(x, "start", js.Array(value*))
    
    inline def setValue(value: Token): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
