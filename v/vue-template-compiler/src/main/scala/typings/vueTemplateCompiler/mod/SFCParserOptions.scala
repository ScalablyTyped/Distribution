package typings.vueTemplateCompiler.mod

import typings.vueTemplateCompiler.vueTemplateCompilerBooleans.`true`
import typings.vueTemplateCompiler.vueTemplateCompilerStrings.line
import typings.vueTemplateCompiler.vueTemplateCompilerStrings.space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * SFC parser related types
  */
@js.native
trait SFCParserOptions extends js.Object {
  
  var deindent: js.UndefOr[Boolean] = js.native
  
  var pad: js.UndefOr[`true` | line | space] = js.native
}
object SFCParserOptions {
  
  @scala.inline
  def apply(): SFCParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SFCParserOptions]
  }
  
  @scala.inline
  implicit class SFCParserOptionsOps[Self <: SFCParserOptions] (val x: Self) extends AnyVal {
    
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
    def setDeindent(value: Boolean): Self = this.set("deindent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeindent: Self = this.set("deindent", js.undefined)
    
    @scala.inline
    def setPad(value: `true` | line | space): Self = this.set("pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
  }
}
