package typings.swcCore.typesMod

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
  var type_TsKeywordType: typings.swcCore.swcCoreStrings.TsKeywordType
}
object TsKeywordType {
  
  inline def apply(kind: TsKeywordTypeKind, span: Span): TsKeywordType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsKeywordType")
    __obj.asInstanceOf[TsKeywordType]
  }
  
  extension [Self <: TsKeywordType](x: Self) {
    
    inline def setKind(value: TsKeywordTypeKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsKeywordType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
