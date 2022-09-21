package typings.yaml.anon

import typings.yaml.cstMod.SourceToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait End extends StObject {
  
  var end: js.UndefOr[js.Array[SourceToken]] = js.undefined
  
  var implicitKey: js.UndefOr[Boolean] = js.undefined
  
  var inFlow: js.UndefOr[Boolean] = js.undefined
  
  var indent: Double
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[typings.yaml.scalarMod.Scalar.Type] = js.undefined
}
object End {
  
  inline def apply(indent: Double): End = {
    val __obj = js.Dynamic.literal(indent = indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
  
  extension [Self <: End](x: Self) {
    
    inline def setEnd(value: js.Array[SourceToken]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setEndVarargs(value: SourceToken*): Self = StObject.set(x, "end", js.Array(value*))
    
    inline def setImplicitKey(value: Boolean): Self = StObject.set(x, "implicitKey", value.asInstanceOf[js.Any])
    
    inline def setImplicitKeyUndefined: Self = StObject.set(x, "implicitKey", js.undefined)
    
    inline def setInFlow(value: Boolean): Self = StObject.set(x, "inFlow", value.asInstanceOf[js.Any])
    
    inline def setInFlowUndefined: Self = StObject.set(x, "inFlow", js.undefined)
    
    inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setType(value: typings.yaml.scalarMod.Scalar.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
