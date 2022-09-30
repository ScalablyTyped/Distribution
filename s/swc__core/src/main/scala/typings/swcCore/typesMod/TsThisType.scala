package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsThisType
  extends StObject
     with Node
     with HasSpan
     with TsThisTypeOrIdent
     with TsType {
  
  @JSName("type")
  var type_TsThisType: typings.swcCore.swcCoreStrings.TsThisType
}
object TsThisType {
  
  inline def apply(span: Span): TsThisType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsThisType")
    __obj.asInstanceOf[TsThisType]
  }
  
  extension [Self <: TsThisType](x: Self) {
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsThisType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
