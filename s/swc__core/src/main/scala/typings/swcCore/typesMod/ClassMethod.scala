package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassMethod
  extends StObject
     with ClassMethodBase
     with ClassMember {
  
  var key: PropertyName
  
  @JSName("type")
  var type_ClassMethod: typings.swcCore.swcCoreStrings.ClassMethod
}
object ClassMethod {
  
  inline def apply(
    function: Fn,
    isAbstract: Boolean,
    isOptional: Boolean,
    isOverride: Boolean,
    isStatic: Boolean,
    key: PropertyName,
    kind: MethodKind,
    span: Span
  ): ClassMethod = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any], isAbstract = isAbstract.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], isOverride = isOverride.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassMethod")
    __obj.asInstanceOf[ClassMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassMethod] (val x: Self) extends AnyVal {
    
    inline def setKey(value: PropertyName): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.ClassMethod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
