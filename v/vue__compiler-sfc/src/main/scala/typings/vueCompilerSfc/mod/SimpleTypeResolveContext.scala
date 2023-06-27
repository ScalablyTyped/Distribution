package typings.vueCompilerSfc.mod

import typings.babelTypes.mod.Node
import typings.babelTypes.mod.Statement
import typings.std.NonNullable
import typings.std.Set
import typings.vueCompilerSfc.anon.FileExists
import typings.vueCompilerSfc.anon.PartialSFCScriptCompileOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@vue/compiler-sfc.@vue/compiler-sfc.ScriptCompileContext, 'source' | 'filename' | 'error' | 'options'> & std.Partial<std.Pick<@vue/compiler-sfc.@vue/compiler-sfc.ScriptCompileContext, 'scope' | 'globalScopes' | 'deps' | 'fs'>> & {  ast :std.Array<@babel/types.@babel/types.Statement>} */
trait SimpleTypeResolveContext
  extends StObject
     with TypeResolveContext {
  
  var ast: js.Array[Statement]
  
  var deps: js.UndefOr[Set[String]] = js.undefined
  
  def error(msg: String, node: Node): scala.Nothing
  def error(msg: String, node: Node, scope: TypeScope): scala.Nothing
  @JSName("error")
  var error_Original: js.Function3[/* msg */ String, /* node */ Node, /* scope */ js.UndefOr[TypeScope], scala.Nothing]
  
  var filename: String
  
  var fs: js.UndefOr[NonNullable[js.UndefOr[FileExists]]] = js.undefined
  
  var globalScopes: js.UndefOr[js.Array[TypeScope]] = js.undefined
  
  var options: PartialSFCScriptCompileOp
  
  var scope: js.UndefOr[TypeScope] = js.undefined
  
  var source: String
}
object SimpleTypeResolveContext {
  
  inline def apply(
    ast: js.Array[Statement],
    error: (/* msg */ String, /* node */ Node, /* scope */ js.UndefOr[TypeScope]) => scala.Nothing,
    filename: String,
    options: PartialSFCScriptCompileOp,
    source: String
  ): SimpleTypeResolveContext = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], error = js.Any.fromFunction3(error), filename = filename.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleTypeResolveContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SimpleTypeResolveContext] (val x: Self) extends AnyVal {
    
    inline def setAst(value: js.Array[Statement]): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    inline def setAstVarargs(value: Statement*): Self = StObject.set(x, "ast", js.Array(value*))
    
    inline def setDeps(value: Set[String]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    inline def setError(value: (/* msg */ String, /* node */ Node, /* scope */ js.UndefOr[TypeScope]) => scala.Nothing): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFs(value: NonNullable[js.UndefOr[FileExists]]): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
    
    inline def setGlobalScopes(value: js.Array[TypeScope]): Self = StObject.set(x, "globalScopes", value.asInstanceOf[js.Any])
    
    inline def setGlobalScopesUndefined: Self = StObject.set(x, "globalScopes", js.undefined)
    
    inline def setGlobalScopesVarargs(value: TypeScope*): Self = StObject.set(x, "globalScopes", js.Array(value*))
    
    inline def setOptions(value: PartialSFCScriptCompileOp): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setScope(value: TypeScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
