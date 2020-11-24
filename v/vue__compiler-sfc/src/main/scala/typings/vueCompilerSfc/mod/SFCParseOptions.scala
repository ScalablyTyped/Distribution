package typings.vueCompilerSfc.mod

import typings.vueCompilerSfc.vueCompilerSfcStrings.line
import typings.vueCompilerSfc.vueCompilerSfcStrings.space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCParseOptions extends js.Object {
  
  var compiler: js.UndefOr[TemplateCompiler] = js.native
  
  var filename: js.UndefOr[String] = js.native
  
  var pad: js.UndefOr[Boolean | line | space] = js.native
  
  var sourceMap: js.UndefOr[Boolean] = js.native
  
  var sourceRoot: js.UndefOr[String] = js.native
}
object SFCParseOptions {
  
  @scala.inline
  def apply(): SFCParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SFCParseOptions]
  }
  
  @scala.inline
  implicit class SFCParseOptionsOps[Self <: SFCParseOptions] (val x: Self) extends AnyVal {
    
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
    def setCompiler(value: TemplateCompiler): Self = this.set("compiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompiler: Self = this.set("compiler", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setPad(value: Boolean | line | space): Self = this.set("pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
    
    @scala.inline
    def setSourceMap(value: Boolean): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
    
    @scala.inline
    def setSourceRoot(value: String): Self = this.set("sourceRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceRoot: Self = this.set("sourceRoot", js.undefined)
  }
}
