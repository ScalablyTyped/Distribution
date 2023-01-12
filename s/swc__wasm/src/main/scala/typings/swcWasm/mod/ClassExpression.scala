package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.swcWasm.mod.HasSpan because Already inherited
- typings.swcWasm.mod.ExpressionBase because var conflicts: span. Inlined  */ trait ClassExpression
  extends StObject
     with Class
     with DefaultDecl
     with Expression
     with Node {
  
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  @JSName("type")
  var type_ClassExpression: typings.swcWasm.swcWasmStrings.ClassExpression
}
object ClassExpression {
  
  inline def apply(
    body: js.Array[ClassMember],
    implements: js.Array[TsExpressionWithTypeArguments],
    isAbstract: Boolean,
    span: Span
  ): ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], implements = implements.asInstanceOf[js.Any], isAbstract = isAbstract.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[ClassExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassExpression] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.ClassExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
