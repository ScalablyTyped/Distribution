package typings.vueCompilerSfc.mod

import typings.babelParser.mod.ParserPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCScriptCompileOptions extends StObject {
  
  /**
    * https://babeljs.io/docs/en/babel-parser#plugins
    */
  var babelParserPlugins: js.UndefOr[js.Array[ParserPlugin]] = js.native
}
object SFCScriptCompileOptions {
  
  @scala.inline
  def apply(): SFCScriptCompileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SFCScriptCompileOptions]
  }
  
  @scala.inline
  implicit class SFCScriptCompileOptionsMutableBuilder[Self <: SFCScriptCompileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBabelParserPlugins(value: js.Array[ParserPlugin]): Self = StObject.set(x, "babelParserPlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBabelParserPluginsUndefined: Self = StObject.set(x, "babelParserPlugins", js.undefined)
    
    @scala.inline
    def setBabelParserPluginsVarargs(value: ParserPlugin*): Self = StObject.set(x, "babelParserPlugins", js.Array(value :_*))
  }
}
