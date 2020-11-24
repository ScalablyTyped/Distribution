package typings.vueDocgenApi.parseMod

import typings.vueDocgenApi.vueDocgenApiStrings.js_
import typings.vueDocgenApi.vueDocgenApiStrings.ts
import typings.vueInbrowserCompilerUtils.typesMod.Descriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseOptions
  extends DocGenOptions
     with Descriptor {
  
  var filePath: String = js.native
  
  /**
    * In what language is the component written
    * @default undefined - let the system decide
    */
  var lang: js.UndefOr[ts | js_] = js.native
  
  @JSName("validExtends")
  def validExtends_MParseOptions(fullFilePath: String): Boolean = js.native
}
object ParseOptions {
  
  @scala.inline
  def apply(filePath: String, validExtends: String => Boolean): ParseOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], validExtends = js.Any.fromFunction1(validExtends))
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
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidExtends(value: String => Boolean): Self = this.set("validExtends", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLang(value: ts | js_): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
  }
}
