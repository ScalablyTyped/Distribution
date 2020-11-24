package typings.vueCompilerSfc.mod

import typings.babelParser.mod.ParserPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCScriptCompileOptions extends js.Object {
  
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
  implicit class SFCScriptCompileOptionsOps[Self <: SFCScriptCompileOptions] (val x: Self) extends AnyVal {
    
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
    def setBabelParserPluginsVarargs(value: ParserPlugin*): Self = this.set("babelParserPlugins", js.Array(value :_*))
    
    @scala.inline
    def setBabelParserPlugins(value: js.Array[ParserPlugin]): Self = this.set("babelParserPlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBabelParserPlugins: Self = this.set("babelParserPlugins", js.undefined)
  }
}
