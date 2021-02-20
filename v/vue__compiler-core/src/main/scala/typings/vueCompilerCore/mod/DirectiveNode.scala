package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectiveNode extends Node2 {
  
  var arg: js.UndefOr[ExpressionNode] = js.native
  
  var exp: js.UndefOr[ExpressionNode] = js.native
  
  var modifiers: js.Array[String] = js.native
  
  var name: String = js.native
  
  /**
    * optional property to cache the expression parse result for v-for
    */
  var parseResult: js.UndefOr[ForParseResult] = js.native
  
  @JSName("type")
  var type_DirectiveNode: `7` = js.native
}
object DirectiveNode {
  
  @scala.inline
  def apply(loc: SourceLocation, modifiers: js.Array[String], name: String, `type`: `7`): DirectiveNode = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], modifiers = modifiers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveNode]
  }
  
  @scala.inline
  implicit class DirectiveNodeMutableBuilder[Self <: DirectiveNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArg(value: ExpressionNode): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgUndefined: Self = StObject.set(x, "arg", js.undefined)
    
    @scala.inline
    def setExp(value: ExpressionNode): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpUndefined: Self = StObject.set(x, "exp", js.undefined)
    
    @scala.inline
    def setModifiers(value: js.Array[String]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersVarargs(value: String*): Self = StObject.set(x, "modifiers", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseResult(value: ForParseResult): Self = StObject.set(x, "parseResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseResultUndefined: Self = StObject.set(x, "parseResult", js.undefined)
    
    @scala.inline
    def setType(value: `7`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
