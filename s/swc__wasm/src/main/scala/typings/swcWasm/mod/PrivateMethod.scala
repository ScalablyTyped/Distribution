package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateMethod
  extends StObject
     with ClassMethodBase
     with ClassMember {
  
  var key: PrivateName
  
  @JSName("type")
  var type_PrivateMethod: typings.swcWasm.swcWasmStrings.PrivateMethod
}
object PrivateMethod {
  
  inline def apply(
    function: Fn,
    isAbstract: Boolean,
    isOptional: Boolean,
    isOverride: Boolean,
    isStatic: Boolean,
    key: PrivateName,
    kind: MethodKind,
    span: Span
  ): PrivateMethod = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any], isAbstract = isAbstract.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], isOverride = isOverride.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PrivateMethod")
    __obj.asInstanceOf[PrivateMethod]
  }
  
  extension [Self <: PrivateMethod](x: Self) {
    
    inline def setKey(value: PrivateName): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.PrivateMethod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
