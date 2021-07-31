package typings.stylableCore.anon

import typings.stylableCore.stylableValueParsersMod.ExtendsValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ast extends StObject {
  
  var ast: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify postcssValueParser.ParsedValue */ js.Any
  
  var types: js.Array[ExtendsValue]
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
  implicit class AstMutableBuilder[Self <: Ast] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAst(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify postcssValueParser.ParsedValue */ js.Any
    ): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Array[ExtendsValue]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: ExtendsValue*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
