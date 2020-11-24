package typings.vueComponentCompilerUtils.parseMod

import typings.vueComponentCompilerUtils.typesMod.VueTemplateCompiler
import typings.vueComponentCompilerUtils.typesMod.VueTemplateCompilerParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseOptions extends js.Object {
  
  var compiler: VueTemplateCompiler = js.native
  
  var compilerParseOptions: js.UndefOr[VueTemplateCompilerParseOptions] = js.native
  
  var filename: js.UndefOr[String] = js.native
  
  var needMap: js.UndefOr[Boolean] = js.native
  
  var source: String = js.native
  
  var sourceRoot: js.UndefOr[String] = js.native
}
object ParseOptions {
  
  @scala.inline
  def apply(compiler: VueTemplateCompiler, source: String): ParseOptions = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
  
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
    
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
    def setCompiler(value: VueTemplateCompiler): Self = this.set("compiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilerParseOptions(value: VueTemplateCompilerParseOptions): Self = this.set("compilerParseOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompilerParseOptions: Self = this.set("compilerParseOptions", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setNeedMap(value: Boolean): Self = this.set("needMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedMap: Self = this.set("needMap", js.undefined)
    
    @scala.inline
    def setSourceRoot(value: String): Self = this.set("sourceRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceRoot: Self = this.set("sourceRoot", js.undefined)
  }
}
