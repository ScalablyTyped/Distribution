package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsTypeParameter
  extends StObject
     with Node
     with HasSpan {
  
  var default: js.UndefOr[TsType] = js.undefined
  
  var constraint: js.UndefOr[TsType] = js.undefined
  
  var in: Boolean
  
  var name: Identifier
  
  var out: Boolean
  
  @JSName("type")
  var type_TsTypeParameter: typings.swcCore.swcCoreStrings.TsTypeParameter
}
object TsTypeParameter {
  
  inline def apply(in: Boolean, name: Identifier, out: Boolean, span: Span): TsTypeParameter = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeParameter")
    __obj.asInstanceOf[TsTypeParameter]
  }
  
  extension [Self <: TsTypeParameter](x: Self) {
    
    inline def setConstraint(value: TsType): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setConstraintUndefined: Self = StObject.set(x, "constraint", js.undefined)
    
    inline def setDefault(value: TsType): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setName(value: Identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOut(value: Boolean): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsTypeParameter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
