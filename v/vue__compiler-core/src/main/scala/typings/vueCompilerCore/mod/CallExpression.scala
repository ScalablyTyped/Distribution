package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreInts.`14`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallExpression
  extends StObject
     with Node
     with JSChildNode
     with PropsExpression {
  
  var arguments: js.Array[
    String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
  ]
  
  var callee: String | js.Symbol
  
  @JSName("type")
  var type_CallExpression: `14`
}
object CallExpression {
  
  inline def apply(
    arguments: js.Array[
      String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
    ],
    callee: String | js.Symbol,
    loc: SourceLocation
  ): CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(14)
    __obj.asInstanceOf[CallExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallExpression] (val x: Self) extends AnyVal {
    
    inline def setArguments(
      value: js.Array[
          String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode]
        ]
    ): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(
      value: (String | js.Symbol | JSChildNode | SSRCodegenNode | TemplateChildNode | js.Array[TemplateChildNode])*
    ): Self = StObject.set(x, "arguments", js.Array(value*))
    
    inline def setCallee(value: String | js.Symbol): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    inline def setType(value: `14`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
