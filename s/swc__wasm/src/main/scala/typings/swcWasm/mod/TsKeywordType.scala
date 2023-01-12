package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsKeywordType
  extends StObject
     with Node
     with HasSpan
     with TsType {
  
  var kind: TsKeywordTypeKind
  
  @JSName("type")
  var type_TsKeywordType: typings.swcWasm.swcWasmStrings.TsKeywordType
}
object TsKeywordType {
  
  inline def apply(kind: TsKeywordTypeKind, span: Span): TsKeywordType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsKeywordType")
    __obj.asInstanceOf[TsKeywordType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsKeywordType] (val x: Self) extends AnyVal {
    
    inline def setKind(value: TsKeywordTypeKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TsKeywordType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
