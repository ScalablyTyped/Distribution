package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcWasm.mod.TsUnionType
  - typings.swcWasm.mod.TsIntersectionType
*/
trait TsUnionOrIntersectionType
  extends StObject
     with TsType
object TsUnionOrIntersectionType {
  
  inline def TsIntersectionType(span: Span, types: js.Array[TsType]): typings.swcWasm.mod.TsIntersectionType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsIntersectionType")
    __obj.asInstanceOf[typings.swcWasm.mod.TsIntersectionType]
  }
  
  inline def TsUnionType(span: Span, types: js.Array[TsType]): typings.swcWasm.mod.TsUnionType = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsUnionType")
    __obj.asInstanceOf[typings.swcWasm.mod.TsUnionType]
  }
}
