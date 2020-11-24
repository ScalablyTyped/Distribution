package typings.vueCompilerSfc.mod

import typings.babelTypes.mod.Statement
import typings.std.Record
import typings.vueCompilerCore.mod.BindingMetadata
import typings.vueCompilerCore.mod.SourceLocation
import typings.vueCompilerSfc.vueCompilerSfcBooleans.`true`
import typings.vueCompilerSfc.vueCompilerSfcStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCScriptBlock extends SFCBlock {
  
  var bindings: js.UndefOr[BindingMetadata] = js.native
  
  var scriptAst: js.UndefOr[js.Array[Statement]] = js.native
  
  var scriptSetupAst: js.UndefOr[js.Array[Statement]] = js.native
  
  var setup: js.UndefOr[String | Boolean] = js.native
  
  @JSName("type")
  var type_SFCScriptBlock: script = js.native
}
object SFCScriptBlock {
  
  @scala.inline
  def apply(attrs: Record[String, String | `true`], content: String, loc: SourceLocation, `type`: script): SFCScriptBlock = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCScriptBlock]
  }
  
  @scala.inline
  implicit class SFCScriptBlockOps[Self <: SFCScriptBlock] (val x: Self) extends AnyVal {
    
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
    def setType(value: script): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindings(value: BindingMetadata): Self = this.set("bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindings: Self = this.set("bindings", js.undefined)
    
    @scala.inline
    def setScriptAstVarargs(value: Statement*): Self = this.set("scriptAst", js.Array(value :_*))
    
    @scala.inline
    def setScriptAst(value: js.Array[Statement]): Self = this.set("scriptAst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptAst: Self = this.set("scriptAst", js.undefined)
    
    @scala.inline
    def setScriptSetupAstVarargs(value: Statement*): Self = this.set("scriptSetupAst", js.Array(value :_*))
    
    @scala.inline
    def setScriptSetupAst(value: js.Array[Statement]): Self = this.set("scriptSetupAst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptSetupAst: Self = this.set("scriptSetupAst", js.undefined)
    
    @scala.inline
    def setSetup(value: String | Boolean): Self = this.set("setup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetup: Self = this.set("setup", js.undefined)
  }
}
