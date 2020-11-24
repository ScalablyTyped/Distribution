package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`7`
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
  implicit class DirectiveNodeOps[Self <: DirectiveNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setModifiersVarargs(value: String*): Self = this.set("modifiers", js.Array(value :_*))
    
    @scala.inline
    def setModifiers(value: js.Array[String]): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `7`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArg(value: ExpressionNode): Self = this.set("arg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArg: Self = this.set("arg", js.undefined)
    
    @scala.inline
    def setExp(value: ExpressionNode): Self = this.set("exp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExp: Self = this.set("exp", js.undefined)
    
    @scala.inline
    def setParseResult(value: ForParseResult): Self = this.set("parseResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParseResult: Self = this.set("parseResult", js.undefined)
  }
}
