package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsTypeParameterDeclaration
  extends StObject
     with Node
     with HasSpan {
  
  var parameters: js.Array[TsTypeParameter]
  
  @JSName("type")
  var type_TsTypeParameterDeclaration: typings.swcCore.swcCoreStrings.TsTypeParameterDeclaration
}
object TsTypeParameterDeclaration {
  
  inline def apply(parameters: js.Array[TsTypeParameter], span: Span): TsTypeParameterDeclaration = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTypeParameterDeclaration")
    __obj.asInstanceOf[TsTypeParameterDeclaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsTypeParameterDeclaration] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: js.Array[TsTypeParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: TsTypeParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsTypeParameterDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
