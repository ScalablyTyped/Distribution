package typings.vueCompilerSfc.mod

import typings.sourceMap.mod.RawSourceMap
import typings.vueCompilerCore.mod.CompilerError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCTemplateCompileResults extends js.Object {
  
  var code: String = js.native
  
  var errors: js.Array[String | CompilerError] = js.native
  
  var map: js.UndefOr[RawSourceMap] = js.native
  
  var source: String = js.native
  
  var tips: js.Array[String] = js.native
}
object SFCTemplateCompileResults {
  
  @scala.inline
  def apply(code: String, errors: js.Array[String | CompilerError], source: String, tips: js.Array[String]): SFCTemplateCompileResults = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCTemplateCompileResults]
  }
  
  @scala.inline
  implicit class SFCTemplateCompileResultsOps[Self <: SFCTemplateCompileResults] (val x: Self) extends AnyVal {
    
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: (String | CompilerError)*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[String | CompilerError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTipsVarargs(value: String*): Self = this.set("tips", js.Array(value :_*))
    
    @scala.inline
    def setTips(value: js.Array[String]): Self = this.set("tips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: RawSourceMap): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
  }
}
