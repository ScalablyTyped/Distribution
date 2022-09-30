package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassPropertyBase
  extends StObject
     with Node
     with HasSpan
     with HasDecorator {
  
  var accessibility: js.UndefOr[Accessibility] = js.undefined
  
  var definite: Boolean
  
  var isOptional: Boolean
  
  var isOverride: Boolean
  
  var isStatic: Boolean
  
  var readonly: Boolean
  
  var typeAnnotation: js.UndefOr[TsTypeAnnotation] = js.undefined
  
  var value: js.UndefOr[Expression] = js.undefined
}
object ClassPropertyBase {
  
  inline def apply(
    definite: Boolean,
    isOptional: Boolean,
    isOverride: Boolean,
    isStatic: Boolean,
    readonly: Boolean,
    span: Span,
    `type`: String
  ): ClassPropertyBase = {
    val __obj = js.Dynamic.literal(definite = definite.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], isOverride = isOverride.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassPropertyBase]
  }
  
  extension [Self <: ClassPropertyBase](x: Self) {
    
    inline def setAccessibility(value: Accessibility): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    inline def setDefinite(value: Boolean): Self = StObject.set(x, "definite", value.asInstanceOf[js.Any])
    
    inline def setIsOptional(value: Boolean): Self = StObject.set(x, "isOptional", value.asInstanceOf[js.Any])
    
    inline def setIsOverride(value: Boolean): Self = StObject.set(x, "isOverride", value.asInstanceOf[js.Any])
    
    inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TsTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
    
    inline def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
