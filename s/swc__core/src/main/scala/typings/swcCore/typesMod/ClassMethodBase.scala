package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassMethodBase
  extends StObject
     with Node
     with HasSpan {
  
  var accessibility: js.UndefOr[Accessibility] = js.undefined
  
  var function: Fn
  
  var isAbstract: Boolean
  
  var isOptional: Boolean
  
  var isOverride: Boolean
  
  var isStatic: Boolean
  
  var kind: MethodKind
}
object ClassMethodBase {
  
  inline def apply(
    function: Fn,
    isAbstract: Boolean,
    isOptional: Boolean,
    isOverride: Boolean,
    isStatic: Boolean,
    kind: MethodKind,
    span: Span,
    `type`: String
  ): ClassMethodBase = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any], isAbstract = isAbstract.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], isOverride = isOverride.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassMethodBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassMethodBase] (val x: Self) extends AnyVal {
    
    inline def setAccessibility(value: Accessibility): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    inline def setFunction(value: Fn): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setIsAbstract(value: Boolean): Self = StObject.set(x, "isAbstract", value.asInstanceOf[js.Any])
    
    inline def setIsOptional(value: Boolean): Self = StObject.set(x, "isOptional", value.asInstanceOf[js.Any])
    
    inline def setIsOverride(value: Boolean): Self = StObject.set(x, "isOverride", value.asInstanceOf[js.Any])
    
    inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
    
    inline def setKind(value: MethodKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
