package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringLiteral
  extends StObject
     with Node
     with HasSpan
     with Literal
     with ModuleExportName
     with PropertyName
     with TsEnumMemberId
     with TsLiteral
     with TsModuleName {
  
  var raw: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_StringLiteral: typings.swcWasm.swcWasmStrings.StringLiteral
  
  var value: String
}
object StringLiteral {
  
  inline def apply(span: Span, value: String): StringLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[StringLiteral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringLiteral] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.StringLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
