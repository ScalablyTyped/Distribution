package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcWasm.mod.TsFunctionType
  - typings.swcWasm.mod.TsConstructorType
*/
trait TsFnOrConstructorType
  extends StObject
     with TsType
object TsFnOrConstructorType {
  
  inline def TsConstructorType(isAbstract: Boolean, params: js.Array[TsFnParameter], span: Span, typeAnnotation: TsTypeAnnotation): typings.swcWasm.mod.TsConstructorType = {
    val __obj = js.Dynamic.literal(isAbstract = isAbstract.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsConstructorType")
    __obj.asInstanceOf[typings.swcWasm.mod.TsConstructorType]
  }
  
  inline def TsFunctionType(params: js.Array[TsFnParameter], span: Span, typeAnnotation: TsTypeAnnotation): typings.swcWasm.mod.TsFunctionType = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsFunctionType")
    __obj.asInstanceOf[typings.swcWasm.mod.TsFunctionType]
  }
}
