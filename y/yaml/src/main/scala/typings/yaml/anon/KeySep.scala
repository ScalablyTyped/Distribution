package typings.yaml.anon

import typings.yaml.cstMod.SourceToken
import typings.yaml.cstMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeySep extends StObject {
  
  var key: js.UndefOr[scala.Nothing] = js.undefined
  
  var sep: js.UndefOr[scala.Nothing] = js.undefined
  
  var start: js.Array[SourceToken]
  
  var value: js.UndefOr[Token] = js.undefined
}
object KeySep {
  
  inline def apply(start: js.Array[SourceToken]): KeySep = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeySep]
  }
  
  extension [Self <: KeySep](x: Self) {
    
    inline def setStart(value: js.Array[SourceToken]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartVarargs(value: SourceToken*): Self = StObject.set(x, "start", js.Array(value*))
    
    inline def setValue(value: Token): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
