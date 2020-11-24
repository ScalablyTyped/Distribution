package typings.stylableCore.anon

import typings.stylableCore.stylableValueParsersMod.ExtendsValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ast extends js.Object {
  
  var ast: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify postcssValueParser.ParsedValue */ js.Any = js.native
  
  var types: js.Array[ExtendsValue] = js.native
}
object Ast {
  
  @scala.inline
  def apply(
    ast: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify postcssValueParser.ParsedValue */ js.Any,
    types: js.Array[ExtendsValue]
  ): Ast = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ast]
  }
  
  @scala.inline
  implicit class AstOps[Self <: Ast] (val x: Self) extends AnyVal {
    
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
    def setAst(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify postcssValueParser.ParsedValue */ js.Any
    ): Self = this.set("ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: ExtendsValue*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[ExtendsValue]): Self = this.set("types", value.asInstanceOf[js.Any])
  }
}
