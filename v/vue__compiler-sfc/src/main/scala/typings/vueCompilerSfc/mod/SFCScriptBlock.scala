package typings.vueCompilerSfc.mod

import typings.babelTypes.mod.Statement
import typings.std.Record
import typings.vueCompilerCore.mod.BindingMetadata
import typings.vueCompilerCore.mod.SourceLocation
import typings.vueCompilerSfc.vueCompilerSfcBooleans.`true`
import typings.vueCompilerSfc.vueCompilerSfcStrings.script
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SFCScriptBlock
  extends StObject
     with SFCBlock {
  
  var bindings: js.UndefOr[BindingMetadata] = js.undefined
  
  /**
    * Fully resolved dependency file paths (unix slashes) with imported types
    * used in macros, used for HMR cache busting in @vitejs/plugin-vue and
    * vue-loader.
    */
  var deps: js.UndefOr[js.Array[String]] = js.undefined
  
  var imports: js.UndefOr[Record[String, ImportBinding]] = js.undefined
  
  var scriptAst: js.UndefOr[js.Array[Statement]] = js.undefined
  
  var scriptSetupAst: js.UndefOr[js.Array[Statement]] = js.undefined
  
  var setup: js.UndefOr[String | Boolean] = js.undefined
  
  @JSName("type")
  var type_SFCScriptBlock: script
  
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}
object SFCScriptBlock {
  
  inline def apply(attrs: Record[String, String | `true`], content: String, loc: SourceLocation): SFCScriptBlock = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("script")
    __obj.asInstanceOf[SFCScriptBlock]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SFCScriptBlock] (val x: Self) extends AnyVal {
    
    inline def setBindings(value: BindingMetadata): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    inline def setDeps(value: js.Array[String]): Self = StObject.set(x, "deps", value.asInstanceOf[js.Any])
    
    inline def setDepsUndefined: Self = StObject.set(x, "deps", js.undefined)
    
    inline def setDepsVarargs(value: String*): Self = StObject.set(x, "deps", js.Array(value*))
    
    inline def setImports(value: Record[String, ImportBinding]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setScriptAst(value: js.Array[Statement]): Self = StObject.set(x, "scriptAst", value.asInstanceOf[js.Any])
    
    inline def setScriptAstUndefined: Self = StObject.set(x, "scriptAst", js.undefined)
    
    inline def setScriptAstVarargs(value: Statement*): Self = StObject.set(x, "scriptAst", js.Array(value*))
    
    inline def setScriptSetupAst(value: js.Array[Statement]): Self = StObject.set(x, "scriptSetupAst", value.asInstanceOf[js.Any])
    
    inline def setScriptSetupAstUndefined: Self = StObject.set(x, "scriptSetupAst", js.undefined)
    
    inline def setScriptSetupAstVarargs(value: Statement*): Self = StObject.set(x, "scriptSetupAst", js.Array(value*))
    
    inline def setSetup(value: String | Boolean): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
    
    inline def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
    
    inline def setType(value: script): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
