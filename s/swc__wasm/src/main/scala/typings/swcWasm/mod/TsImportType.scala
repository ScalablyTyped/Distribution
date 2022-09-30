package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsImportType
  extends StObject
     with Node
     with HasSpan
     with TsType
     with TsTypeQueryExpr {
  
  var argument: StringLiteral
  
  var qualifier: js.UndefOr[TsEntityName] = js.undefined
  
  var typeArguments: js.UndefOr[TsTypeParameterInstantiation] = js.undefined
  
  @JSName("type")
  var type_TsImportType: typings.swcWasm.swcWasmStrings.TsImportType
}
object TsImportType {
  
  inline def apply(argument: StringLiteral, span: Span): TsImportType = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsImportType")
    __obj.asInstanceOf[TsImportType]
  }
  
  extension [Self <: TsImportType](x: Self) {
    
    inline def setArgument(value: StringLiteral): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setQualifier(value: TsEntityName): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
    
    inline def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsImportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeArguments(value: TsTypeParameterInstantiation): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
  }
}
