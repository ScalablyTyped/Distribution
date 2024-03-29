package typings.yaml.anon

import typings.yaml.distParseCstMod.SourceToken
import typings.yaml.distParseCstMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var key: js.UndefOr[scala.Nothing] = js.undefined
  
  var sep: js.UndefOr[scala.Nothing] = js.undefined
  
  var start: js.Array[SourceToken]
  
  var value: js.UndefOr[Token] = js.undefined
}
object Value {
  
  inline def apply(start: js.Array[SourceToken]): Value = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    inline def setStart(value: js.Array[SourceToken]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartVarargs(value: SourceToken*): Self = StObject.set(x, "start", js.Array(value*))
    
    inline def setValue(value: Token): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
