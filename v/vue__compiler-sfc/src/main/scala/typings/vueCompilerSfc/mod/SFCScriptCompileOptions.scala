package typings.vueCompilerSfc.mod

import typings.babelParser.mod.ParserPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SFCScriptCompileOptions extends StObject {
  
  /**
    * https://babeljs.io/docs/en/babel-parser#plugins
    */
  var babelParserPlugins: js.UndefOr[js.Array[ParserPlugin]] = js.undefined
}
object SFCScriptCompileOptions {
  
  inline def apply(): SFCScriptCompileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SFCScriptCompileOptions]
  }
  
  extension [Self <: SFCScriptCompileOptions](x: Self) {
    
    inline def setBabelParserPlugins(value: js.Array[ParserPlugin]): Self = StObject.set(x, "babelParserPlugins", value.asInstanceOf[js.Any])
    
    inline def setBabelParserPluginsUndefined: Self = StObject.set(x, "babelParserPlugins", js.undefined)
    
    inline def setBabelParserPluginsVarargs(value: ParserPlugin*): Self = StObject.set(x, "babelParserPlugins", js.Array(value :_*))
  }
}
