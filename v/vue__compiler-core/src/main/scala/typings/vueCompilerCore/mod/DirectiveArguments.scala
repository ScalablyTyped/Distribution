package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`17`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectiveArguments extends ArrayExpression {
  
  @JSName("elements")
  var elements_DirectiveArguments: js.Array[DirectiveArgumentNode] = js.native
}
object DirectiveArguments {
  
  @scala.inline
  def apply(elements: js.Array[DirectiveArgumentNode], loc: SourceLocation, `type`: `17`): DirectiveArguments = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveArguments]
  }
  
  @scala.inline
  implicit class DirectiveArgumentsMutableBuilder[Self <: DirectiveArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[DirectiveArgumentNode]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: DirectiveArgumentNode*): Self = StObject.set(x, "elements", js.Array(value :_*))
  }
}
