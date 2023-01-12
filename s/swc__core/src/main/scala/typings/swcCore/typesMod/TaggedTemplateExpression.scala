package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaggedTemplateExpression
  extends StObject
     with ExpressionBase
     with Expression {
  
  var tag: Expression
  
  var template: TemplateLiteral
  
  var typeParameters: js.UndefOr[TsTypeParameterInstantiation] = js.undefined
  
  @JSName("type")
  var type_TaggedTemplateExpression: typings.swcCore.swcCoreStrings.TaggedTemplateExpression
}
object TaggedTemplateExpression {
  
  inline def apply(span: Span, tag: Expression, template: TemplateLiteral): TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[TaggedTemplateExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaggedTemplateExpression] (val x: Self) extends AnyVal {
    
    inline def setTag(value: Expression): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: TemplateLiteral): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TaggedTemplateExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TsTypeParameterInstantiation): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
